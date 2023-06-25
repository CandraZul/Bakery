package bakery;

import base.Roti;
import interfaces.hargaBahan;

/**
 *
 * @author CintaHabsari
 */
public class Pizza extends Roti implements hargaBahan{
     public Pizza(int jumlah){
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
        
        
    }
    
    @Override
    protected double biayaVarian(){
        return hargaBahan.KEJU*30 +hargaBahan.SOSIS*50 +hargaBahan.SMOKED_B*50 +hargaBahan.BAWANG_B*30;
    }
    
    double biayaRotitanpatopping(){
        return this.biayaPerDough()/(this.totalBerat/this.beratPerPcs);
    }

    

    
}
