
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
public class electricitybill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner obj=new Scanner(System.in);
        String name,connection;
        int n,prev_red,cur_red;
        System.out.println("Enter the consumer name:");
        name=obj.next();
        System.out.println("Enter the consumer num:");
        n=obj.nextInt();
        System.out.println("Enter previous month reading:");
        prev_red=obj.nextInt();
        System.out.println("Enter the current month reading:");
        cur_red=obj.nextInt();
        System.out.println("enter the connection is (domestic/commercial)");
        connection=obj.next();
        eb a=new eb(n,name,prev_red);
        a.consumerno();
        a.consumername();
        a.previousmonthreading();
        a.currentmonthreading(cur_red);
        a.currentbill(connection,cur_red);
        // TODO code application logic here
    }
    
}
class eb
{
    int n,prev_red,cur_red;
    String name,connection;
    eb(int i,String o,int s)
    {
        n=i;
        name=o;
        prev_red=s;
    }
    int consumerno()
    {
        return n; 
    }
    String consumername()
    {
        return name;
    }
    int previousmonthreading()
    {
        return prev_red;
    }
    int currentmonthreading(int k)
    {
        cur_red=k;
        return cur_red;
    }
    void currentbill(String b,int c)
    {
        connection=b;
        cur_red=c;
        switch(connection)
        {
            case "domestic":
                if(cur_red<=100)
                {
                    System.out.println("Total Electricity Bill="+cur_red*2);
                    break;
                }
                else if(cur_red<=200)
                {
                    System.out.println("Total Electricity Bill="+(100*2)+(cur_red-100)*3.50);
                    break;
                }
                else if(cur_red<=500)
                {
                    System.out.println("Total Electricity Bill="+(100*2)+(100*3.50)+(cur_red-200)*5);
                    break;
                }
                else if(cur_red>500)
                {
                    System.out.println("Total Electricity Bill="+(100*2)+(100*3.50)+(200*5)+(cur_red-400)*6); 
                    break;
                }
            case "commercial":
                if(cur_red<=100)
                {
                    System.out.println("Total Electricity Bill="+cur_red*3);
                    break;
                }
                else if(cur_red<=200)
                {
                    System.out.println("Total Electricity Bill="+(100*2)+(cur_red-100)*5.50);
                    break;
                }
                else if(cur_red<=500)
                {
                    System.out.println("Total Electricity Bill="+(100*2)+(100*3.50)+(cur_red-200)*7);
                    break;
                }
                else if(cur_red>500)
                {
                    System.out.println("Total Electricity Bill="+(100*2)+(100*3.50)+(200*5)+(cur_red-400)*8);
                    break;
                }
            default:
                System.out.println("Incorrect Error!");
            
        }
    }
}

        // TODO code application logic here
    
    

