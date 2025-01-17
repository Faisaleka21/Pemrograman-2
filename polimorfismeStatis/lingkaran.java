/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismeStatis;

/**
 *
 * @author Fysl
 */
public class lingkaran {
    //Hitung luas Lingkaran
    
    //memakai jari2
    float luas(float r){
        return (float) (Math.PI * r*r);
    }
    
    //memakai diameter
    double luas(double d){
        return (double) (Math.PI * d * 1/4 );
    }
    
    public static void main(String[] args) {
        lingkaran L=new lingkaran();
        
        System.out.println("=====  HITUNG LUAS LINGKARAN  =====");
        System.out.println("");
        
        float jari=2;
        double diameter=20;
        
        System.out.println("Luas Lingkaran memakai Jari-jari = "+L.luas(jari));
        System.out.println("Luas Lingkaran memakai Diameter = "+L.luas(diameter)); //output 
        
    }
}

