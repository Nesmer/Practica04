/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package profesores;
import javax.swing.JOptionPane;
/**
 *
 * @author mousl
 */
public class datos {
    private String nombre;
    private String apellidos;
    private String carrera;
    private String sede;
    private String grupo;

    public datos(String nombre, String apellidos, String carrera, String sede, String grupo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.carrera = carrera;
        this.sede = sede;
        this.grupo = grupo;
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getSede() {
        return sede;
    }

    public String getGrupo() {
        return grupo;
    }

    public void enseñar(){
            JOptionPane.showMessageDialog(null,"El profesor enseña "
            + "sobre ingenieria en sistemas");
    }
     public void Realizar_Pruebas(){
            JOptionPane.showMessageDialog(null,"El profesor "
                    + "realiza una prueba sobre programaci+on");
     }
     public void Revisar(){
            JOptionPane.showMessageDialog(null,"El profesor revisa"
                    + "las pruebas de programación");
     }
     public void Reportar(){
            JOptionPane.showMessageDialog(null,"El profesor reporta"
                    + "el rendimiento de los estudiantes");
     }
     
    
    
}
