/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakery;

/**
 *
 * @author candr
 */
public class Bakery {
    public static void main(String[] args) {
        RotiManis r1 = new RotiManis(1, 1);
        System.out.println("Harga Roti Manis: " + r1.hargaPerPcs());
        r1.printBahan();
        
        Pizza p1 = new Pizza(10, 1);
        System.out.println("Harga Pizza: " + p1.hargaPerPcs());
        p1.printBahan();
        
        RotiTawar t1 = new RotiTawar(1, 1);
        System.out.println("Harga Roti Manis: " +t1.hargaPerPcs());
        t1.printBahan();
    }
}
