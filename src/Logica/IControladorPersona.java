/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.List;

/**
 *
 * @author apias
 */
public interface IControladorPersona {
    public abstract void cargarPersonas();
    public abstract boolean AgregarPersona(int codigo, String nombre, int edad);
    public abstract List<DataPersona> BuscarPersonas(String nombre);  
    public abstract DataPersona obtenerPersona(int codigo);
    public abstract boolean BorrarPersona(DataPersona p);  
}