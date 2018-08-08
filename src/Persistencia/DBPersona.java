/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;
import Logica.Persona;
import Persistencia.ConexionDB;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author apias
 */
import java.util.logging.Level;
import java.util.logging.Logger;
public class DBPersona {    
    //Si ConexionDB fuera singleton
    //private Connection conexion = ConexionDB.getConexion();
    private Connection conexion = new ConexionDB().getConexion();
    public boolean agregarPersona(Persona p){
        try {
            PreparedStatement statement = conexion.prepareStatement("INSERT INTO personas "
                    + "(codigo, nombre, edad) values(?,?,?)");
            statement.setInt(1, p.getCodigo());
            statement.setString(2, p.getNombre());
            statement.setInt(3, p.getEdad());
            statement.executeUpdate();
            statement.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }        
    }
    
    public boolean borrarPersona(Persona p){
        try {
            PreparedStatement statement = conexion.prepareStatement("DELETE FROM personas WHERE codigo=?");
            statement.setInt(1, p.getCodigo());
            statement.executeUpdate();
            statement.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }        
    }    
    
    public Map<Integer, Persona> cargarPersonas(){
        try {
            Map<Integer, Persona> lista=new HashMap<Integer, Persona>();
            PreparedStatement st = conexion.prepareStatement("SELECT * FROM personas");          
            ResultSet rs=st.executeQuery();
            while (rs.next()){
                int codigo=rs.getInt("codigo");
                Persona p=new Persona(codigo,rs.getString("nombre"),rs.getInt("edad"));
                lista.put(codigo, p);
            }
            rs.close();
            st.close();
            return lista;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }        
    }    
    
}