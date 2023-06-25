package bakery;

import base.Roti;
import interfaces.hargaBahan;

/**
 *
 * @author CintaHabsari
 * @author 
 */
public class Pizza extends Roti implements hargaBahan{
    private int keju =30;
    private int sosis = 50;
    private int smokedbeef = 50;
    private int bombay = 30;
    
     public Pizza(int jumlah, int varian){
        this.tepungTerigu = 1000;
        this.gulaPasir = 100;
        this.butter = 100;
        this.ragi = 20;
        this.susuBubuk = 200;
        this.susuCair = 180;
        this.telur = 50;
        this.esBatu = 300;
        this.totalBerat = 1950;
        this.beratPerPcs = 190;
        
        if (jumlah < 1){
            System.out.println("Jumlah tidak valid");
            System.exit(0);
        }else{
            this.jmlPesanan=jumlah;
        }
        
        if (varian != 1){
            System.out.println("varian tidak ada");
            System.exit(0);
        } else {
            this.varian = varian;
        }
    }
    
    @Override
    protected double biayaVarian(){
        return hargaBahan.KEJU*30 +hargaBahan.SOSIS*50 +hargaBahan.SMOKED_B*50 +hargaBahan.BAWANG_B*30;
    }
    
    public void printKebutuhanTopFilPizza(){
        System.out.println("KEBUTUHAN TOPPING FILLING PIZZA VARIAN "+ this.varian);
        System.out.println("Keju            : "+this.keju+" gr");
        System.out.println("Sosis           : "+this.sosis+" gr");
        System.out.println("Smoked Beef     : "+this.smokedbeef+" gr");
        System.out.println("Bawang Bombay   : "+this.bombay+" gr");
        
    }
    
    
    

}
