/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exeptions;


 
 public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempting to load a class that doesn't exist
            Class.forName("com.example.NonExistentClass");
        } catch (ClassNotFoundException e) {
            // Handling ClassNotFoundException for missing classes
            System.out.println("ClassNotFoundException occurred: " + e.getMessage());
        }
    }
}



