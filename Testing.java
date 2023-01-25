/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testing;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author yabsera
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input1 =new Scanner(System.in);
        Scanner input2 =new Scanner(System.in);
        Scanner input3 =new Scanner(System.in);
        String FirstName;
        String LastName;
        int IDNumber;
        
            try{
               System.out.printf("%s","Enter First Name: ");
               FirstName=input1.nextLine();
               System.out.printf("%s","Enter Last Name: "); 
               LastName=input2.nextLine();
               System.out.printf("%s","Enter ID number: ");
               IDNumber=input3.nextInt();
               Student person=new Student(FirstName,LastName,IDNumber);
               System.out.printf("%s\t%s%n%s\t%s%n%s\t%d%n","First Name:",person.getFirstName()
                    ,"Last Name:",person.getLastName(),"ID Number:",person.getIdNumber()
                );
            }
            catch(InputMismatchException e){
                System.out.printf("%s\t%s%n%s%n","Error: ",e,"Please Try Again");
            }
    }
    
}
