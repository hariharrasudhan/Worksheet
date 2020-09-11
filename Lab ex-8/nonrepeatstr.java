/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.Scanner;

/**
 *
 * @author Vimal Hari
 */
public class nonrepeatstr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String str=new String();
         Scanner obj=new Scanner(System.in);
         System.out.println("ENTER THE STRING:");
         str=obj.next();
        System.out.println("The given string : "+str);
        boolean found=false;
        for(int i=0;i<str.length();i++)
        {
            found=true;
            char c=str.charAt(i);
            for(int j=0;j<str.length();j++)
            {
                if(c==str.charAt(j) && j!=i)
                {
                    found=false;
                    break;
                }}
                if(found)
                {
                    System.out.println("The first non repeated character in String is:"+c);
                    break;
                }
            }
            if(!found)
            {
                System.out.println("No single character found");
            }
        // TODO code application logic here
    }}
    
