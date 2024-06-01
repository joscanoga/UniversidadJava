/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author johan
 */
public class Rectangulo {

    private int base;
    private int altura;
    
    public int getAltura(){
        return this.altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return this.base;
    }
    public int getArea(){
        return this.base*this.altura;
    }

}
