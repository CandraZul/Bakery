package interfaces;

/**
 *
 * @author candr
 */
public interface hargaBahan {
    
    double hgTepung = 40000.0 / 1000; 
    double hgGula = 25000.0 / 1000; 
    double hgButter = 23000.0 / 500; 
    double hgRagi = 5000.0 / 11;  
    double hgSusuBubuk = 39000.0 / 1000;  
    double hgSusuCair = 24000.0 / 1000;  
    double hgTelur = 23000.0 / 1000;  
    double hgEsBatu = 2000.0 / 1000;  
    double hgKeju = 31000.0 / 250;  
    double hgCoklat = 29000.0 / 500;
    double hgKrimVanilla = 30000.0 / 500;  
    double hgRedBean = 25000.0 / 500;  
    double hgSosis = 80000.0 / 1000;
    double hgSmokeBeef = 90000.0 / 1000;  
    double hgBombay = 40000.0 / 500;  

    double biayaBahan(String ingredient, double weight);
}
