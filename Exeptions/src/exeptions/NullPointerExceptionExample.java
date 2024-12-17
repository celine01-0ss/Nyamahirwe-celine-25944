/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exeptions;

/**
 *
 * @author admin
 */
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            // Null reference access triggers NullPointerException
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            // Handling NullPointerException for null object access
            System.out.println("NullPointerException occurred: " + e.getMessage());
        }
    }
}
 

