/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;
import hour.*;
import minute.*;
import second.*;
import java.util.Scanner;

/**
 *
 * @author Vimal Hari
 */
public class Time {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter second:");
        int sec=obj.nextInt();
        System.out.println("Enter minute:");
        int min=obj.nextInt();
        System.out.println("Enter hour:");
        int hr=obj.nextInt();
        hour h=new hour();
        minute m=new minute();
        second s=new second();
        h.hourtomin(hr);
        h.hourtosec(hr);
        m.mintohour(min);
        m.mintosec(min);
        s.sectohour(sec);
        s.sectomin(sec);
        // TODO code application logic here
    }
    
}
