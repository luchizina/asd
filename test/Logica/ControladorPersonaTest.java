/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apias
 */
public class ControladorPersonaTest {
    
    //private static List<DataPersona> personas;
    private static DataPersona personaAux1;
    private static DataPersona personaAux2;
    private static DataPersona personaAux3;
    
    public ControladorPersonaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        personaAux1=new DataPersona(1,"xxx",23);
        personaAux3=new DataPersona(3,"pepe",48);
        ControladorPersona instance = ControladorPersona.getInstance();
        instance.cargarPersonas();
        instance.AgregarPersona(1, "xxx", 23);        
        instance.AgregarPersona(3, "pepe", 48); 
    }
    
    @AfterClass
    public static void tearDownClass() {
        ControladorPersona instance = ControladorPersona.getInstance();
        instance.BorrarPersona(personaAux2);
        instance.BorrarPersona(personaAux1);
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getInstance method, of class ControladorPersona.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        ControladorPersona result = ControladorPersona.getInstance();
        assertEquals(true, result!=null);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cargarPersonas method, of class ControladorPersona.
     */
    /*@Test
    public void testCargarPersonas() {
        System.out.println("cargarPersonas");
        ControladorPersona instance = ControladorPersona.getInstance();
        instance.cargarPersonas();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        //HashMap<Integer, Persona> personas2 = instance.cargarPersonas();
    }*/

    /**
     * Test of AgregarPersona method, of class ControladorPersona.
     */
    @Test
    public void testAgregarPersona() {
        System.out.println("AgregarPersona");
        int codigo = 2;
        String nombre = "prueba";
        int edad = 0;
        personaAux2=new DataPersona(codigo,nombre,edad);
        ControladorPersona instance = ControladorPersona.getInstance();
        boolean expResult = true;
        boolean result = instance.AgregarPersona(codigo, nombre, edad);
        assertEquals(expResult, result && instance.obtenerPersona(codigo)!=null);
    }

    /**
     * Test of obtenerPersona method, of class ControladorPersona.
     */
    @Test
    public void testObtenerPersona() {
        System.out.println("obtenerPersona");
        int codigo = 1;
        ControladorPersona instance = ControladorPersona.getInstance();
        DataPersona expResult = personaAux1;
        DataPersona result = instance.obtenerPersona(codigo);
        boolean ok=expResult.getCodigo()==result.getCodigo() && expResult.getNombre().equals(result.getNombre());
        assertEquals(true, ok);        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of BorrarPersona method, of class ControladorPersona.
     */
    @Test
    public void testBorrarPersona() {
        System.out.println("BorrarPersona");
        DataPersona p = personaAux3;
        ControladorPersona instance = ControladorPersona.getInstance();
        int tam=instance.getPersonas().size();
        boolean expResult = true;
        boolean result = instance.BorrarPersona(p);
        
        result=result && instance.getPersonas().size()==(tam-1) && (instance.obtenerPersona(3)==null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of BuscarPersonas method, of class ControladorPersona.
     */
    @Test
    public void testBuscarPersonas() {
        System.out.println("BuscarPersonas");
        String nombre = "xxx";
        ControladorPersona instance = ControladorPersona.getInstance();
        int expResult = 1;
        List<DataPersona> result = instance.BuscarPersonas(nombre);
        assertEquals(expResult, result.size());
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
