package bakery;

import base.Roti;
import interfaces.hargaBahan;

/**
 *
 * @author CintaHabsari
 */
public class RotiManis extends Roti implements hargaBahan{
    
    private int keju;
    private int coklat;
    private int redbean;
    private int sosis;
    private int krimvanilla;
    
    public RotiManis(int jumlah, int varian){
        this.tepungTerigu = 1000;
        this.gulaPasir = 150;
        this.butter = 150;
        this.ragi = 20;
        this.susuBubuk = 300;
        this.susuCair = 250;
        this.telur = 80;
        this.esBatu = 400;
        this.totalBerat = 2350;
        this.beratPerPcs = 50;
        
        if (jumlah < 1){
            System.out.println("Jumlah tidak valid");
            System.exit(0);
        }else{
            this.jmlPesanan=jumlah;
        }
        
        if (varian < 1 || varian > 3){
            System.out.println("varian tidak ada");
            System.exit(0);
        } else {
            this.varian = varian;
        }
        
        if (varian == 1){
            this.keju = 5;
            this.coklat = 10;
        }else if (varian == 2){
            this.krimvanilla=5;
            this.redbean=10;
        }else if (varian==3){
            this.keju=10;
            this.sosis=10;
        }
    }
    @Override
    protected double biayaVarian(){
        return switch (this.varian) {
            case 1 -> hargaBahan.KEJU*5 + hargaBahan.COKLAT*10;
            case 2 -> hargaBahan.SELAI_RB*10 + hargaBahan.KRIM_V*5;
            default -> hargaBahan.KEJU*10 + hargaBahan.SOSIS*10;
        };
    }
    
    public void printKebutuhanTopFilRotiManis(){
        System.out.println("KEBUTUHAN TOPPING FILLING ROTI MANIS VARIAN "+ this.varian);
        System.out.println("Keju        : "+this.keju+" gr");
        System.out.println("Coklat      : "+this.coklat+" gr");
        System.out.println("Red Bean    : "+this.redbean+" gr");
        System.out.println("Sosis       : "+this.sosis+" gr");
        System.out.println("Krim Vanila : "+this.krimvanilla+" gr");
    }
    

    
    
}
