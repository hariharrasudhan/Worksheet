/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Vimal Hari
 */
public class students {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        FileWriter fw=new FileWriter("stud.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        String str[]={"104-hari","105-vimal","106-rash","107-sam","108-anu"};
        for(String i:str)
        {
            bw.write(i);
            bw.newLine();
        }
        bw.close();
        System.out.println("Enter the rollno to retrieve the name of the student:");
        String str1=obj.next();
        int index=0;
        int c=0;
        boolean f=false;
        for(int i=0;i<str.length;i++)
        {
            if(str[i].contains(str1))
            {
                index=i;
                f=true;
                c=str1.length();
                break;
                
            }
        }
        if(f)
        {
            System.out.println(str[index].substring(c+1));
        }
        else
        {
            System.out.println("ROLLNO NOT FOUND");
        }
        
        
    }
    
}
