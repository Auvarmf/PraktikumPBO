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
public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran(double jari, String warna) {
        this.jari = jari;
        this.warna = warna;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    @Override
    public double keliling(){
        return 2 * Math.PI * this.jari;
    }
    
    @Override
    public double luas(){
        return Math.PI * this.jari * this.jari;
    }
    
    @Override
    public void print(){
            System.out.println("Lingkaran");
            System.out.println("Warna     : " + warna);
            System.out.println("Jari-jari : " + jari);
            System.out.println("Luas      : " + luas());
            System.out.println("Keliling  : " + keliling());
            System.out.println();
    }
}
