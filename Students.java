/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Students {
        int id;
        String name;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Students[] list=new Students[5];
        Scanner in= new Scanner(System.in);
        System.out.println(list.length);
        
        for(int i=0; i<list.length;i++)
        {
            list[i]=new Students();
            System.out.println("Enter Student ID");
            list[i].id=in.nextInt();
            System.out.println("Enter Student Name");
            list[i].name=in.next();
        
            System.out.println("ID is"+list[i].id+" Name is "+list[i].name);
        }
        //this is a test
    /**
     * @return the id
     */
   
    }
    
}
