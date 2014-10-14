/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Student extends Transcript{
    public Student(){
        super(); 
    }
    
    public Student(String itsfisrtname, String itslastname, String itsID, double itsgpa){
        super(itsfisrtname, itslastname, itsID, itsgpa);
    }
    
    public Transcript sentApplication(){
        return new Transcript(getFirstname(), getLastname(), getID(), getGPA());
    }
}
