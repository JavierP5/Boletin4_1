/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin4_1;

/**
 *
 * @author dam1
 */
public class Boletin4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Crear libro
        Libro lib = new Libro();
        lib.inicializarLibro();
        
        //Crear libro con constructor
        lib.Libro("aa","autor",1990,(short) 100, 5);
        
        //Mostrar libro
        lib.getLibro();
        
        lib.inicializarLibro();
        //Crear libro
        lib.setTitulo("Blues para un planeta azul");
        lib.setAutor("Juan Fueyo");
        lib.setAno(2022);
        lib.setPaginas((short)350);
        lib.setValoracion(10);
        //Mostrar libro
        lib.getLibro();
        
     
    }
    
}
