/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package poe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class LoginTest {
    
    public LoginTest() {
    }

    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String tempUname = "Kyl_1";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkUserName(tempUname);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String tempPword = "Ch&&sec@ke99!";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(tempPword);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String tempUname = "";
        String tempPword = "";
        Login instance = new Login();
        String expResult = "";
        String result = instance.registerUser(tempUname, tempPword);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String nameIn = "";
        String passIn = "";
        String uname = "";
        String pword = "";
        Login instance = new Login();
        String expResult = "";
        String result = instance.returnLoginStatus(nameIn, passIn, uname, pword);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String nameIn = "Kyl_1";
        String passIn = "Ch&&sec@ke99!";
        String uName = "Kyl_1";
        String pWord = "Ch&&sec@ke99!";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.loginUser(nameIn, passIn, uName, pWord);
        assertEquals(expResult, result);
       
    }
    
}
