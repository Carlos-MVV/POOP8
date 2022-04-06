/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop8;

import calendario.Meses;
import interfases.Flauta;
import interfases.InstrumentoMusical;
import clasesabstractas.PoligonoAbstracto;
import clasesabstractas.TrianguloA;

/**
 *
 * @author alumno
 */
public class POOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("############################### Clases se comportan como su padre");
        Poligono poligono=new Poligono();
        Triangulo triangulo=new Triangulo();
        Cuadrilatero cuadrilatero=new Cuadrilatero();
        Object Objeto=poligono;
        
        System.out.println(Objeto);
        poligono=triangulo;
        System.out.println(poligono);
        poligono=cuadrilatero;
        System.out.println(cuadrilatero);
        Objeto=triangulo;
        System.out.println(Objeto);
        
        
        System.out.println("############################### Clases Abstractas");
        //PoligonoAbstracto pol=new PoligonoAbstracto; no se puede
        
        PoligonoAbstracto pol;
        pol=new TrianguloA();
        System.out.println(pol);
        System.out.println("############################### Interfases");
        InstrumentoMusical instrumento;
        instrumento=new Flauta();
        instrumento.tocar();
        System.out.println(instrumento.tipoInstrumento());
        
        System.out.println("############################### Interfases como almacenes");
        System.out.println(Math.PI);
        System.out.println(Math.abs(-33));
        
        System.out.println("El mes "+Meses.DOS+" es "+Meses.NOMBRE_MESES[2]+" "+Meses.NOMBRE_MESES[Meses.DOS]);
    }
    
}
