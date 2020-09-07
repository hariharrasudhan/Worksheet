/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Vimal Hari
 */
public class strlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER NO OF WORDS");
        int n=obj.nextInt();
        System.out.println("ENTER THE WORDS");
        for(int i=0;i<n;i++)
        {
            String word=obj.next();
            list.add(word);
        }
        System.out.println("ALL WORDS");
        System.out.println(list);
        System.out.println("PLURALS");
        list.replaceAll(e->e.toUpperCase());
        list.replaceAll(e->e+"s");
        System.out.println(list);
        System.out.println("REVERSE ORDER");
        Collections.reverse(list);
        System.out.println(list);
        System.out.println("ALL PLURALS REMOVED");
        list.removeIf(e->e.endsWith("s"));
        System.out.println(list);
        
        // TODO code application logic here
    }
    
}
