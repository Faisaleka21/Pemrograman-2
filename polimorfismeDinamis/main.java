/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismeDinamis;

/**
 *
 * @author Fysl
 */
public class main {
    public static void main(String[] args) {
        
        bangundatar bd=new bangundatar();
        persegi p=new persegi(5);
        segitiga s=new segitiga(5,10);
        lingkaran l=new lingkaran(10);
        
        //panggil method luas dan keliling
        System.out.println("==================================");
        bd.luas();
        bd.keliling();
        
        System.out.println("==================================");
        System.out.println("Luas Persegi : "+p.luas());
        System.out.println("Keliling Persegi : "+p.keliling());
        System.out.println("Luas Segitiga : "+s.luas());
        System.out.println("Keliling Segitiga : "+s.keliling());
        System.out.println("Luas Lingkaran : "+l.luas());
        System.out.println("Keliling Lingkaran : "+l.keliling());
        
    }
    
}
