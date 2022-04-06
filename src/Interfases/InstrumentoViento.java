/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfases;

/**
 *
 * @author alumno
 */
public class InstrumentoViento extends Object implements InstrumentoMusical{

    /**
     * Constructor vacío
     */
    public InstrumentoViento() {
    }
    
    /**
     * método para rocar instrumento
     */
    @Override
    public void tocar() {
        System.out.println("Tocando Instrumento");
    }

    /**
     * método para afinar instrumento
     */
    @Override
    public void afinar() {
        System.out.println("Afinando Instrumento");
    }

    /**
     * método que te dice el tipo de instrumento
     * @return 
     */
    @Override
    public String tipoInstrumento() {
        return "Instrumento de Viento";
    }

    /**
     * 
     * @return regresa InstrumentoViento
     */
    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
    
    
}
