/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.List;
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
public class IControladorPersonaTest {
    
    public IControladorPersonaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of cargarPersonas method, of class IControladorPersona.
     */
    @Test
    public void testCargarPersonas() {
        System.out.println("cargarPersonas");
        IControladorPersona instance = new IControladorPersonaImpl();
        instance.cargarPersonas();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of AgregarPersona method, of class IControladorPersona.
     */
    @Test
    public void testAgregarPersona() {
        System.out.println("AgregarPersona");
        int codigo = 0;
        String nombre = "";
        int edad = 0;
        IControladorPersona instance = new IControladorPersonaImpl();
        boolean expResult = false;
        boolean result = instance.AgregarPersona(codigo, nombre, edad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of BuscarPersonas method, of class IControladorPersona.
     */
    @Test
    public void testBuscarPersonas() {
        System.out.println("BuscarPersonas");
        String nombre = "";
        IControladorPersona instance = new IControladorPersonaImpl();
        List<DataPersona> expResult = null;
        List<DataPersona> result = instance.BuscarPersonas(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerPersona method, of class IControladorPersona.
     */
    @Test
    public void testObtenerPersona() {
        System.out.println("obtenerPersona");
        int codigo = 0;
        IControladorPersona instance = new IControladorPersonaImpl();
        DataPersona expResult = null;
        DataPersona result = instance.obtenerPersona(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of BorrarPersona method, of class IControladorPersona.
     */
    @Test
    public void testBorrarPersona() {
        System.out.println("BorrarPersona");
        DataPersona p = null;
        IControladorPersona instance = new IControladorPersonaImpl();
        boolean expResult = false;
        boolean result = instance.BorrarPersona(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class IControladorPersonaImpl implements IControladorPersona {

        public void cargarPersonas() {
        }

        public boolean AgregarPersona(int codigo, String nombre, int edad) {
            return false;
        }

        public List<DataPersona> BuscarPersonas(String nombre) {
            return null;
        }

        public DataPersona obtenerPersona(int codigo) {
            return null;
        }

        public boolean BorrarPersona(DataPersona p) {
            return false;
        }
    }
    
}
