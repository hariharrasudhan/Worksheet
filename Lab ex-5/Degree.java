/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package degree;

/**
 *
 * @author Vimal Hari
 */
public class Degree {
    void getdegree(){
        System.out.println("I got a degree");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Degree obj=new Degree();
        obj.getdegree(); 
        obj=new undergraduate();
        obj.getdegree();
        obj=new postgraduate();
        obj.getdegree();
        
        
       
        // TODO code application logic here
    }
    
}
class undergraduate extends Degree
{
    @Override
    public void getdegree(){
        System.out.println("I am an undergraduate");
    }
}
class postgraduate extends Degree
{
    @Override
    public void getdegree(){
        System.out.println("I am a postgraduate");
    }
}