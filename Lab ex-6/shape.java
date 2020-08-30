/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Scanner;

/**
 *
 * @author Vimal Hari
 */
public class shape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner obj=new Scanner(System.in);
        shapee obj1=new rectangle();
        obj1.a=10;
        obj1.b=5;
        obj1.printarea();
        obj1=new triangle();
        obj1.a=4;
        obj1.b=8;
        obj1.printarea();
        obj1=new circle();
        obj1.a=7;
        obj1.printarea();
        // TODO code application logic here
    }
    
}
abstract class shapee
{
    int a;
    int b;
    abstract void printarea();
}
class rectangle extends shapee
{
    @Override
    void printarea()
    {
        System.out.println("Area of the rectangle:"+a*b);
    }
}
class triangle extends shapee
{
    @Override
    void printarea()
    {
        System.out.println("Area of triangle:"+0.5*a*b);
    }
}
class circle extends shapee
{
    @Override
    void printarea()
    {
       System.out.println("Area of the circle:"+Math.PI*a*a); 
    }
}

