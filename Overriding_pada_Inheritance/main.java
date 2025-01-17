/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overriding_pada_Inheritance;

/**
 *
 * @author Fysl
 */
public class main {
    public static void main(String[] args) {
        
        //untuk pemanggilan intherince 
        burung b=new burung();
        enemy e= new enemy();
        pocong p=new pocong();
        zombie z=new zombie();
        
        //burung
        b.hp=200;
        b.nama="Dwi";
        b.terbang();
        System.out.println("------------------------");
        System.out.println("Nama Burng : "+b.nama);
        System.out.println("Darah : "+b.hp);
        
        System.out.println("======================================");
        System.out.print("Burung "+b.nama+ " menyerang ");p.loncat();
        System.out.println("______________________________________");
        
        
        //pocong
        p.nama="Susi";
        p.hp=100;
        p.serang();
        System.out.println("------------------------");
        System.out.println("Nama Pocong : "+p.nama);
        System.out.println("Darah : "+p.hp);
        
        
        //zombie
        z.serang();
        
        

    }
}
