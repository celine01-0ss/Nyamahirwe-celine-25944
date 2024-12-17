/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exeptions;

/**
 *
 * @author admin
 */
public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        try {
            // Converting invalid string format to number
            int num = Integer.parseInt("invalid123");
        } catch (NumberFormatException e) {
            // Handling NumberFormatException for invalid numeric conversions
            System.out.println("NumberFormatException occurred: " + e.getMessage());
        }
    }
}

  

