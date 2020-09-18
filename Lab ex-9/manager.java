/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import java.util.Scanner;

/**
 *
 * @author Vimal Hari
 */
public class manager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER NAME:");
        String namee=obj.next();
        System.out.println("ENTER AGE:");
        int agee=obj.nextInt();
        System.out.println("ENTER QUALIFICATION:");
        String qn=obj.next();
        System.out.println("ENTER EXPERIENCE:");
        int exp=obj.nextInt();
        try
        {
            managerr m=new managerr(namee,agee,qn,exp);
            m.check();
        }
        catch(RoleNotApplicableException e)
        {
            System.out.println(e);
        }
    }
}
class managerr
{
    String name,qualification;
    int age,experience;
    managerr(String n,int a,String q,int e)
    {
        name=n;
        age=a;
        qualification=q;
        experience=e;
    }
    void check() throws RoleNotApplicableException
    {
        char c[]=qualification.toCharArray();
        int b=experience;
        for(int i=0;i<1;i++)
        {
            if(c[i]=='m' && c[i+1]=='b' && c[i+2]=='a')
            {
                System.out.println("");
                break;
            }
            else
            {
                throw new RoleNotApplicableException("NOT ELIGIBLE QUALIFICATION!");
            }
        }
        if(b<10)
        {
            throw new RoleNotApplicableException("NOT ELIGIBLE EXPERIENCE");
        }
        else
        {
            System.out.println("ROLE APPLICABLE");
        }
        System.out.println("QUALIFICATION:"+qualification+"\nEXPERIENCE:"+b);
    }
}
class RoleNotApplicableException extends Exception
{
    String message;
    RoleNotApplicableException(String m)
    {
        super(m);
    }
}
