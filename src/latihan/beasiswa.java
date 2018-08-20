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
public class beasiswa {
     public static void main(String[] args){
     Scanner masukan = new Scanner(System.in);
     System.out.print("masukan nilai tpa : ");
     int TPA = masukan.nextInt();
     System.out.print("masukan nilai bahasa inggris : ");
     int Bahasainggris = masukan.nextInt();
     if ((TPA > 85)&& (Bahasainggris > 80))
         System.out.println("Siswa dapat beasiswa");
     else
         System.out.println("Siswa tidak dapat beasiswa");
             
     }
}
