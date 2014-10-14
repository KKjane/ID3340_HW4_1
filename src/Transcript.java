
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class Transcript {

    private double GPA;
    private String firstname;
    private String lastname;
    private String ID;

    public Transcript() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter firstname: ");
        firstname = sc.next();
        System.out.println("");
        System.out.print("Enter lastname: ");
        lastname = sc.next();
        System.out.println("");
        System.out.print("Enter ID: ");
        ID = sc.next();
        System.out.println("");
        System.out.print("Enter GPA: ");
        GPA = sc.nextDouble();
    }

    public Transcript(String itsfisrtname, String itslastname, String itsID, double itsgpa){
        firstname = itsfisrtname;
        lastname = itslastname;
        ID = itsID;
        GPA = itsgpa;
    }
    
    public String getFirstname(){
        return firstname;
    }
    
    public void setFirstname(String itsfirstname){
        firstname = itsfirstname;
    }
    
    public String getLastname(){
        return lastname;
    }
    
    public void setLastname(String itslastname){
        lastname = itslastname;
    }
    
    public String getID(){
        return ID;
    }
    
    public void setID(String itsID){
        ID = itsID;
    }
    
    public double getGPA(){
        return GPA;
    }
    
    public void setGPA(double itsgpa){
        GPA = itsgpa;
    }
    
    @Override
    public String toString(){
        return "name: " +getFirstname()+ " " +getLastname()+ "\n" + "ID: " +getID()+ "\n" + "GPA: " +getGPA(); 
    }
}
