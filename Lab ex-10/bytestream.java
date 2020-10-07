/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;


import java.io.FileInputStream;
import java.io.FileOutputStream;
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
       FileInputStream f= null;   
       FileOutputStream f1=null;
        {
        f= new FileInputStream("C:\\Users\\Vimal Hari\\Documents\\NetBeansProjects\\lab10\\src\\lab10\\input.jpg");
         f1=new FileOutputStream("C:\\Users\\Vimal Hari\\Documents\\NetBeansProjects\\lab10\\src\\lab10\\output.jpg");
         int b;
         while((b=f.read())!=-1)
         {
             f1.write(b);
         }
         f1.close();
             
         }
        }
    }
    

