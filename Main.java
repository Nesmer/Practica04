/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package profesores;

import javax.swing.JOptionPane;

/**
 *
 * @author mousl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
        String apellidos = JOptionPane.showInputDialog("Ingrese los"
                + " apelllidos: ");
        String carrera = JOptionPane.showInputDialog("Ingrese la carrera: ");
        String sede = JOptionPane.showInputDialog("Ingrese la sede: ");
        String grupo = JOptionPane.showInputDialog("Ingrese el grupo: ");

        datos mydatos = new datos(nombre, apellidos, carrera, sede, grupo);

        JOptionPane.showMessageDialog(null, "El nombre "
                + "del profesor es " + mydatos.getNombre());
        JOptionPane.showMessageDialog(null, "Los apellidos del "
                + "profesor son " + mydatos.getApellidos());
        JOptionPane.showMessageDialog(null, "La carrera que enseña"
                + " el profesor es " + mydatos.getCarrera());
        JOptionPane.showMessageDialog(null, "La sede del "
                + "profesor es " + mydatos.getSede());
        JOptionPane.showMessageDialog(null, "El grupo del profesor"
                + " es " + mydatos.getGrupo());
        
        mydatos.enseñar();
        mydatos.Realizar_Pruebas();
        mydatos.Revisar();
        mydatos.Reportar();
    }


            

 }
    
