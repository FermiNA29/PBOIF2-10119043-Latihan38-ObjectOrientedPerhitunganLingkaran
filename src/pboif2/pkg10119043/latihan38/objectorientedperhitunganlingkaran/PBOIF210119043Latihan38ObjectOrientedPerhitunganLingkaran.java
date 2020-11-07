/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan38.objectorientedperhitunganlingkaran;
import java.util.Scanner;
/**
 *
 * @author FERMI
 * NAMA      : FERMI NAUFAL AKABR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Prigram menghitung lingkaran dengan object oriented
 */
public class PBOIF210119043Latihan38ObjectOrientedPerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static int diameter,kondisi;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Lingkaran hitungLingkaran = new Lingkaran();
        System.out.println("===== Perhitungan Lingkaran =====");
        do {
            try {
                kondisi = 0;
                System.out.print("Masukan diameter lingkaran : ");
                diameter = scanner.nextInt();
                System.out.println();
                System.out.println("===== Hasil Perhitungan Lingkaran =====");
                hitungLingkaran.hitungJariJari(diameter);
                hitungLingkaran.hitungLuas();
                hitungLingkaran.hitungKeliling(diameter);
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Nilai diameter tidak sesuai");
                 kondisi = 1;
                 scanner.nextLine();
            }
        } while(kondisi == 1);
    }
    
}
