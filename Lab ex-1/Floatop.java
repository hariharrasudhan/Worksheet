/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floatop;

import java.util.Scanner;

/**
 *
 * @author Vimal Hari
 */
public class Floatop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a float value");
        double a=obj.nextDouble();
        System.out.println("small integer not less than the number:"+(Math.ceil(a)));
        System.out.println("given number:"+a);
        System.out.println("large integer not greater than the number:"+(Math.floor(a)));
        
        // TODO code application logic here
    }
    
}
