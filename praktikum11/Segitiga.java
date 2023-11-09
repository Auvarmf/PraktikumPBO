/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package praktikum11;

/**
 *
 * @author Auvar
 */
public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi, String warna) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.warna = warna;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    @Override
    public double luas() {
        return alas * tinggi / 2;
    }
    
    @Override
    public double keliling(){
        return alas + tinggi + alas;
    }
    
    @Override
    public void print(){
            System.out.println("Segitiga");
            System.out.println("Warna     : " + warna);
            System.out.println("Jari-jari : " + alas);
            System.out.println("Jari-jari : " + tinggi);
            System.out.println("Luas      : " + luas());
            System.out.println("Keliling  : " + keliling());
            System.out.println();
    }
}
