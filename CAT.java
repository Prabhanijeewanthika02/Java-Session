/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cat;

/**
 *
 * @author Prabhani
 */public class CAT {
    
    public void eat() {    
        System.out.println("I'm eating");
    }

    public static void main(String[] args) {     // execute the program from Main method 
        
        CAT myCat1 = new CAT(); // Create an object of Cat class
  
        myCat1.eat();   // Calling the eat method
    }
}
