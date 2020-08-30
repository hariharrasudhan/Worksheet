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
public class interfaceprintable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      printable obj1=new rectangle();
        obj1.print();
        System.out.println("Enter SPORTSCAR details");
        obj1=new sportscar();
        obj1.print();
        System.out.println("Enter MANAGER details");
        obj1=new manager();
        obj1.print();
        // TODO code application logic here
    }
    
}
interface printable
{
    Scanner obj=new Scanner(System.in);
    abstract void print();
}
class rectangle implements printable
{
    @Override
    public void print()
    {
        int l,b;
        System.out.println("Enter Length:");
        l=obj.nextInt();
        System.out.println("Enter Breadth");
        b=obj.nextInt();
        System.out.println("Length of Rectangle:"+l);
        System.out.println("Breadth of Rectangle:"+b);
        System.out.println("Area of Rectangle:"+l*b);
        
    }
}
class sportscar implements printable
{
    @Override
    public void print()
    {
        String bn,m;
        int price;
        System.out.println("Enter BrandName:");
        bn=obj.next();
        System.out.println("Enter Model:");
        m=obj.next();
        System.out.println("Enter Price:");
        price=obj.nextInt();
        System.out.println("BRAND NAME:"+bn);
        System.out.println("MODEL:"+m);
        System.out.println("PRICE:"+price);
        
    }
}
class manager implements printable
{
    @Override
    public void print()
    {
        String name,id;
        int age,salary;
        System.out.println("Enter Name:");
        name=obj.next();
        System.out.println("Enter Age:");
        age=obj.nextInt();
        System.out.println("Enter Employee Id:");
        id=obj.next();
        System.out.println("Enter Salary Details:");
        salary=obj.nextInt();
        System.out.println("NAME:"+name);
        System.out.println("AGE:"+age);
        System.out.println("EMPLOYEE ID:"+id);
        System.out.println("SALARY DETAILS:"+salary);

    }
}
