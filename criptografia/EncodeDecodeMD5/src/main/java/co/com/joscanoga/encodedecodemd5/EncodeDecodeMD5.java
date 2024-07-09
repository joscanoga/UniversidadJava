/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.com.joscanoga.encodedecodemd5;

import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author johan
 */
public class EncodeDecodeMD5 {
    
    
    
    public static void main(String[] args) {
        String secretKey = "joscanoga";
        String cadenaAEncriptar = JOptionPane.showInputDialog("Ingresa la cadena a encriptar");
        String cadenaEncriptada = ecnode(secretKey, cadenaAEncriptar);
        JOptionPane.showMessageDialog(null, "Cadena encriptada: " + cadenaEncriptada);
        String cadenaDesencriptada = deecnode(secretKey, cadenaEncriptada);
        JOptionPane.showMessageDialog(null, "Cadena desencriptada: " + cadenaDesencriptada);
    }
    /**
     * Encrypts the given string using the MD5 algorithm and a secret key.
     * 
     * @param secretKey The secret key used for encryption.
     * @param cadena The string to be encrypted.
     * @return The encrypted string.
     */
    public static String ecnode(String secretKey, String cadena) {
        String encriptacion = "";
        try {
            //Se crea un objeto de tipo MessageDigest con el algoritmo MD5
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            //Se obtiene la llave secreta en un arreglo de bytes
            byte[] llavePassword = md5.digest(secretKey.getBytes("utf-8"));
            //se crea una copia de la llave secreta en base a 24 bytes
            byte[] BytesKey = Arrays.copyOf(llavePassword, 24);
            //Se crea un objeto de tipo SecretKey con la llave secreta
            SecretKey key = new SecretKeySpec(BytesKey, "DESede");
            //Se crea un objeto de tipo Cipher con el algoritmo DESede
            Cipher cifrado = Cipher.getInstance("DESede");
            //Se inicializa el cifrado en modo de encriptación y se le pasa la llave secreta
            cifrado.init(Cipher.ENCRYPT_MODE, key);
            //Se obtienen los bytes de la cadena a encriptar
            byte[] plainTextBytes = cadena.getBytes("utf-8");
            //Se encripta la cadena
            byte[] buf = cifrado.doFinal(plainTextBytes);
            //Se codifica la cadena encritada en base64
            byte[] base64Bytes = Base64.encodeBase64(buf);
            //Se convierte la cadena encriptada a String
            encriptacion = new String(base64Bytes);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Algo salió mal");
        }
        return encriptacion;
    }

    /**
     * Decrypts an encoded string using a secret key.
     * 
     * @param secretKey        The secret key used for decryption.
     * @param cadenaEncriptada The encoded string to be decrypted.
     * @return The decrypted string.
     */
    public static String deecnode(String secretKey, String cadenaEncriptada) {
        String desencriptacion = "";
        try {
            //Se decodifica la cadena encriptada en base64
            byte[] message = Base64.decodeBase64(cadenaEncriptada.getBytes("utf-8"));
            //Se crea un objeto de tipo MessageDigest con el algoritmo MD5
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            //Se obtiene la llave secreta en un arreglo de bytes
            byte[] digestOfPassword = md5.digest(secretKey.getBytes("utf-8"));
            //se crea una copia de la llave secreta en base a 24 bytes
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
            //Se crea un objeto de tipo SecretKey con la llave secreta
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
            //Se crea un objeto de tipo Cipher con el algoritmo DESede
            Cipher decipher = Cipher.getInstance("DESede");
            //Se inicializa el cifrado en modo de desencriptación y se le pasa la llave secreta
            decipher.init(Cipher.DECRYPT_MODE, key);
            //Se desencripta la cadena
            byte[] plainText = decipher.doFinal(message);
            //Se convierte la cadena desencriptada a String
            desencriptacion = new String(plainText, "UTF-8");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Algo salió mal");
        }
        return desencriptacion;
    }
}
