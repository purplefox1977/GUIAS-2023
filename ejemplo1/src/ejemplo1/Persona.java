/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

public class Persona {
    
    private String apellido;
    private String nombre;
    private int edad;
    
    public Persona(String apellido,String nombre,int edad){
        
            this.apellido=apellido;
            this.nombre=nombre;
            this.edad=edad;
    }    
    public Persona(){
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
            this.apellido=apellido;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void Saludar(){
        System.out.println(" hola, mi nombre es "+ nombre);
    }


}