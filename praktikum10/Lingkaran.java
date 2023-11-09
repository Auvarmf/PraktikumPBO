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
public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran(String warna, double jari) {
        super(warna);
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }
    
    @Override
    public double luas(){
        return Math.PI * this.jari* this.jari;
    }
    
    @Override
    public double keliling(){
        return Math.PI * this.jari * 2;
    }
}
