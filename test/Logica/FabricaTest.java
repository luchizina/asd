/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

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
public class FabricaTest {
    
    public FabricaTest() {
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
     * Test of getInstance method, of class Fabrica.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        Fabrica instance = Fabrica.getInstance();
        IControladorPersona result = instance.getIControladorPersona();
        assertEquals(true, result!=null);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIControladorPersona method, of class Fabrica.
     */
    @Test
    public void testGetIControladorPersona() {
        System.out.println("getIControladorPersona");
        Fabrica instance = Fabrica.getInstance();
        IControladorPersona expResult = null;
        IControladorPersona result = instance.getIControladorPersona();
        assertEquals(true, result!=null);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
