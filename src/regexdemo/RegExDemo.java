/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regexdemo;

import java.util.Scanner;

/**
 *
 * @author derek
 */
public class RegExDemo {
//^\d{3}-\d{2}-\d{4}$
    static boolean validSSN(String SSN){
        if(SSN.matches("^\\d{3}-\\d{2}-\\d{4}$")){
            return true;
        }
        else{
            return false;
        }
    }
    static String getNumber(){
        //get 9 digit number
        //if not digit OR not exactly 9 digits, repeat
        //^[+]?\d*$
        
        String theInput = "";
        Scanner keyboard = new Scanner(System.in);
        do{
            System.out.println("Enter 9 digits");
            theInput = keyboard.nextLine();
        }while(theInput.length() !=9 || !theInput.matches("^[+]?\\d*$"));
        
        return theInput;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String someSSN = "111-22-3333";
        someSSN = getNumber();
        String fixedSSN = someSSN.substring(0, 3) + "-" + someSSN.substring(3, 5) + "-" + someSSN.substring(5, 9);
        System.out.println(fixedSSN);
        
        if(validSSN(fixedSSN)){
            System.out.println("Valid SSN - do something in code");
        }
        else{
            System.out.println("Invalid SSN - send the FBI");
        }
    }
    
}
