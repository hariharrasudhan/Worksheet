/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hari Harra Sudhan
 */
public class counterfun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("counter function using non static :");
        counter c1=new counter();
        counter c2=new counter();
        counter c3=new counter();
        System.out.println("counter function using static :");
        counter2 c4=new counter2();
        counter2 c5=new counter2();
        counter2 c6=new counter2();
        // TODO code application logic here
    }
    
}
class counter{
    int count=0;
    counter(){
        count++;
        System.out.println(count);
    }
}
class counter2{
    static int count=0;
    counter2(){
        count++;
        System.out.println(count);
    }
}

        // TODO code application logic here
    
    

