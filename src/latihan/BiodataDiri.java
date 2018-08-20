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
public class BiodataDiri {
     public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
     String nama,nis,tempatlahir,tanggallahir,jeniskelamin,alamat,motto;
    
     System.out.println();
        System.out.println("================================");
        System.out.println("Biodata Diri");
        System.out.println("================================");
        System.out.println("nama = ");
        nama= masukan.next();
        
    System.out.println("nis = ");
    nis= masukan.next();
       
    System.out.println("tempat lahir = ");
    tempatlahir= masukan.next();
        
    System.out.println("tanggal lahir = ");
    tanggallahir= masukan.next();
        
    System.out.println("jenis kelamin = ");
    jeniskelamin= masukan.next();
       
    System.out.println("alamat di malang = ");
    alamat= masukan.next();
       
    System.out.println("motto hidup = ");
    motto= masukan.next();
        System.out.println();
    }
}
