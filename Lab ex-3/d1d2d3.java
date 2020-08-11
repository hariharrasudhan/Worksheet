
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hari Harra Sudhan
 */
public class d1d2d3 {
    static int d1[]=new int[10];
    static int d2[][]=new int[10][10];
    static int d3[][][]=new int[10][10][10];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of 1D:");
        int n1=obj.nextInt();
        System.out.println("enter the value in array:");
        for(int i=1;i<=n1;i++)
        {
            d1[i]=obj.nextInt();
        }
        System.out.println("=========================================");
        System.out.println("One Dimensional array:");
        for(int i=1;i<=n1;i++)
        {
            System.out.println(d1[i]);
        }
        System.out.println("=========================================");
        System.out.println("Enter the size of 2D");
        int n2=obj.nextInt();
        int n3=obj.nextInt();
        System.out.println("Enter the value in 2D");
        for(int i=0;i<n2;i++)
        {
            for(int j=0;j<n3;j++)
            {
                d2[i][j]=obj.nextInt();
            }
            
        }
        System.out.println("Enter the value in 2D");
        System.out.println("=================================================");
        System.out.println("Two Dimensional Array:");
        for(int i=0;i<n2;i++)
        {
            System.out.println("");
            for(int j=0;j<n3;j++)
            {
                System.out.print(+d2[i][j]+"    ");
            }
        }
        System.out.println("");
        System.out.println("=================================================");
        System.out.println("Enter the size of array:");
        int n4=obj.nextInt();
        int n5=obj.nextInt();
        int n6=obj.nextInt();
        System.out.println("Enter the value of 3D:");
        for(int i=0;i<n4;i++)
        {
            for(int j=0;j<n5;j++)
            {
                for(int k=0;k<n6;k++)
                {
                    d3[i][j][k]=obj.nextInt();
                }
            }
        }
         for(int i=0;i<n4;i++)
        {
            for(int j=0;j<n5;j++)
            {System.out.println("");
                for(int k=0;k<n6;k++)
                {
                    System.out.print(d3[i][j][k]+"     ");
                }
            }
        }
        
        
        // TODO code application logic here
    }
    
}

        
   
    

