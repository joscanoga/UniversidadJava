package co.com.joscanoga.algoritmos;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;
import javax.crypto.spec.IvParameterSpec;
import javax.swing.JOptionPane;

/**
 *
 * @author johan
 */
//AES con semilla
public class AESCS {
    
    private String LLAVE;
    private byte[] SEMILLA;

    public AESCS(String LLAVE, String SEMILLA) {
        this.LLAVE = LLAVE;
        try {
            this.SEMILLA = SEMILLA.getBytes("UTF-8");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(AESCS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Método para crear la clave
    public SecretKeySpec CrearCalve(String llave) {
        try {
            // Transformar la clave en un arreglo de bytes
            byte[] cadena = llave.getBytes("UTF-8");
            // Instanciar la clase MessageDigest para obtener una instancia de SHA-256
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            // Aplicar el algoritmo de hash a la cadena de bytes 
            cadena = md.digest(cadena);
            // Truncar la clave a 32 bytes
            cadena = Arrays.copyOf(cadena, 32);
            // Crear la clave secreta
            SecretKeySpec secretKeySpec = new SecretKeySpec(cadena, "AES");
            // Retornar la clave secreta
            //JOptionPane.showMessageDialog(null, secretKeySpec.toString());
            return secretKeySpec;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ha ocurrido un error: "+e.getMessage());
            return null;
        }
    }

    // Encriptar
    public String encriptar(String encriptar) {
        try {
            // Crear la clave secreta
            SecretKeySpec secretKeySpec = CrearCalve(LLAVE);
            // Crear el vector de inicialización
            IvParameterSpec iv = new IvParameterSpec(SEMILLA);
            // Instanciar la clase Cipher para encriptar
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            // Inicializar el cipher en modo encriptar
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, iv);
            // Transformar la cadena a encriptar a bytes
            byte[] cadena = encriptar.getBytes("UTF-8");
            // Encriptar la cadena
            byte[] encriptada = cipher.doFinal(cadena);
            // Codificar la cadena encriptada a base64
            byte[] base64Bytes = Base64.encodeBase64(encriptada);
            // Convertir la cadena encriptada a String
            String cadena_encriptada = new String(base64Bytes);
            return cadena_encriptada;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ha ocurrido un error: "+e.getMessage());
            return "";
        }
    }

    // Des-encriptación
    public String desencriptar(String desencriptar) {
        try {
            // Crear la clave secreta
            SecretKeySpec secretKeySpec = CrearCalve(LLAVE);
            // Crear el vector de inicialización
            IvParameterSpec iv = new IvParameterSpec(SEMILLA);
            // Instanciar la clase Cipher para desencriptar
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            // Inicializar el cipher en modo desencriptar
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, iv);
            // Decodificar la cadena encriptada a base64
            byte[] cadena = Base64.decodeBase64(desencriptar.getBytes("utf-8"));
            // Desencriptar la cadena
            byte[] desencriptacioon = cipher.doFinal(cadena);
            // Transformar la cadena desencriptada a String
            String cadena_desencriptada = new String(desencriptacioon);
            return cadena_desencriptada;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ha ocurrido un error: "+e.getMessage());
            return "";
        }
    }
}
