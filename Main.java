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
        JOptionPane.showMessageDialog(null, "Datos del profesor");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del profesor: ");
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
        
        JOptionPane.showMessageDialog(null, "Datos del computador");
        String marca = JOptionPane.showInputDialog("Ingrese la marca del computador: ");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo: ");
        String serie = JOptionPane.showInputDialog("Ingrese la serie: ");
        String tipo = JOptionPane.showInputDialog("Ingrese el tipo: ");
        
        Computador Ucomputador = new Computador(marca, modelo, serie, tipo);
        
        System.out.println("La marca del computador es:"+ Ucomputador.getMarca());
        System.out.println("El modelo del computador es:"+ Ucomputador.getModelo());
        System.out.println("La serie del computador es:"+ Ucomputador.getSerie());
        System.out.println("El tipo del computador es:"+ Ucomputador.getTipo());
        
        JOptionPane.showMessageDialog(null, "Datos del computador");
        String nombre =JOptionPane.showInputDialog("Digite su primer"
                + "nombre");
        String apellidos = JOptionPane.showInputDialog("Digite sus "
                + "apellidos");
        int cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite el "
                + "numero de cedula"));
        String carrera = JOptionPane.showInputDialog("Digite la carrera que le "
                + "gustaria estudiar");
        String horarios = JOptionPane.showInputDialog("Digite El horario que le"
                + "gustaria obtener");
        String sede = JOptionPane.showInputDialog("Digite la sede a la que le "
                + "gustaria asistir");
        
        Estudiantes nEstudiante =  new Estudiantes(nombre,apellidos,(short)cedula,
                carrera, horarios, sede);
        
        JOptionPane.showMessageDialog(null,"Su nombre es :" +nombre);
        JOptionPane.showMessageDialog(null, "Sus apellidos son :"+apellidos);
        JOptionPane.showMessageDialog(null,"La cedula es :"+cedula);
        JOptionPane.showMessageDialog(null, "La carrrera seria :" +carrera);
        JOptionPane.showMessageDialog(null, "El horario a escoger seria ;"+horarios);
        JOptionPane.showMessageDialog(null, "La sede a escoger seria :"+sede);
    }


            

 }
    
