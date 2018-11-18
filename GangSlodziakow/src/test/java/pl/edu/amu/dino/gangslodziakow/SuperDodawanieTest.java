/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.dino.gangslodziakow;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author jsiwek
 */
public class SuperDodawanieTest {
    
    public SuperDodawanieTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of superdodawanie method, of class SuperDodawanie.
     */
    @Test
    public void testSuperdodawanie() {
        System.out.println("superdodawanie");
        String a = "1";
        String b = "-1";
        String expResult = "0";
        String result = SuperDodawanie.superdodawanie(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
        public void testSuperdodawanie2() {
        System.out.println("superdodawanie");
        String a = "1";
        String b = "0";
        String expResult = "1";
        String result = SuperDodawanie.superdodawanie(a, b);
        assertEquals(expResult, result);
    }
        
    @Test
        public void testSuperdodawanie3() {
        System.out.println("superdodawanie");
        String a = "a";
        String b = "b";
        String expResult = "ab";
        String result = SuperDodawanie.superdodawanie(a, b);
        assertEquals(expResult, result);
    }
        
    @Test
        public void testSuperdodawanie4() {
        System.out.println("superdodawanie");
        String a = "tonie";
        String b = "dziala";
        String expResult = "toniedziala";
        String result = SuperDodawanie.superdodawanie(a, b);
        assertEquals(expResult, result);
    }
    @Test
        public void testSuperdodawanie5() {
        System.out.println("Dodawanie liczb rzymskich dzialajace");
        String a = "I";
        String b = "II";
        String expResult = "III";
        String result = SuperDodawanie.superdodawanie(a, b);
        assertEquals(expResult, result);
    }        
    @Test
        public void testSuperdodawanie6() {
        System.out.println("Dodawanie liczb rzymskich niedzialajace");
        String a = "V";
        String b = "IV";
        String expResult = "IX";
        String result = SuperDodawanie.superdodawanie(a, b);
        assertEquals(expResult, result);
    }       
}
