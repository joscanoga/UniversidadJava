/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import java.util.Arrays;

/**
 *
 * @author johan
 */
public class TestMatrices {
    public static void main(String[] args) {
        int edades [][]=new int[3][2];
        System.out.println("edades = " + Arrays.toString(edades));
        edades[0][0]=1;
        edades[0][1]=2;
        edades[1][0]=3;
        edades[1][1]=4;
        edades[2][0]=5;
        edades[2][1]=6;
        for(int i=0; i<edades.length;i++){
            for(int j=0 ;j<edades[i].length;j++){
                System.out.println("edades["+i+"]["+j+"] = " + edades[i][j]);
            }
        }
        
        String frutas [][]={{"naranja","limon"},{"fresa","mora"}};
    }
}
