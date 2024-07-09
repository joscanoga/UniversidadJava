/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.joscanoga.algoritmos;

import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author johan
 */
//AES sin semilla
public class AESSS {
    
    String LLAVE ;

    public AESSS(String LLAVE) {
        this.LLAVE = LLAVE;
    }
    
    //metodo para crear la clave
    public  SecretKeySpec CrearCalve(String llave) {
        try {
            //transformar la clave en un arreglo de bytes
            byte[] cadena = llave.getBytes("UTF-8");
            //Instanciar la clase MessageDigest para obtener una instancia de SHA-256
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            //Aplicar el algoritmo de hash a la cadena de bytes 
            cadena = md.digest(cadena);
            //Truncar la clave a 32 bytes
            cadena = Arrays.copyOf(cadena, 32);
            //Crear la clave secreta
            SecretKeySpec secretKeySpec = new SecretKeySpec(cadena, "AES");
            //Retornar la clave secreta
            return secretKeySpec;
        } catch (Exception e) {
            return null;
        }

    }

    // Encriptar
    public  String encriptar(String encriptar) {
     
        try {
            //Crear la clave secreta
            SecretKeySpec secretKeySpec = CrearCalve(LLAVE);
            //Instanciar la clase Cipher para encriptar
            Cipher cipher = Cipher.getInstance("AES");
            //Inicializar el cipher en modo encriptar
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            //Transformar la cadena a encriptar a bytes
            byte [] cadena = encriptar.getBytes("UTF-8");
            //Encriptar la cadena
            byte [] encriptada = cipher.doFinal(cadena);
            //Codificar la cadena encriptada a base64
            byte[] base64Bytes = Base64.encodeBase64(encriptada);
            //Se convierte la cadena encriptada a String
            String cadena_encriptada = new String(base64Bytes);
            return cadena_encriptada;
            
            
            
        } catch (Exception e) {
            return "";
        }
    }

    // Des-encriptación
     public  String desencriptar(String desencriptar) {
     
        try {
            //Crear la clave secreta
            SecretKeySpec secretKeySpec = CrearCalve(LLAVE);
            //Instanciar la clase Cipher para desencriptar
            Cipher cipher = Cipher.getInstance("AES");
            //Inicializar el cipher en modo desencriptar
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
            //Decodificar la cadena encriptada a base64
            byte [] cadena = Base64.decodeBase64(desencriptar.getBytes("utf-8"));
            //Desencriptar la cadena
            byte [] desencriptacioon = cipher.doFinal(cadena);
            //Transformar la cadena desencriptada a String
            String cadena_desencriptada = new String(desencriptacioon);
            return cadena_desencriptada;
            
        } catch (Exception e) {
            return "";
        }
    }
}
