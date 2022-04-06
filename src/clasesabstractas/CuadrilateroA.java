/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesabstractas;

import poop8.*;

/**
 *
 * @author alumno
 */
public class CuadrilateroA extends PoligonoAbstracto{
    private int alfa,beta;
    private float a,b;
    private float base, altura;
    /**
     * Constructor vacio
     */
    public CuadrilateroA() {
    }
    /**
     * 
     * @param base recibe una base de tipo float
     */
    public void setBase(float base) {
        this.base = base;
    }
    /**
     * 
     * @param altura recibe la altura de tipo float
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * 
     * @return retorna una cadena de Cuadrilatero
     */
    @Override
    public String toString() {
        return "Cuadrilatero{" + '}';
    }
    /**
     * 
     * @return retorna el calculo del area
     */
    @Override
    public double area() {
        return base*altura;
    }
    /**
     * 
     * @return retorna el calculo del perimetro
     */
    @Override
    public double perimetro() {
        return 2*(a+b);
    }
    
}
