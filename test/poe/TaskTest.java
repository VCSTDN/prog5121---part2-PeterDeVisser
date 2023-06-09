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
public class TaskTest {
    
    public TaskTest() {
    }
        
    /**
     * Test of checkTaskDescription method, of class Task.
     */
    @Test
    public void testCheckTaskDescription() {
        System.out.println("checkTaskDescription");
        String taskDic = "Create Login to authenticate users";
        Task instance = new Task();
        boolean expResult = true;
        boolean result = instance.checkTaskDescription(taskDic);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of createTaskID method, of class Task.
     */
    @Test
    public void testCreateTaskID() {
        System.out.println("createTaskID");
        String num = "";
        String taskName = "";
        String devName = "";
        Task instance = new Task();
        String expResult = "";
        String result = instance.createTaskID(num, taskName, devName);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of printTaskDetails method, of class Task.
     */
    @Test
    public void testPrintTaskDetails() {
        System.out.println("printTaskDetails");
        String taskName = "";
        String snum = "";
        String taskDic = "";
        String devName = "";
        int taskTime = 0;
        String ID = "";
        String stat = "";
        Task instance = new Task();
        String expResult = "";
        String result = instance.printTaskDetails(taskName, snum, taskDic, devName, taskTime, ID, stat);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of returnTotalHours method, of class Task.
     */
    @Test
    public void testReturnTotalHours() {
        System.out.println("returnTotalHours");
        int time = 0;
        Task instance = new Task();
        int expResult = 0;
        int result = instance.returnTotalHours(time);
        assertEquals(expResult, result);
        
    }
    
}
