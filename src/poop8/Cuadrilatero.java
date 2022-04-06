/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author alumno
 */
public class Cuadrilatero extends Poligono{
    private int alfa,beta;
    private float a,b;
    private float base, altura;
    /**
     * Constructor vacio
     */
    public Cuadrilatero() {
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
     * @return retorna una cadena diciendo que es Cuadrilatero
     */
    @Override
    public String toString() {
        return "Cuadrilatero{" + '}';
    }
    
}
