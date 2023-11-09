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
public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    
    public Segitiga(String warna, double alas, double tinggi) {
        super(warna);
        this.alas = alas;
        this.tinggi = tinggi;
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
    
    @Override
    public double luas() {
        return alas * tinggi / 2;
    }

    @Override
    public double keliling() {
      return alas + tinggi + alas;
    }
}
