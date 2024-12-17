/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exeptions;


import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempting to write to a file in a directory that doesn't exist
            FileWriter writer = new FileWriter("/invalid_directory/output.txt");
            writer.write("Testing IOException");
            writer.close();
        } catch (IOException e) {
            // Handling the IOException when file writing fails
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}



     
   

