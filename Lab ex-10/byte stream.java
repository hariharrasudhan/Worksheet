/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 *
 * @author Vimal Hari
 */
public class bytestream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedInputStream read = new BufferedInputStream(System.in);
        try {
            System.out.print("Enter any character: ");
            char c = (char)read.read();
            System.out.println("You have entered '" + c + "'");
        }
	catch(Exception e) {
            System.out.println(e);
        }
        finally {
            read.close();
        }
        }
    }
    

