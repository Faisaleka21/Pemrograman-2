/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismeDinamis;

/**
 *
 * @author Fysl
 */
public class segitiga extends bangundatar{
    int alas;
    int tinggi;
    
    public segitiga(int a, int t){
        this.alas=a;
        this.tinggi=t;
    }
    
    @Override
    public float luas(){
        return 1/2 * this.alas*this.tinggi;
    }
    
    
}
