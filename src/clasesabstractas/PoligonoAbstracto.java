/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesabstractas;

/**
 *
 * @author alumno
 */
public abstract class PoligonoAbstracto {
    public abstract double area();
    public abstract double perimetro();
    /**
     * 
     * @return retorna la cadena de PoligonoAbstracto
     */
    @Override
    public String toString() {
        return "PoligonoAbstracto{" + '}';
    }
    
}
