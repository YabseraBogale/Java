/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testing;



/**
 *
 * @author yabsera
 */
public class Student {
    private String FirstName;
    private String LastName;
    private int IdNumber;
    public Student(String FirstName,String LastName,int IdNumber){
        
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.IdNumber=IdNumber;
        
    }
    public String getFirstName(){
        
        return FirstName;
        
    }
    public String getLastName(){
        
        return LastName;
        
    }
    public int getIdNumber(){
        
        return IdNumber;
    
    }
}
