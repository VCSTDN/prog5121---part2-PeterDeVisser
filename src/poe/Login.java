/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author lab_services_student
 */
public class Login 
{
     // define our regester checker booleans 
   public boolean checkUserName(String tempUname)
   {
       //now we check that the user name meets the requirments of the user name  
   return(tempUname.contains("_") && tempUname.length() <= 5);
   }
   public boolean checkPasswordComplexity(String tempPword)
   {
       // check if the passcode  meets the requirment 
        /*
       regex was adapted from from https://www.w3schools.com/java/java_regex.asp
       and https://youtu.be/sXQxhojSdZM
       made by fireship 
       special characters  and numbers checker was taken from https://stackoverflow.com/questions/18057962/regex-pattern-including-all-special-characters
       */
      /// now we make our checked pattern for the string 
      Pattern sChar = Pattern.compile("[$&+,:;=?@#|'<>.-^*()%!]" ) ;
      Pattern wChar = Pattern.compile("[A-Za-z]");
      Pattern nChar = Pattern.compile("[0-9]");
      // now we do our checking 
      Matcher charCheck = (sChar.matcher(tempPword));
      Matcher wCheck = (wChar.matcher(tempPword));
      Matcher nCheck = (nChar.matcher(tempPword));
      
      return (charCheck.find()&& tempPword.length() > 8 && wCheck.find() && nCheck.find());
      }
    
   // now we make the regestration codec
   public String registerUser(String tempUname, String tempPword )
   {    
       //now we make our first loop control variable
       // loop boolean methode taken from:
       //https://stackoverflow.com/questions/22302860/java-while-loop-boolean-evaluation

       boolean uNameCheck = checkUserName(tempUname);
       
       while (!uNameCheck)
       {
           JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please \n" +
                                               "ensure that your username contains an \n" +
                                               "underscore and is no more than 5 characters in \n" +
                                               " length.");
           tempUname = JOptionPane.showInputDialog("Please input a user name");
           uNameCheck = checkUserName(tempUname);
       }
       String uName = tempUname;
       JOptionPane.showMessageDialog(null,"User name caputred succsefully");
       
       
       boolean pWordCheck = checkPasswordComplexity(tempPword);
       
       while (!pWordCheck)
       {
           JOptionPane.showMessageDialog(null,"Password is not correctly formatted, please \n" +
                                              "ensure that the password contains at least 8 \n" +
                                              "characters, a capital letter, a number and a \n" +
                                              "special character.");
           tempPword = JOptionPane.showInputDialog("Plese input a password");
           pWordCheck = checkPasswordComplexity(tempPword);
       }
       String pWord = tempPword;
       JOptionPane.showMessageDialog(null,"Password stored succsefully");
       
       String regStatus = "Regestration succsesful";
       
       return regStatus;
       
       
       
   }
   
   
   
   public String returnLoginStatus(String nameIn , String passIn, String uname , String pword)
   {
       //definfe our user input
       
       
       //defining our control boolean
        boolean loginstat = loginUser(nameIn , passIn, uname , pword);
        
        while (!loginstat)
        {
            JOptionPane.showMessageDialog(null, "Username or password is incorrect");
            nameIn = JOptionPane.showInputDialog("Please input your username");
            passIn = JOptionPane.showInputDialog("Please input your Password");
            loginstat = loginUser(nameIn , passIn, uname , pword);
        }
        return"Login Succsesfull ";
                
   }
    public boolean loginUser(String nameIn , String passIn , String uName , String pWord)
    {
    // now we check if the user input matches our stored name and password
    // string comparison method is taken from https://www.tutorialspoint.com/How-to-check-if-two-strings-are-equal-in-Java#:~:text=You%20can%20check%20the%20equality,of%20characters%20as%20this%20object.
    // made by Anjana
       return (nameIn.equals(uName)  && passIn.equals(pWord));
    }
}
