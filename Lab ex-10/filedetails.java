/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Vimal Hari
 */
public class filedetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER FILENAME:");
        String filename =obj.next();
        File f=new File(filename);
        char c[]=filename.toCharArray();
        for(char i:c)
        {
            if(i=='.')
            {
                System.out.println("Type of the file:"+c[i]);
            }
        }
        System.out.println("File Exists:"+f.exists());
        System.out.println("Length of file:"+f.length()+"bytes");
        System.out.println("File is readable:"+f.canRead());
        System.out.println("File is writable:"+f.canWrite());
    }
    
}
