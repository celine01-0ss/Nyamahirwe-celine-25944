/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exeptions;

/**
 *
 * @author admin
 */
 

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            // Division by zero, which triggers ArithmeticException
            int result = 100 / 0;
        } catch (ArithmeticException e) {
            // Handling ArithmeticException for invalid arithmetic operations
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        }
    }
}
