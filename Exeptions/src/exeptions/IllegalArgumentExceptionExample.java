/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exeptions;

/**
 *
 * @author admin
 */
  public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        try {
        // Passing invalid arguments triggers IllegalArgumentException

            setDiscount(-10); // Invalid argument
        } catch (IllegalArgumentException e) {
          // Handling IllegalArgumentException for invalid arguments

            System.out.println("IllegalArgumentException occurred: " + e.getMessage());
        }
    }

    public static void setDiscount(int percentage) {
        if (percentage < 0 || percentage > 100) {
            throw new IllegalArgumentException("Discount percentage must be between 0 and 100.");
        }
    }
}
  

