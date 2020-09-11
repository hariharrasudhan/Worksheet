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
public class strrev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          String str=new String();
          Scanner obj=new Scanner(System.in);
          System.out.println("ENTER THE STRING:");
          str=obj.next();
        char c[]=str.toCharArray();
        System.out.println("String before reverse:"+str);
        System.out.print("String after reverse:");
        for(int i=c.length-1;i>=0;i--)
        {
            System.out.print(c[i]);
        }
        // TODO code application logic here
    }
    
}
