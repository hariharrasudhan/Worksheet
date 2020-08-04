/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;

import java.util.Scanner;

/**
 *
 * @author Vimal Hari
 */
public class Prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int n,temp;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=obj.nextInt();
        for(int i=2;i<n;i++)
        {
            temp=0;
            for(int j=2;j<i;j++)
            {
               if(i%j==0)
               {
                   temp=1;
               }
            }
            if(temp==0)
            {
                System.out.println(i);
            }
        }
        // TODO code application logic here
    }
    
}

      
    
    

