/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_3;

/**
 *
 * @author Fysl
 */
public class main {
    public static void main(String[] args) {
        ayam_geprek ag=new ayam_geprek();
        bakso b=new bakso();
        pangsit p=new pangsit();
        rujak r=new rujak();
        
        System.out.println("====================");
        System.out.println("   Pesan Makanan");
        System.out.println("====================");
        System.out.println("Menu Makanan");
        System.out.println("1.Bakso");
        System.out.println("2.Pangsit");
        System.out.println("3.Ayam Geprek");
        System.out.println("4.Gado-gado");
        System.out.println("5.Rujak");
        System.out.println("============================");
        
        //ayam geprek
        ag.nama="Andi";
        ag.harga=20000;
        System.out.println("Pesanan : "+ag.nama);
        ag.complete();
        System.out.println("Total = "+ag.harga);
        ag.beli();
        System.out.println("============================");
        
        //bakso
        b.nama="Sinta";
        b.harga=15000;
        System.out.println("Pesanan : "+b.nama);
        b.mercon();
        System.out.println("Total = "+b.harga);
        b.kirim();
        System.out.println("============================");
        
        //pangsit
        p.nama="Pak Dwi";
        p.harga=12000;
        System.out.println("Pesanan : "+p.nama);
        p.lengkap();
        System.out.println("Total = "+p.harga);
        p.terima();
        System.out.println("============================");
        
        //rujak
        r.nama="Indah";
        r.harga=8000;
        System.out.println("Pesanan : "+r.nama);
        r.pedas();
        System.out.println("Total = "+r.harga);
        r.beli();
        System.out.println("============================");
    }
}
