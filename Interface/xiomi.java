/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author Fysl
 */
public class xiomi implements phone{
    
    private int volume;
    private boolean isPowerOn;
    
    public xiomi(){
        this.volume=50;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Handphone Menyala......!!");
        System.out.println("Selamat Datang di XIOMI PHONE");
        System.out.println("Android Version 150");
    }

    @Override
    public void powerOff() {
        isPowerOn=false;
        System.out.println("Handphone Dimatikan.......!!");
    }

    @Override
    public void volumeTambah() {
        if(isPowerOn){
            if(this.volume==MAX_VOLUME){
                System.out.println("Volume MAXIMUM...!!");
                System.out.println("Sudah "+this.getVolume()+"%");
            }else{
                this.volume+=10;
                System.out.println("Volume Sekarang : "+this.getVolume());
            }
        }else{
            System.out.println("Tolong Nyalakan dulu Handphonenya.....!!");
        }
    }

    @Override
    public void volumeTurun() {
        if(isPowerOn){
            if(this.volume==MIN_VOLUME){
                System.out.println("Volume MINIMUM...!!");
                System.out.println("Sudah "+this.getVolume()+"%");
            }else{
                this.volume-=10;
                System.out.println("Volume Sekarang : "+this.getVolume());
            }
        }else{
            System.out.println("Tolong Nyalakan dulu Handphonenya.....!!");
        }
    }
    
    public int getVolume(){
        return this.volume;
    }
    
    
}
