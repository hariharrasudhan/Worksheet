
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
public class studentdata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         student a[]=new student[10];
         System.out.println("Enter the number of students:");
         Scanner obj=new Scanner(System.in);
         int n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i]=new student();
            a[i].getdata();
            a[i].display();
        }
        
        
        // TODO code application logic here
    }
    
}
class student
{
    int rollno;
    String name;
    static String college_name="Anna University";
    void getdata()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Roll no:");
        rollno=obj.nextInt();
        System.out.println("Enter the name:");
        name=obj.next();

    }
    void display()
    {
        System.out.println("------------------------------------------------");
        System.out.println("Name:"+name);
        System.out.println("Rollno:"+rollno);
        System.out.println("College_Name:"+college_name);
        System.out.println("------------------------------------------------");
    }

}
        // TODO code application logic here
    
    

