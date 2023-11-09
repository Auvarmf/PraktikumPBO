
package praktikum11;

/**
 *
 * @author Auvar
 */
public class Praktikum11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BangunDatar lingkaran = new Lingkaran(10, "Merah");
        BangunDatar segitiga = new Segitiga(13, 5, "Biru");
        BangunDatar segiempat = new Segiempat(5, "Hitam");
        
        BangunDatar[] bangunDatar = new BangunDatar[3];
        bangunDatar[0] = lingkaran;
        bangunDatar[1] = segitiga;
        bangunDatar[2] = segiempat;
        
        for(int i = 0;i < 3; i++){
            bangunDatar[i].print();
        }
    }
    
}
