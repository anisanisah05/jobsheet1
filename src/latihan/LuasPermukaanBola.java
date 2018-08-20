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
public class LuasPermukaanBola {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
       int a;
     System.out.print("Masukkan jari-jari :");
     a= masukan.nextInt();
     System.out.println();
        System.out.println("================================");
        System.out.println("Menghitung luas permukaan bola");
        System.out.println("================================");
        System.out.println("Luas Permukaan bola= "+(4 * 22 * a/7 * a));
    
    }
}
