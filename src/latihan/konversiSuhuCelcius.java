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
public class konversiSuhuCelcius {
     public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
       int a;
     System.out.print("Masukkan suhu celcius :");
     a= masukan.nextInt();
     System.out.println();
        System.out.println("================================");
        System.out.println("Konversi Suhu");
        System.out.println("================================");
        System.out.println("kelvin= "+(a + 273));
    System.out.println("Reamur= "+(a * 4 / 5));
    System.out.println("farenheit= "+((a * 9/5 ) + 32));
    
    
    }
}
