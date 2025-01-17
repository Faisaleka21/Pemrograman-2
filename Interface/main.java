/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import java.util.Scanner;

/**
 *
 * @author Fysl
 */
public class main {
    public static void main(String[] args) {
        
        phone Redmi3Pro = new xiomi();
        
        phoneuser Faisal= new phoneuser(Redmi3Pro);
        
        Faisal.turnOnThePower();
        
        Scanner input = new Scanner(System.in);
        String aksi = null;
        
        while(true){
            System.out.println("===== APLIKASI INTERFACE =====");
            System.out.println("[1] Menyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Volume +");
            System.out.println("[4] Volume -");
            System.out.println("[0] Keluar");
            System.out.println("Pilih Aksi");
            aksi=input.nextLine();
            
            if(aksi.equals("1")){
                Faisal.turnOnThePower();
            }else if(aksi.equals("2")){
                Faisal.turnOffThePower();
            }else if(aksi.equals("3")){
                Faisal.menaikkanVolume();
            }else if(aksi.equals("4")){
                Faisal.menurunkanVolume();
            }else if(aksi.equals("0")){
                System.exit(0);
            }else{
                System.out.println("Salahh Input....!!");
            }
        }
        
    }
    
}
