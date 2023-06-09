/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe;
import javax.swing.JOptionPane;
/**
 *
 * @author lab_services_student
 */
public class Task 
{
    public boolean checkTaskDescription(String taskDic)
            // now we check the string is less than 50
    {
      return taskDic.length() <= 50;      
    }
    public String createTaskID(String num , String taskName , String devName)
    {
        // now we get a our chars needed for the ID
        char T1 = taskName.charAt(0);
        char T2 = taskName.charAt(1);
        char D1 = devName.charAt(devName.length()-2);
        char D2 = devName.charAt(devName.length()-1);
        char D3 = devName.charAt(devName.length());
        
        String ID = T1 + T2 + ":"+num+":" + D1 + D2 + D3;    
        return ID;
        
    }
    public String printTaskDetails(String taskName,String snum,String taskDic,String devName,int taskTime,String ID,String stat)
    {
        // here we take all the nessary info and combine it into 1 string 
        
        String Stat = "Task Details\n"
        + "Task Name: \t"+taskName+"\n"
        + "Task Number: \t"+snum+"\n"
        + "Task Description: \t"+taskDic+"\n"
        + "Developer Details: \t"+devName+"\n"
        + "TaskID: \t"+ID+"\n"
        + "Task Status: "+stat+"" ;
        return Stat;
    }
    public int returnTotalHours(int time)
    {   
        //just a counter for the total time 
        int total =+ time;
        return total;
    }
}
