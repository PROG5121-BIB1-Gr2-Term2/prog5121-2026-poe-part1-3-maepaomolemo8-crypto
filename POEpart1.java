/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepart1;
import java.util.Scanner;
/**
 *
 * @author Gomolemo
 */
public class POEpart1 {

    public static void main(String[] args) {
        //Declarations
        String name = "";
        String pass = "";
        String username;
        String password;
        String cellNumber = "";
        
        System.out.println("====Registration====");
        //Calling a method to preompt the create the user.
        checkUserName(name);
        
        checkPasswordComplexity(pass);
        
        checkCellNumber(cellNumber);
    }
    static void checkUserName(String name){
        Scanner scanner = new Scanner(System.in);
        
       //int nameAttempts = 0;
       //int nameMax = 5;
       
      // while(nameAttempts < nameMax){
        for (int i = 0; i < 10; i++) {
           
            
        
           System.out.print("Enter a name: ");
           name = scanner.nextLine();
           
           if(name.contains("_") && name.length()<= 5){
               System.out.println("Username successfully captured.");
               break;
           }else{
               //nameAttempts++;
               System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.");
           }
       }
    }

    public static void checkPasswordComplexity(String pass){
       
        Scanner scanner = new Scanner(System.in);
       
        
        for(int i = 0; i < 10; i++){
            System.out.println("Enter password: ");
            pass = scanner.nextLine();
            
            if(pass.length()<=8 && pass.matches(".*\\d+.*")){
                System.out.println("Password successfully captured.");
                break;
            }else{
                System.out.println("incorrect");
            }
        }
    
    
}
        
    static void checkCellNumber(String cellNumber){
        Scanner scanner = new Scanner(System.in);
        
       int cellAttempts = 0;
       int cellMax = 20;
       
       while(cellAttempts < cellMax){
           System.out.print("Enter a cell number: ");
           cellNumber = scanner.nextLine();
           
           if(cellNumber.startsWith("+27") && cellNumber.length()<= 12){
               System.out.println("Username successfully captured");
               break;
           }else{
               cellAttempts++;
               System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
           }
       }
    }
}
