/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package method_Prosedur_Fungsi_Modifier;

/**
 *
 * @author Fysl
 */
import java.util.Scanner;
public class cekkelulusan {
    
    static void input(){
        String x;
        Scanner input=new Scanner(System.in);
    do{
        //input
        String nama;
        int nilai;
        System.out.print("Masukkan Nama : ");
        nama=input.nextLine();
        System.out.print("Masukkan Jumlah Nilai : ");
        nilai=input.nextInt();
              input.nextLine();
        
        //pemanggilan
        method cek=new method();
        cek.hasil(nama, nilai);
        
        
        System.out.print("Masukkan Nilai Lagi(y/n) : ");
        x=input.nextLine();
        }
    while(x.equalsIgnoreCase("y"));
        System.out.println("Selesai !!!!!!!");
}
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("=================================================");
        System.out.println("              Kelulusan Mahasiswa");
        System.out.println("-------------------------------------------------");
        System.out.println("\tUniversitas Nahdlatul Ulama Blitar");
        System.out.println("=================================================");
        
        //pemanggilan static
        input();
        
        
        
    }
    
}
