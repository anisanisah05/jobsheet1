/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author NISAH~05
 */
public class KonversiNilai {
     public static void main(String[] args){
     Scanner masukan = new Scanner(System.in);
     System.out.print("masukan nilai web : ");
     int nilai = masukan.nextInt();
     if (nilai>=90)
          System.out.println("nilai A");
     else if (nilai>=75)
         System.out.println("nilai B");
     else if (nilai>=50)
         System.out.println("nilai C");
     else if (nilai>=35)
         System.out.println("nilai D");
     else
         System.out.println("nilai E");
     
     }
}
