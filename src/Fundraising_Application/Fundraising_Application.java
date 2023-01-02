/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fundraising_Application;

import static Fundraising_Application.User.Accountscounter;
import javax.swing.JScrollPane;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Fundraising_Application {

   
   
}



class User implements Serializable {


    String Username;
    String Password;
    String Email;
    String phoneNumber;
    
    
    static int Accountscounter = 0;
    
    String arrayofUsersAccounts[][] = new String[1][10];
    
    User(){
        
        
    }   

}


class RegisteredDoner extends User {
    
  
    int ApplicationNumber;  // not in database 
    
   
    String Adress;
    String AccountNumber;
    String CreditCard;
           
            
     RegisteredDoner(int A, String B, String C, String D, String E,String F, String G,String H){
        
        this.ApplicationNumber = A;
        this.Username = B;
        this.Password = C;
        this.Email = D;
        this.phoneNumber =E;
        this.Adress = F;
        this.AccountNumber = G;
        this.CreditCard = H;
   
        Accountscounter++;
        
    } 

    public int getApplicationNumber() {
        return ApplicationNumber;
    }
     
    public String getName() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAdress() {
        return Adress;
    }

    public static int getAccountscounter() {
        return Accountscounter;
    }

    public String[][] getArrayofUsersAccounts() {
        return arrayofUsersAccounts;
    }

    public String getAccountNumber() {
        
        return AccountNumber;
        
    }
    
    public void setAccountNumber(String accNumber) {
        
        AccountNumber = accNumber;  
        
    }
    
    public String getCreditCardNumber() {
        
        return CreditCard;
        
    }
    
    public void setCreditCardNumber(String ccNumber) {
        
        CreditCard = ccNumber;  
        
    }
 
   
    
}



////////////////////////////////////////////////////////////////////////////

class Admin extends User {
    
  
    
           
            
     Admin(String A, String B, String C, String D){
        
        
        this.Username = A;
        this.Password = B;
        this.Email = C;
        this.phoneNumber =D;
        
        Accountscounter++;
        
    } 

    
     
    public String getName() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static int getAccountscounter() {
        return Accountscounter;
    }

    public String[][] getArrayofUsersAccounts() {
        return arrayofUsersAccounts;
    }

}


//////////////////////////////////////////////////////////////////

class Volunteer extends User {
    
  
    int ApplicationNumber;
    
    String name;
    String YearLevel;
    String MajorDepartment;
    String Address;
    String NationalID;
    String Major;
    int Level; 
    String Documentation;    
            
     Volunteer(int A, String B, String C, int D, String E, String F,String G,String H){
        
        this.ApplicationNumber = A;
        this.Username = null;
        this.name = B;
        this.Major = C;
        this.Level = D;
        this.Password = null;
        this.Email = E;
        this.phoneNumber =F;
        this.Address = G;
        this.Documentation = H;
   
        Accountscounter++;
        
    } 

    public int getApplicationNumber() {
        return ApplicationNumber;
    }
     
    public String getName() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public static int getAccountscounter() {
        return Accountscounter;
    }

    public String[][] getArrayofUsersAccounts() {
        return arrayofUsersAccounts;
    }

    
}



class VolunteerState implements Serializable{
    
    String CurrentCustomerState;
    
    
    
    VolunteerState(String CustomerUserName){
        
        this.CurrentCustomerState = CustomerUserName;
        
    }
     
    
}

class VolunteerApplications implements Serializable{
    
    private String ApplicationNumber;
    private String Applicationstatus;
    
    
    VolunteerApplications(String A, String B){
        
        this.ApplicationNumber = A;
        this.Applicationstatus = B;
    }
      
    
}



///////////////////////////////////////////////////////////////////////////







    
class Donations implements Serializable{
    
    private int Balance;
    
    
    Donations(int Balance){
        
        this.Balance = Balance;
        
    }
    
    public int getBalance() {
        
        return Balance;
        
    }
    
    int CheckBalance(){
        
        return Balance;
    }
    
}
    
    
   
    
  
    
    
    
    
   
    
    
    



