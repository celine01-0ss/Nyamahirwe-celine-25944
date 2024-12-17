/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exeptions;
import java.io.*;

/**
 *
 * @author admin
 */
import java.io.*;
import java.io.*;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            // Trying to open a non-existent file
            BufferedReader reader = new BufferedReader(new FileReader("nonexistent.txt"));
            System.out.println(reader.readLine());
        } catch (FileNotFoundException e) {
            // Handling the FileNotFoundException when the file is missing
            System.out.println("FileNotFoundException occurred: " + e.getMessage());
        } catch (IOException e) {
            // Handling other IOExceptions
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}


