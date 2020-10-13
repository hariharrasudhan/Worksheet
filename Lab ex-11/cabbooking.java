/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import java.util.Scanner;

/**
 *
 * @author Vimal Hari
 */
public class cabbooking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int one,two,three;
        booking book=new booking();
        people t1=new people(book);
        t1.start();
        people t2=new people(book);
        t2.start();
        people t3=new people(book);
        t3.start();
        
    }
    
}
class booking
{
    static int availablecabs=10;
    synchronized void bookcab() throws InterruptedException
    {
        int passengers;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of passengers:");
        passengers=obj.nextInt();
        System.out.println(Thread.currentThread().getName()+"entered");
        System.out.println("Available cabs:"+availablecabs+"        Passengers:"+passengers);
        if(availablecabs>0)
        {
            System.out.println("CABS ARE AVAILABLE!");
            Thread.sleep(100);
            System.out.println("No of passengers:"+passengers);
        }
        else
        {
            System.out.println("NO CABS AVAILABLE AT THIS TIME WAIT FOR FEW MINUTES....");
        }
    }
}
class people extends Thread
{
    booking book;
    int passengers;
    public people(booking book)
    {
        this.book=book;
    }
    @Override
    public void run()
    {
        try
        {
            book.bookcab();
        } catch (InterruptedException ex) {
            java.util.logging.Logger.getLogger(people.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }
}