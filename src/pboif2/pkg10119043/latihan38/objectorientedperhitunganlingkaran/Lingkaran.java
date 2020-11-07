/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan38.objectorientedperhitunganlingkaran;

/**
 *
 * @author FERMI
 * NAMA      : FERMI NAUFAL AKABR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Prigram menghitung lingkaran dengan object oriented
 */
public class Lingkaran {
    private int jariJari;
    private  double phi = 3.14;
    private  double luas;
    private  double keliling;
    
    
    public void hitungJariJari(int diameter) {
        jariJari = diameter/2;
        System.out.println("Jari-jari lingkaran\t : " + jariJari);
    }
    
    public void hitungLuas() {
        luas = phi * jariJari * jariJari;
        System.out.println("luas lingkaran\t\t : " + luas);
    }
    
    public void hitungKeliling(int diameter) {
        keliling = phi * diameter;
        System.out.println("Keliling lingkaran\t : " + keliling);
    }
    
}
