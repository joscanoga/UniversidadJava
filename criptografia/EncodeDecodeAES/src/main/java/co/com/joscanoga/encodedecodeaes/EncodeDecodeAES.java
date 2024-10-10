/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.com.joscanoga.encodedecodeaes;

//import com.sun.org.apache.xml.internal.security.utils.Base64;

import co.com.joscanoga.algoritmos.AESCS;
import co.com.joscanoga.algoritmos.AESSS;
    import javax.swing.JOptionPane;

/**
 *
 * @author johan
 */
public class EncodeDecodeAES {

   
        

    public static void main(String[] args) {
        String LLAVE="JOSCANOGA";
        String consemilla =JOptionPane.showInputDialog("Ingrese s para encriptar sin semilla c consemilla");
        if(consemilla.equals("s")){
            AESSS aes= new AESSS(LLAVE);
            String encriptada = "";
            String aEnccriptar = "";
            aEnccriptar = JOptionPane.showInputDialog("Ingresa la cadena a encriptar: ");
            encriptada = aes.encriptar(aEnccriptar);
            JOptionPane.showMessageDialog(null, encriptada);
            JOptionPane.showMessageDialog(null, aes.desencriptar(encriptada));
        } else if(consemilla.equals("c")){
            AESCS aes= new AESCS("7fEfzrDeG4BN3yvjO3poMjgFaoogp4aR","sOf5Pc0PQxgKruC8");
            String encriptada = "";
            String aEnccriptar = "";
            aEnccriptar = JOptionPane.showInputDialog("Ingresa la cadena a encriptar: ");
            encriptada = aes.encriptar(aEnccriptar);
            JOptionPane.showMessageDialog(null, encriptada);
            JOptionPane.showMessageDialog(null, aes.desencriptar(encriptada));
        }else if(consemilla.equals("d")){
            
        }
        else{
            JOptionPane.showMessageDialog(null, "opcion incorrecta");
        }
        
        
    }

    
}
