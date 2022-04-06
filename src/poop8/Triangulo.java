/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author alumno
 */
public class Triangulo extends Poligono{

    private int alpha,beta,gamma;
    private float a,b,c;
    private float base,altura;
    /**
     * Constructor vacio
     */
    public Triangulo() {
    }
    /**
     * 
     * @param base es la base que le asignamos al triangulo
     */
    public void setBase(float base) {
        this.base = base;
    }
    /**
     * 
     * @param altura es la altura que le asignamos al triangulo
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * 
     * @return nos retorna una cadena diciendo que es triangulo
     */
    @Override
    public String toString() {
        return "Triangulo{" + '}';
    }
    
    
    
}
