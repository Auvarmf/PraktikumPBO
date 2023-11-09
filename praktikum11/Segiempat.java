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
public class Segiempat extends BangunDatar {
    private double sisi;

    public Segiempat(double sisi, String warna) {
      this.sisi = sisi;
      this.warna = warna;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    @Override
    public double luas() {
      return sisi * sisi;
    }

    @Override
    public double keliling() {
      return 4 * sisi;
    }
    
    @Override
    public void print(){
            System.out.println("Segiempat");
            System.out.println("Warna     : " + warna);
            System.out.println("Jari-jari : " + sisi);
            System.out.println("Luas      : " + luas());
            System.out.println("Keliling  : " + keliling());
            System.out.println();
    }
}
