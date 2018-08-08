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
public class Fabrica {
    
    //SINGLETON
    private static Fabrica instancia;

    public static Fabrica getInstance(){
        if (instancia == null){
            instancia = new Fabrica();
        }
        return instancia;
    }    
    
    private Fabrica(){
        this.cargarDatosPrueba();
    };
    
    private void cargarDatosPrueba(){
        IControladorPersona ip=this.getIControladorPersona();
        ip.cargarPersonas();
    }
    
    public IControladorPersona getIControladorPersona() {
        IControladorPersona ICP = ControladorPersona.getInstance();
        return ICP;
    }   
}