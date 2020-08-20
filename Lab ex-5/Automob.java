/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automob;

import java.util.Scanner;

/**
 *
 * @author Vimal Hari
 */
public class Automob {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        automobile a=new automobile();
        a.getautodetails();
        a.showauto();
        
        car c=new car();
        c.getcardetails();
        c.showcar();
        
        truck t=new truck();
        t.gettruck();
        t.showtruck();
        // TODO code application logic here
    }
    
}
class automobile
{
    String maker;
    String id;
    float bbvalue;
    int year;
    int pass;
    Scanner obj=new Scanner(System.in);
    public void getautodetails()
    {
        System.out.println("ENTER CAR DETAILS:");
        System.out.println("enter maker name:");
        maker=obj.next();
        System.out.println("enter vehicle id:");
        id=obj.next();
        System.out.println("enter blue book value:");
        bbvalue=obj.nextFloat();
        System.out.println("enter year:");
        year=obj.nextInt();
        System.out.println("enter no of passesnger:");
        pass=obj.nextInt();
        
    }
    public void showauto()
    {
        System.out.println("CAR DETAILS:");
        System.out.println("MAKER NAME:"+maker);
        System.out.println("VEHICLE ID:"+id);
        System.out.println("BLUEBOOK VALUE:"+bbvalue);
        System.out.println("YEAR:"+year);
        System.out.println("NO OF PASSENGERS:"+pass);
    }
}
class car extends automobile
{
    boolean warr;
    int door;
    boolean imp;
    int topspd;
    String size;
    String rrdoor;
    public void getcardetails()
    {
        System.out.println("is there a warranty?");
        warr=obj.nextBoolean();
        System.out.println("enter no of doors:");
        door=obj.nextInt();
        System.out.println("enter the topspeed:");
        topspd=obj.nextInt();
        System.out.println("enter the size:");
        size=obj.next();
        System.out.println("enter the rear door:");
        rrdoor=obj.next();
        
    }
    public void showcar()
    {
        System.out.println("WARRANTY:"+warr);
        System.out.println("DOORS:"+door);
        System.out.println("TOPSPEED:"+topspd);
        System.out.println("SIZE:"+size);
        System.out.println("REAR DOOR:"+rrdoor);
    }
}
class truck extends automobile
{
    boolean topper;
    String wheels;
    int racks;
    public void gettruck()
    {
        System.out.println("ENTER TRUCK DETAILS:");
        System.out.println("is there a topper");
        topper=obj.nextBoolean();
        System.out.println("enter the wheels:");
        wheels=obj.next();
        System.out.println("enter the racks:");
        racks=obj.nextInt();
        
    }
    public void showtruck()
    {
        System.out.println("TRUCK DETAILS:");
        System.out.println("TOPPER:"+topper);
        System.out.println("WHEELS:"+wheels);
        System.out.println("RACKS:"+racks);
    }
}