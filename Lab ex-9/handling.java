/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

/**
 *
 * @author Vimal Hari
 */
public class handling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            int a[]=new int[3];
            a[10]=52;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        
        
        try
        {
        int a=10,b=0;
        int k=a/b;
        }
        catch(ArithmeticException e) // error handled
        {
            System.out.println(e);
        }
        
        
        
        String s="welcome to oops class";
        try
        {
        System.out.println(s.substring(5, 100));
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        
        
        try
        {
            int c=Integer.parseInt("143.24");    
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);   
        }
    
}}
