/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author NISAH~05
 */
public class ANISAH{
public static void main(String[]args)
{
        hurufA();
        hurufN();
        hurufI();
        hurufS();
        hurufAA();
        hurufH();
}

    
     public static void hurufA() {
    for (int sp = 0; sp < 2; sp++) {
            System.out.println("");
        }
        for (int sp = 0; sp < 5; sp++) {
            System.out.print(" ");
        }
        System.out.println("@");//baris1
        for (int sp = 0; sp < 3; sp++) {
            System.out.print(" ");
        }
        System.out.print("@");
        for (int sp2 = 0; sp2 < 3; sp2++) {
            System.out.print(" ");
        }
        System.out.println("@");//baris2
        for (int sp = 0; sp < 2; sp++) {
            System.out.print(" ");
        }
        System.out.print("@");
        for (int sp2 = 0; sp2 < 3; sp2++) {
            System.out.print(" @");
        }
        System.out.println();//baris3
        for (int sp = 0; sp < 1; sp++) {
            System.out.print(" ");
        }
        System.out.print("@");
        for (int sp2 = 0; sp2 < 7; sp2++) {
            System.out.print(" ");
        }
        System.out.println("@");//baris4
        System.out.print("@");
        for (int sp2 = 0; sp2 < 9; sp2++) {
            System.out.print(" ");
        }
        System.out.println("@");//baris5
    
     }
public static void hurufN() {
    
    int k,l,m,n;
    for(k=1;k<=4;k++){
        for(l=1;l<=1;l++){
            System.out.print("@");
    }
    for(m=2;m<=3;m++){
        if(k==m){
            System.out.print("@");
        }
        else{
            System.out.print(" ");
        }
    }
    for(n=1;n<=1;n++){
        System.out.print("@");
    }
    System.out.println();
    }
}
 public static void hurufI() {
    
   
        int sp;
        for (sp = 0; sp < 2; sp++) {
            System.out.println(" ");//spasi
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("@@");
        }//i semua
 }
  public static void hurufS() {
    
           int sp;
        for (sp = 0; sp < 2; sp++) {
            System.out.println("");
        }//spasi
        for (int s = 0; s < 7; s++) {
            System.out.print("@");
        }
        System.out.println("");
        for (int s = 0; s < 2; s++) {
            System.out.print("@");
        }
        System.out.println("");
        for (int s = 0; s < 7; s++) {
            System.out.print("@");
        }
        System.out.println("");
        for (int s = 0; s < 5; s++) {
            System.out.print(" ");
        }
        System.out.println("@@");
        for (int s = 0; s < 7; s++) {
            System.out.print("@");
        }
        System.out.println("");
    }
 public static void hurufAA() {
    for (int sp = 0; sp < 2; sp++) {
            System.out.println("");
        }
        for (int sp = 0; sp < 5; sp++) {
            System.out.print(" ");
        }
        System.out.println("@");//baris1
        for (int sp = 0; sp < 3; sp++) {
            System.out.print(" ");
        }
        System.out.print("@");
        for (int sp2 = 0; sp2 < 3; sp2++) {
            System.out.print(" ");
        }
        System.out.println("@");//baris2
        for (int sp = 0; sp < 2; sp++) {
            System.out.print(" ");
        }
        System.out.print("@");
        for (int sp2 = 0; sp2 < 3; sp2++) {
            System.out.print(" @");
        }
        System.out.println();//baris3
        for (int sp = 0; sp < 1; sp++) {
            System.out.print(" ");
        }
        System.out.print("@");
        for (int sp2 = 0; sp2 < 7; sp2++) {
            System.out.print(" ");
        }
        System.out.println("@");//baris4
        System.out.print("@");
        for (int sp2 = 0; sp2 < 9; sp2++) {
            System.out.print(" ");
        }
        System.out.println("@");//baris5
    
     }
  public static void hurufH() {
    
    int k,l,m,n,o;
    for(k=1;k<=5;k++){
        for(l=1;l<=1;l++){
            System.out.print("@");
    }
    for(m=3;m<=3;m++){
        for(o=1;o<=3;o++)
        if(k==m){
            System.out.print("@");
        }
        else{
            System.out.print(" ");
        }
    }
    for(n=1;n<=1;n++){
        System.out.print("@");
    }
    System.out.println();
    }
    }
}
