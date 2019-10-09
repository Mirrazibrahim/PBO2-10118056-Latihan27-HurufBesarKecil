/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118056.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Mirrazibrahim
 * KELAS    : IF-2
 * NIM      : 10118056
 */
public class PBO210118056Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukkan Kalimat : ");
        Scanner input = new Scanner(System.in);
        String kal = input.nextLine();
        String kal1 = kal.toUpperCase();
        String kal2 = kal.toLowerCase();
        
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : " + kal1);
        System.out.println("Huruf Kecil : " + kal2);
    }
    
}
