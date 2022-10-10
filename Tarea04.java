/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea04;
import javax.swing.JOptionPane;

/**
 *
 * @author steve
 */
public class Tarea04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //sede sedePrincipal = new sede("Universidad de Ciencia y Tecnología",
             //"Steve Cantillo", "Ing Sistemas", "Biblioteca");
        
        
        String nombre = JOptionPane.showInputDialog("Ingrese nombre de "
                + "sede");
        String director = JOptionPane.showInputDialog("Ingrese nombre del "
                + "director de la sede");
        String carrera = JOptionPane.showInputDialog("Ingrese la carrera");
        String servicio = JOptionPane.showInputDialog("Ingrese nombre del "
                + "servicio");
        
        sede sedePrincipal = new sede(nombre,director,carrera,servicio);
        
        System.out.println("El nombre de la sede es: " + sedePrincipal.getNombre());
        System.out.println("El nombre del director es: " + sedePrincipal.getDirector());
        System.out.println("Carrera que consulta: " + sedePrincipal.getCarrera());
        System.out.println("Servicio a utilizar: " + sedePrincipal.getServicio());
    }
    
}
