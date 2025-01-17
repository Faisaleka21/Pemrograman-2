/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overriding_pada_Inheritance;

/**
 *
 * @author Fysl
 */
public class zombie extends enemy{
    void jalan(){
        System.out.println("Zombie Jalan");
    }
    
    @Override
    void serang(){
        System.out.println("Serangg zombikuuu");
    }
}
