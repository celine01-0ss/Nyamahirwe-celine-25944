/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exeptions;

/**
 *
 * @author admin
 */
import java.io.*;

public class EOFExceptionExample {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"))) {
            while (true) {
                // Attempting to read integers from the file until the end
                System.out.println(dis.readInt());
            }
        } catch (EOFException e) {
            // Handling EOFException when the end of the file is reached
            System.out.println("EOFException occurred: End of file reached.");
        } catch (IOException e) {
            // Handling other IOExceptions
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}

  

