/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package getter_setter;

/**
 *
 * @author Fysl
 */
public class mainUtama {
    public static void main(String[] args) {
        user u=new user();
        
        u.SetUsername("Admin");
        u.SetPassword("admin");

        System.out.println("Usernamenya = '"+u.GetUsername()+"'");
        System.out.println("Passwordnya = '"+u.GetPassword()+"'");
    }
}
