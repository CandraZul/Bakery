package bakery;

import base.Roti;
import interfaces.hargaBahan;

/**
 *
 * @author CintaHabsari
 */
public class RotiTawar extends Roti implements hargaBahan {
    protected int keju = 80;
    protected int coklat = 80;
    public RotiTawar(int jumlah, int varian){
        this.tepungTerigu = 1000;
        this.gulaPasir = 125;
        this.butter = 100;
        this.ragi = 20;
        this.susuBubuk = 250;
        this.susuCair = 200;
        this.telur = 70;
        this.esBatu = 300;
        this.totalBerat = 2065;
        this.beratPerPcs = 400;
        
        if (jumlah < 1){
            System.out.println("Jumlah tidak valid");
            System.exit(0);
        }else{
            this.jmlPesanan=jumlah;
        }
        
        if (varian < 1 || varian > 2){
            System.out.println("varian tidak ada");
            System.exit(0);
        } else {
            this.varian = varian;
        }
        
        
    }
    @Override
    protected double biayaVarian(){
        return switch (this.varian) {
            case 1 -> hargaBahan.COKLAT*80;
            default -> hargaBahan.KEJU*80;
        };
    }
    
    
    public void printKebutuhanTopFilRotiTawar(){
        System.out.println("KEBUTUHAN TOPPING FILLING ROTI TAWAR VARIAN "+ this.varian);
        System.out.println("Keju    : "+this.keju+" gr");
        System.out.println("Coklat  : "+this.coklat+" gr");
    }
}
