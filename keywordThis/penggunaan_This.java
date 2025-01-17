/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keywordThis;

/**
 *
 * @author Fysl
 */
public class penggunaan_This {
    
    private String judul;  // Gunakan access modifier private untuk enkapsulasi
    private String penulis;

    // Constructor utama dengan satu parameter
    public penggunaan_This(String judul) {
        this(judul, "Tidak diketahui"); // Memanggil constructor lain
    }

    // Constructor dengan dua parameter
    public penggunaan_This(String judul, String penulis) {
        this.judul = judul;
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
        penggunaan_This buku1 = new penggunaan_This("Pemrograman Java");
        penggunaan_This buku2 = new penggunaan_This("Algoritma", "John Doe");

        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
    }
}
