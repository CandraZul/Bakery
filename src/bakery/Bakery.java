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
        System.out.println("Total harga : " + r1.hargaPerPcs());
        r1.printBahan();
    }
}
