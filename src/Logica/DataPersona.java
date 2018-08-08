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
public class DataPersona {
    private int codigo;
    private String nombre;
    private int edad;
    public DataPersona(){
        this.codigo=0;
        this.edad=0;
        this.nombre="";
    }
    public DataPersona(Persona p){
        this.codigo=p.getCodigo();
        this.edad=p.getEdad();
        this.nombre=p.getNombre();
    } 
    public DataPersona(int codigo, String nombre, int edad){
        this.codigo=codigo;
        this.edad=edad;
        this.nombre=nombre;
    }    

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getCodigo(){
        return codigo;
    }
    
}

