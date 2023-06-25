package base;

import interfaces.hargaBahan;
import java.text.DecimalFormat;

/**
 *
 * @author candr
 */
public abstract class Roti implements hargaBahan{
    protected int tepungTerigu;
    protected int gulaPasir;
    protected int butter;
    protected int ragi;
    protected int susuBubuk;
    protected int susuCair;
    protected int telur;
    protected int esBatu;
    protected int varian;
    protected double totalBerat;
    protected int jmlPesanan;
    protected int beratPerPcs;
    
    protected double biayaPerDough(){
        return hargaBahan.TEPUNG_TERIGU * this.tepungTerigu + hargaBahan.GULA_PASIR*this.gulaPasir + hargaBahan.BUTTER*this.butter + hargaBahan.RAGI*this.ragi + hargaBahan.SUSU_BUBUK*this.susuBubuk + hargaBahan.SUSU_CAIR*this.susuCair + hargaBahan.TELUR*this.telur + hargaBahan.ES_BATU*this.esBatu;
    }
    
    protected double biayaKosongan(){
        return this.biayaPerDough()/(this.totalBerat/this.beratPerPcs);
    }
    
    protected double biayaPerPcs(){
        return this.biayaKosongan() + this.biayaVarian();
    }
    protected double biayaVarian(){
        return this.varian;
    }
    public double  hargaPerPcs(){
        return this.biayaPerPcs() + this.biayaPerPcs()*40./100 ;
    }
    
    protected double kebutuhanTepung(){
        return (this.tepungTerigu/(this.totalBerat / this.beratPerPcs))*this.jmlPesanan;
    }
    
    protected double kebutuhanGula(){
        return (this.gulaPasir/(this.totalBerat / this.beratPerPcs))*this.jmlPesanan;
    }
    
    protected double kebutuhanButter(){
        return (this.butter/(this.totalBerat / this.beratPerPcs))*this.jmlPesanan;
    }
    
    protected double kebutuhanRagi(){
        return (this.ragi/(this.totalBerat / this.beratPerPcs))*this.jmlPesanan;
    }
    
    protected double kebutuhanSusuBubuk(){
        return (this.susuBubuk/(this.totalBerat / this.beratPerPcs))*this.jmlPesanan;
    }
    
    protected double kebutuhanSusuCair(){
        return (this.susuCair/(this.totalBerat / this.beratPerPcs))*this.jmlPesanan;
    }
    
    protected double kebutuhanTelur(){
        return (this.telur/(this.totalBerat / this.beratPerPcs))*this.jmlPesanan;
    }
    
    protected double kebutuhanEsBatu(){
        return (this.esBatu/(this.totalBerat / this.beratPerPcs))*this.jmlPesanan;
    }
    
    public void printBahan() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("========== B A H A N =========");
        System.out.println("Tepung      : " + df.format(kebutuhanTepung()) + " gr");
        System.out.println("Gula        : " + df.format(kebutuhanGula()) + " gr");
        System.out.println("Butter      : " + df.format(kebutuhanButter()) + " gr");
        System.out.println("Ragi        : " + df.format(kebutuhanRagi()) + " gr");
        System.out.println("Susu bubuk  : " + df.format(kebutuhanSusuBubuk()) + " gr");
        System.out.println("Susu Cair   : " + df.format(kebutuhanSusuCair()) + " gr");
        System.out.println("Telur       : " + df.format(kebutuhanTelur()) + " gr");
        System.out.println("Es Batu     : " + df.format(kebutuhanEsBatu()) + " gr");
    }
    
}
   
