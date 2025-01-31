/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

/**
 *
 * @author andres.chillon
 */
public class Alumno {

   
    private String nombre;
        private String apellido;
        private byte edad;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }
     
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Alumno(String nombre, String apellido, byte edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

   
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
