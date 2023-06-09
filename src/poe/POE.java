/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe;
import javax.swing.*;
/**
 *
 * @author lab_services_student
 */
public class POE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
              // first we define our object 
       Login dataObj = new Login() ;
        
       // we first welcome the user
       JOptionPane.showMessageDialog(null, "Welcome to the regestration");
       //then we ask them to enter details
       String fName = JOptionPane.showInputDialog("Please input your first name");
       String lName = JOptionPane.showInputDialog("Please input your Last name");
       // now we ask them to make a user name and password
       
       String uNameTemp = JOptionPane.showInputDialog("Hello "+ fName+" "+lName+". \n"
               +"Please make a username \n" +
                "Note: username must contain an underscore and is no more than 5 characters in length" );
       
       String pWordTemp = JOptionPane.showInputDialog("Please also make a password\n"
               + "Note: Password must be no longer than 8 characters , \n"
               + "contain a capital letter , a special character and a number");
       // then we use our object to send these to our regester user 
        String regStatus = dataObj.registerUser(uNameTemp, pWordTemp);
        
        JOptionPane.showMessageDialog(null ,""+regStatus);
        
        //now that the username and password have been validated we can save them 
        String uName , pWord;
        String status=" ";
        if ( regStatus.matches("Regestration succsesful"))
        {
        uName = uNameTemp;
        pWord = pWordTemp;
        
        JOptionPane.showMessageDialog(null,"Welcome to login");
        String nInput, pInput;
        // now that they are loging in we ask them to input their name and password 

        nInput = JOptionPane.showInputDialog(null, "Please input your username");
        pInput = JOptionPane.showInputDialog(null, "Please input your password");
        //now we send it to login
        status = dataObj.returnLoginStatus(nInput, pInput ,uName,pWord);

        JOptionPane.showMessageDialog(null,""+status+"\n"
                + "Welcome "+fName+" "+lName);
        }
//         now if the user is loged in we run the loop such that the can choose multipule options
//        we also need a new object to call upon the task class
        Task taskObj = new Task();
        int choice= 0;
        //our total hours counter
        int  totalHrs= 0;
        //task num is the counter for tasks
        int taskNum = 0;
        // we also want to run a check if the login was sucsessful
        boolean login = status.matches("Regestration succsesful");
        int taskTime = 0;
        //now we give the used the choice of what to do 
        // we also use 3 as our exit value
        while(choice < 3 && login != true )
        {
        choice = Integer.parseInt(JOptionPane.showInputDialog(null,"Welcome to EasyKanban\n"
                + "Plaese selcet one of the following\n"
                + "1 to add tasks \n"
                + "2 to show report\n"
                + "3 to quit "));
        // every time it loops we add to our total hrs
        totalHrs = taskObj.returnTotalHours(taskTime);
        //once they,ve made thier choice we can do our thing
        switch (choice)
        {  
        case 1:
            // now we just ask the user for all nesesary info
            String taskName = JOptionPane.showInputDialog("Please enter the task name");
            String taskDic = JOptionPane.showInputDialog("Please enter the task discription\n"
                    + "Note dicription must not succseed 50 characters");
            
            boolean tasklength =  taskObj.checkTaskDescription(taskDic);
            // now we run a quick check
            while(!tasklength)
            {
                JOptionPane.showMessageDialog(null, "Task discription exceedes 50 charcters");
            }
            String devName = JOptionPane.showInputDialog(null,"Please enter the developer name and surname");
            taskTime = Integer.parseInt(JOptionPane.showInputDialog("Please enter the task length in hours"));
            // converting taskNum to a strign for making our ID
            String snum = ""+taskNum;
            String ID = taskObj.createTaskID(snum,taskName,devName);
            // we use a button JOptionpane to give the users an easy choice
            //adapted from:
            //https://mkyong.com/swing/java-swing-joptionpane-showoptiondialog-example/
            String[] taskStat = {"To do", "Doing", "Done"};
              int x = JOptionPane.showOptionDialog(null, "Please enter a task status",
                "Click a button",       
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, taskStat,taskStat[0]);
            String stat = taskStat[x];
            String task = taskObj.printTaskDetails(taskName,snum,taskDic,devName,taskTime,ID,stat);
            JOptionPane.showMessageDialog(null,task);
            // counter for total hrs 
            
            taskNum++;
            
           break;
        case 2:
            JOptionPane.showMessageDialog(null,"Coming soon");
            break;
        case 3:
            //now we just show thier total hours 
            JOptionPane.showMessageDialog(null,"Total time for tasks: "+ totalHrs+"hrs");
            break;
        }
        }
    }
        
}
