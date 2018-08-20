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
public class counter {
     public static void main(String[] args){
     Scanner masukan = new Scanner(System.in);
     System.out.print("masukan batas bilangan : ");
     int batas = masukan.nextInt();
     int hasil = 0;
     for(int i=1; i<=batas; i++)
         hasil += i;
     System.out.println("total jumlahnya adlah : " +hasil);
     }
}
