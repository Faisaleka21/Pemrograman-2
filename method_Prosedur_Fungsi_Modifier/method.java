/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package method_Prosedur_Fungsi_Modifier;

/**
 *
 * @author Fysl
 */
public class method {
    //prosedur,parameter
    public void hasil(String nama, int nilai){
        String ket = keterangan(nilai);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("||\t Nama : "+nama);
        System.out.println("||\t Nilai : "+nilai);
        System.out.println("||\t Keterangan : "+ket);
        System.out.println("=====================================================================");
        System.out.println("Nama Mahasiswa "+nama+ " ,dinyatakan "+ket+" karena mendapat nilai "+nilai+".");
        System.out.println("=====================================================================");
    }
    
    //fungsi dan modifier
    private String keterangan(int x){
    if (x>70){
    return "Lulus";
        }
    else {return "Tidak Lulus";
        }
    }

}
