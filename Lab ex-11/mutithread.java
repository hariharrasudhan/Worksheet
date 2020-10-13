/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import java.util.Random;

/**
 *
 * @author Vimal Hari
 */
public class mutithread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        number n=new number();
        n.start();
    }
    
}
class number extends Thread
{
    @Override
    public void run()
    {
        Random random=new Random();
        for(int i=0;i<10;i++)
        {
            int randomint=random.nextInt(100);
            System.out.println("GENERATED RANDOMNO:"+randomint);
            if(randomint%2==0)
            {
            square s=new square(randomint);
            s.start();
            }
            else
            {
            cube c=new cube(randomint);
            c.start();
            }
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
class square extends Thread
{
    int x;
    square(int n)
    {
        x=n;
    }
    @Override
    public void run()
    {
        int sq=x*x;
        System.out.println("Square Of "+x+"="+sq);
    }
}
class cube extends Thread
{
    int x;
    cube(int n)
    {
        x=n;
    }
    @Override
    public void run()
    {
        int cube=x*x*x;
        System.out.println("Cube Of "+x+"="+cube);
    }
}