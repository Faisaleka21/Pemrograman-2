/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konstruktor;

import keywordThis.*;

/**
 *
 * @author Fysl
 */
public class penggunaan_This {
    
 private String judul;  // Gunakan access modifier private untuk enkapsulasi
    private String penulis;

    // Setter untuk judul
    public void setJudul(String judul) {
        this.judul = judul;
    }

    // Setter untuk penulis
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    // Method untuk menampilkan informasi buku
    public void tampilkanInfo() {
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
    }
}

class Main {
    public static void main(String[] args) {
        penggunaan_This buku1 = new penggunaan_This();
        buku1.setJudul("Pemrograman Java");
        buku1.setPenulis("Tidak diketahui");

        penggunaan_This buku2 = new penggunaan_This();
        buku2.setJudul("Algoritma");
        buku2.setPenulis("John Doe");

        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
    }
}
