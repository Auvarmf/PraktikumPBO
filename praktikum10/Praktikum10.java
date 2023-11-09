/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum10;

/**
 *
 * @author Auvar
 */
public class Praktikum10 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar("Hitam"); 
        System.out.println("Warna bangun datar : " + bd.getWarna());
        System.out.println();
        
        Lingkaran lingkaran = new Lingkaran("Merah", 26.0);
        System.out.println("Luas Lingkaran    : " + String.format("%.2f", lingkaran.luas()));
        System.out.println("Kelilig Lingkaran : " + String.format("%.2f", lingkaran.keliling()));
        System.out.println();
        
        Segitiga segitiga = new Segitiga("Kuning", 15, 7);
        System.out.println("Luas Segitiga    : " + String.format("%.2f", segitiga.luas()));
        System.out.println("Kelilig Segitiga : " + String.format("%.2f", segitiga.keliling()));
        System.out.println();
        
        Segiempat segiempat = new Segiempat("Hijau", 10);
        System.out.println("Luas Segiempat    : " + String.format("%.2f", segiempat.luas()));
        System.out.println("Kelilig Segiempat : " + String.format("%.2f", segiempat.keliling()));
        System.out.println();
        
    }
    
}
