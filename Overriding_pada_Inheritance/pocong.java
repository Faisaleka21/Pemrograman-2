/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overriding_pada_Inheritance;

/**
 *
 * @author Fysl
 */
public class pocong extends enemy {
    void loncat(){
        System.out.println("Pocong lompat-lompat");
    }
    
    @Override //bisanya override yaitu harus extends enemy dulu
 void serang(){
        System.out.println("Serang pocongkuuuu");
    }
   
}
