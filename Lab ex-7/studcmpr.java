/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Vimal Hari
 */
public class studcmpr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<student> list=new ArrayList<>();
        list.add(new student("surya","K1",8.5));
        list.add(new student("ajith","K2",8.8));
        list.add(new student("vijay","K3",8.1));
        list.add(new student("vjs","K4",8.9));
        list.add(new student("siva","K5",7.5));
        list.add(new student("arunvijay","K6",8.7));
        list.add(new student("nayanthara","K7",9.5));
        list.add(new student("trisha","K8",9.2));
        list.add(new student("ishwarya","K9",8.0));
        list.add(new student("keerthy","K10",9.7));
        list.add(new student("hrithick","K11",9.0));
        list.add(new student("ranveer","K12",7.4));
        list.add(new student("shaid","K13",8.6));
        list.add(new student("prabhas","K14",8.8));
        list.add(new student("mahesh","K15",9.7));
        list.add(new student("tamanna","K16",7.9));
        list.add(new student("taapsee","K17",8.9));
        list.add(new student("deepika","K18",8.7));
        list.add(new student("disha","K19",8.4));
        list.add(new student("katrina","K20",8.35));
        System.out.print(list);
        System.out.print("\nNAME IN DESCENDING ORDER");
        Collections.sort(list,new namesort());
        System.out.print(list);
        
        // TODO code application logic here
    }
    
}
class student
{
    String name,roll;
    double cgpa;
    student(String n,String r,double c)
    {
        name=n;
        roll=r;
        cgpa=c;
    }
    public String toString()
    {
            return "\nStudent name:"+name+"\tRollNO:"+roll+"\tCGPA:"+cgpa;
    }
}
class namesort implements Comparator<student>
{
    public int compare(student s1,student s2)
    {
      return s2.name.compareTo(s1.name);
    }
}