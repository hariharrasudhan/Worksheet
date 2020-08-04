/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odd.eve;

import java.util.Scanner;

/**
 *
 * @author Vimal Hari
 */
public class OddEve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner obj=new Scanner(System.in);
        int i,n,a[];
        System.out.println("Enter the size of array:");
        n=obj.nextInt();
        a=new int[n];
        System.out.println("Enter the elements in array :");
        for(i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("Odd Numbers:");
        for(i=0;i<n;i++)
        {
            if(a[i]%2!=0)
            {
                System.out.println(a[i]);
            }
        }
        System.out.println("Even Numbers:");
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                System.out.println(a[i]);
            }
        }
        // TODO code application logic here
    }
    
}

        
    
    

