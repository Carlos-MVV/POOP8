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
public class TrianguloA extends PoligonoAbstracto{
 
    private int alpha,beta,gamma;
    private float a,b,c;
    private float base,altura;
    /**
     * Constructor vacio
     */
    public TrianguloA() {
    }
    /**
     * 
     * @param base recibe el parametro de base
     */
    public void setBase(float base) {
        this.base = base;
    }
    /**
     * 
     * @param altura recibe el parametro de altura
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * 
     * @return retorna la cadena Triangulo 
     */
    @Override
    public String toString() {
        return "Triangulo{" + '}';
    }
    /**
     * 
     * @return retorna el calculo de la area 
     */
    @Override
    public double area() {
        return (base*altura)/2;
    }
    /**
     * 
     * @return retorna la suma de los lados
     */
    @Override
    public double perimetro() {
        return a+b+c;
    }
    
    
    
}
