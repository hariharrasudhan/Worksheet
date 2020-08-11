
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
public class auth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner obj=new Scanner(System.in);
        String name,email;
        char gender;
        System.out.println("Enter the name:");
        name=obj.next();
        System.out.println("Enter the email:");
        email=obj.next();
        System.out.println("Enter the Gender(m/f):");
        gender=obj.next().charAt(0);
        auther a1=new auther(name,email,gender);
        a1.getname();
        a1.getmail();
        a1.setmail();
        a1.gender();
        System.out.println(a1.tostring());
        // TODO code application logic here
    }
    
}
class auther
{
    Scanner obj=new Scanner(System.in);
    String name,email,setmail;
    char gender;
    auther(String i,String o,char s)
    {
        name=i;
        email=o;
        gender=s;
    }
    String getname()
    {
        return name;
    }
    String getmail()
    {
        return email;
    }
    String setmail()
    {
        System.out.println("Enter mail to set mail:");
        setmail=email;
        setmail=obj.next();
        return setmail;
    }
    char gender()
    {
        return gender;
    }
    String tostring()
    {
        return ("name:"+name+"\n"+"email:"+email+"\n"+"Gender:"+gender);
    }
}
        // TODO code application logic here
    
    
