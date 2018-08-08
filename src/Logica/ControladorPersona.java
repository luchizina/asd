/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.List;
import java.util.ArrayList;
import Logica.Persona;
import Persistencia.DBPersona;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/**
 *
 * @author apias
 */
public class ControladorPersona implements IControladorPersona {
    //SINGLETON
    private static ControladorPersona instancia;
    //Colección genérica común
    //private List<Persona> personas;
    private Map<Integer, Persona> personas;
    private DBPersona dbPersona=null;

    public static ControladorPersona getInstance(){
        if (instancia == null){
            instancia = new ControladorPersona();
        }
        return instancia;
    }    

    private ControladorPersona(){
        //Colección genérica común
        //this.personas=new ArrayList<Persona>();
        this.personas=new HashMap<Integer, Persona>();
        this.dbPersona=new DBPersona();
    }

    @Override
    public void cargarPersonas(){
        this.personas=this.dbPersona.cargarPersonas();
    }
    
    public Map<Integer, Persona> getPersonas(){
        return this.personas;
    }
    
    @Override
    public boolean AgregarPersona(int codigo, String nombre, int edad) {
        if (this.personas.get(codigo)!=null){
            return false;
        }else{
            Persona p=new Persona(codigo, nombre, edad);
            boolean res =this.dbPersona.agregarPersona(p);
            if (res){
                //Colección genérica común
                //this.personas.add(p);
                this.personas.put(codigo, p);
            }
            return res;
        }
    }
    
    @Override
    public DataPersona obtenerPersona(int codigo){
        Persona aux=(Persona) this.personas.get(codigo);
        if (aux!=null){
            return aux.getDataPersona();
        }else{
            return null;
        }
    }
    
    @Override
    public boolean BorrarPersona(DataPersona p) {
        //System.out.print(p.getCodigo());
        boolean ok=false;
        if (p!=null){
            Persona aux=(Persona)this.personas.get(p.getCodigo());
            if (aux!=null){
                ok=this.dbPersona.borrarPersona(aux);
                //DETALLE O CAMBIO
                this.personas.remove(p.getCodigo());                
            }
        }
        return ok;
    }
    
    @Override
    public List<DataPersona> BuscarPersonas(String nombre) {
        List<DataPersona> retornar=new ArrayList<DataPersona>();
        Set set = personas.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            Persona aux=(Persona) mentry.getValue();        
            if (aux.getNombre().contains(nombre)){
                retornar.add(aux.getDataPersona());
            }
        }       
        return retornar;
    }
}
