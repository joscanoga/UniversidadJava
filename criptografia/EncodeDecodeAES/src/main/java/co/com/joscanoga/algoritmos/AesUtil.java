
package co.com.joscanoga.algoritmos;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Properties;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.properties.PropertyValueEncryptionUtils;
import org.jasypt.salt.RandomSaltGenerator;



/**
 * Utilidad para cifrado y descifrado utilizando AES-256 en modo GCM.
 * Proporciona m�todos para cifrar y descifrar texto plano basado en una clave y un vector de inicializaci�n dados.
 *
 * @author David Corredor R.
 */
public class AesUtil {

    private static final String ENCRYPTION_ALGORITHM = "AES/GCM/NoPadding";
    private static final int KEY_SIZE = 32; // 256 bits
    private static final int T_LEN = 128;   // Tama�o de la autenticaci�n en bits
    private static final int IV_LENGTH = 12; // 12 bytes son recomendados para GCM
    private static final String UTF_8_CAPS = "UTF-8";
    private static final String UTF_8 = "utf-8";
    private static StandardPBEStringEncryptor propEncryptUtil;
    private static SecretKey key;
    private static byte[] keyBytes;
    private static byte[] iv;
    private static String keyProp;
    private static String ivProp;

    private static boolean isInitialized;
    private static Properties prop = null;

    public static void init() {
        validateIV(iv);
        validateKey(keyBytes);
        key = new SecretKeySpec(keyBytes, "AES");
        isInitialized = true;
    }

    /**
     * Cifra el texto plano dado usando AES-256 GCM con la clave y el IV especificados.
     *
     * @param plainText Texto plano a cifrar.
     * @return Texto cifrado codificado en Base64.
     */
    public static String encrypt(String plainText) {
		try {
			afterPropertiesSet();
			checkInitialized();
			Cipher cipher = initCipher(Cipher.ENCRYPT_MODE);
			byte[] cipherText = cipher.doFinal(plainText.getBytes(UTF_8));
			return new String(Base64.encodeBase64(cipherText), UTF_8_CAPS);
		} catch (Exception e) {
		System.out.println("e = " + e);
		}
		return null;
    }

    /**
     * Descifra el texto cifrado dado usando AES-256 GCM con la clave y el IV especificados.
     *
     * @param encryptedText Texto cifrado en Base64 a descifrar.
     * @return Texto plano descifrado.
     */
	public static String decrypt(String encryptedText) {
		try {
			afterPropertiesSet();
			checkInitialized();
			Cipher cipher = initCipher(Cipher.DECRYPT_MODE);
			byte[] decodedText = Base64.decodeBase64(encryptedText.getBytes());
			byte[] decryptedText = cipher.doFinal(decodedText);
			return new String(decryptedText, UTF_8_CAPS);
		} catch (Exception e) {
		                  System.out.println("e = " + e);
		}
		return null;
    }

    /**
     * Inicializa y devuelve una instancia de Cipher para cifrado o descifrado.
     *
     * @param mode El modo de cifrado (Cipher.ENCRYPT_MODE o Cipher.DECRYPT_MODE).
     * @return La instancia de Cipher configurada.
     * @throws NoSuchAlgorithmException           Si no se puede inicializar el Cipher debido a un algoritmo de cifrado inexistente.
     * @throws NoSuchPaddingException             Si se solicita un tipo de padding desconocido.
     * @throws InvalidKeyException                Si las llaves proporcionadas no son v�lidas.
     * @throws InvalidAlgorithmParameterException Si los par�metros del algoritmo no son v�lidos.
     */
    private static Cipher initCipher(int mode) throws InvalidAlgorithmParameterException, InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException {
        Cipher cipher = Cipher.getInstance(ENCRYPTION_ALGORITHM);
        GCMParameterSpec spec = new GCMParameterSpec(T_LEN, iv);
        cipher.init(mode, key, spec);
        return cipher;
    }

    /**
     * Valida que la longitud de la clave sea la adecuada para AES-256.
     *
     * @param keyBytes Clave a validar.
     * @throws IllegalArgumentException Si la clave no tiene la longitud de 256 bits (32 bytes).
     */
    private static void validateKey(byte[] keyBytes) {
        if (keyBytes == null) {
            System.out.println("La clave de cifrado no puede ser nula.");
            throw new IllegalArgumentException("La clave de cifrado no puede ser nula.");
        }
        if (keyBytes.length != KEY_SIZE) {
            System.out.println("Tama�o de clave inv�lido: " + keyBytes.length + " bytes. La clave debe ser de 256 bits (32 bytes).");
            throw new IllegalArgumentException("Tama�o de clave inv�lido. La clave debe ser de 256 bits (32 bytes).");
        }
    }

    /**
     * Valida que la longitud del IV sea la adecuada para AES-256 GCM.
     *
     * @param iv Vector de inicializaci�n a validar.
     * @throws IllegalArgumentException Si el IV no tiene la longitud de 12 bytes.
     */
    private static void validateIV(byte[] iv) {
        if (iv == null) {
            System.out.println("El vector de inicializaci�n no puede ser nulo.");
            throw new IllegalArgumentException("El vector de inicializaci�n no puede ser nulo.");
        }
        if (iv.length != IV_LENGTH) {
            System.out.println("Tama�o de IV inv�lido: " + iv.length + " bytes. El IV debe ser de 12 bytes.");
            throw new IllegalArgumentException("Tama�o de IV inv�lido. El IV debe ser de 12 bytes.");
        }
    }


    /**
     * Verifica que la clase haya sido inicializada antes de realizar operaciones de cifrado o descifrado.
     */
    private static void checkInitialized() {
        if (!isInitialized) {
            init();
        }
    }

    /**
     * 
     * @return
     */
	private static boolean loadKeyProp() {

		String archivoDeLlaves = "D:\\keys.properties";
		
		prop = new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(archivoDeLlaves);
		} catch (FileNotFoundException e1) {
			System.err.println("No se pudo leer el archivo " + archivoDeLlaves + ". Error: " + e1.getMessage());
			return false;
		}
		try {
			prop.load(fis);
		} catch (IOException e1) {
			System.err.println("No se pudo cargar la informacion del archivo de propiedades " + archivoDeLlaves + ". Error: " + e1.getMessage());
			return false;
		}

		keyProp = prop.getProperty("WS_CIPHER_ALGORITHM.KEY");
		ivProp = prop.getProperty("WS_CIPHER_ALGORITHM.IV");

		try {
			beforeTest();
			String keyString = PropertyValueEncryptionUtils.decrypt(keyProp, propEncryptUtil);
			String ivString = PropertyValueEncryptionUtils.decrypt(ivProp, propEncryptUtil);
			setEncryptionKeyBase64(keyString);
			setIvBase64(ivString);
			
			System.out.println("Valores a usar:\nkey: " + keyString + " --> " + keyString.length() +
					"\niv: " + ivString + " --> " + ivString.length());

		} catch (Exception e) {
			System.out.println();
			return false;
		}
		
		return true;
	}

	public static void beforeTest() {
		propEncryptUtil = new StandardPBEStringEncryptor();
		propEncryptUtil.setAlgorithm("PBEWithSHA256And256BitAES-CBC-BC");
		propEncryptUtil.setKeyObtentionIterations(4000);
		propEncryptUtil.setPassword("123momia");//123momia
		propEncryptUtil.setProvider(new BouncyCastleProvider());
		propEncryptUtil.setSaltGenerator(new RandomSaltGenerator());
	}
	
    /**
     * Establece la clave de cifrado despu�s de decodificarla de una cadena en Base64.
     * La clave de cifrado es necesaria para inicializar el proceso de cifrado/descifrado.
     *
     * @param keyProp La propiedad que tiene la llave.
     */
    public void setEncryptionKey(String keyProp) {
        this.keyProp = keyProp;
    }

    /**
     * Establece el vector de inicializaci�n (IV) despu�s de decodificarlo de una cadena en Base64.
     * El IV es necesario para inicializar el proceso de cifrado/descifrado.
     *
     * @param ivProp La propiedad que tiene el vector de inicializaci�n codificado en Base64.
     */
    public void setIv(String ivProp) {
        this.ivProp = ivProp;
    }

    /**
     * Establece la clave de cifrado despu�s de decodificarla de una cadena en Base64.
     * La clave de cifrado es necesaria para inicializar el proceso de cifrado/descifrado.
     *
     * @param key La llave.
     */
    protected static void setEncryptionKeyBase64(String key) {
    	keyBytes = Base64.decodeBase64(key);
    }

    /**
     * Establece el vector de inicializaci�n (IV) despu�s de decodificarlo de una cadena en Base64.
     * El IV es necesario para inicializar el proceso de cifrado/descifrado.
     *
     * @param iv El vector de inicializaci�n codificado en Base64.
     */
    protected static void setIvBase64(String ivs) {
   	iv = Base64.decodeBase64(ivs);
    }

	/**
	 * @param encryptUtil
	 *            the encryptUtil to set
	 */
	public void setPropEncryptUtil(StandardPBEStringEncryptor encryptUtil) {
		propEncryptUtil = encryptUtil;
	}

    //@Override
    public static void afterPropertiesSet() {
    	if (!loadKeyProp()) {
    		System.out.println("Couldn't load encryption parameters from properties.");
		}
        init();
    }
}
