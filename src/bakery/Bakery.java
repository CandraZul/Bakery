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
        RotiManis r1 = new RotiManis(50, 1);
        System.out.println("==========================================");
        r1.printTotalHarga();
        r1.printBahan();
        r1.printKebutuhanTopFilRotiManis();
        System.out.println("==========================================");
        
        RotiManis r2 = new RotiManis(100, 2);
        System.out.println("==========================================");
        r2.printTotalHarga();
        r2.printBahan();
        r2.printKebutuhanTopFilRotiManis();
        System.out.println("==========================================");
        
        RotiManis r3 = new RotiManis(70, 3);
        System.out.println("==========================================");
        r3.printTotalHarga();
        r3.printBahan();
        r3.printKebutuhanTopFilRotiManis();
        System.out.println("==========================================");
        
        System.out.println("**********************************************");
        RotiTawar t1 = new RotiTawar(20, 1);
        t1.printTotalHarga();
        t1.printBahan();
        t1.printKebutuhanTopFilRotiTawar();
        System.out.println("**********************************************");
        
        System.out.println("**********************************************");
        RotiTawar t2 = new RotiTawar(15, 1);
        t2.printTotalHarga();
        t2.printBahan();
        t2.printKebutuhanTopFilRotiTawar();
        System.out.println("**********************************************");
        
        System.out.println("############################################");
        Pizza p1 = new Pizza(10, 1);
        p1.printTotalHarga();
        p1.printBahan();
        p1.printKebutuhanTopFilPizza();
        System.out.println("############################################");
    }
}
