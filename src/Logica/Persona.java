/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author apias
 */
public class Persona {
    private int codigo;
    private String nombre;
    private int edad;
    
    public Persona(){
        this.codigo=0;
        this.edad=0;
        this.nombre="";
    }
    public Persona(int codigo, String nombre){
        this.codigo=codigo;
        this.nombre=nombre;
        this.edad=0;
    }   
    public Persona(int codigo,String nombre, int edad){
        this.codigo=codigo;
        this.edad=edad;
        this.nombre=nombre;
    }    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public DataPersona getDataPersona(){
        return new DataPersona(codigo,nombre,edad);
    }
    
}
