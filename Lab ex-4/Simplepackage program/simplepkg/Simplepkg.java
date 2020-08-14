/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplepkg;
import simplepkg1.*;
import simplepkg1.multi.*;

import java.util.Scanner;

/**
 *
 * @author Vimal Hari
 */
public class Simplepkg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the integer:");
        int p=obj.nextInt();
        int q=obj.nextInt();
        addition x=new addition();
        subtraction y=new subtraction();
        multiplication z=new multiplication();
        x.add(p,q);
        y.sub(p,q);
        z.multi(p,q);
        
        
        // TODO code application logic here
    }
    
}
