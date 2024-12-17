/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exeptions;

/**
 *
 * @author admin
 */public class ClassCastExceptionExample {
    public static void main(String[] args) {
        try {
            // Invalid type casting triggers ClassCastException
            Object obj = "Hello";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            // Handling ClassCastException for incompatible type casts
            System.out.println("ClassCastException occurred: " + e.getMessage());
        }
    }
}

  

