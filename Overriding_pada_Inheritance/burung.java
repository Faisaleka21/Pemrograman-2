/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overriding_pada_Inheritance;

/**
 *
 * @author Fysl
 */
public class burung extends enemy // jadi setiap anakclass diberi "extends" untuk menguhubngkan anakclass ke induk.
        // enemy itu untuk sebuah induk
{
    void terbang(){
        System.out.println("Burung Terbang.");
    }
    void lompat(){
        System.out.println("Burung Melompat.");
    }
    void jalan(){
        System.out.println("Burung Jalan.");
    }
}
