/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author Fysl
 */
public class phoneuser {
    private phone hp;
    
    public phoneuser(phone hp){
        this.hp = hp;
    }
    
    void turnOnThePower(){
        this.hp.powerOn();
    }
    void turnOffThePower(){
        this.hp.powerOff();
    }
    void menaikkanVolume(){
        this.hp.volumeTambah();
    }
    void menurunkanVolume(){
        this.hp.volumeTurun();
    }
    
    
    
}
