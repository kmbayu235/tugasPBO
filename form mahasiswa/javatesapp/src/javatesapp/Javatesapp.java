/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javatesapp;

import koneksi.Koneksi;

/**
 *
 * @author Z y r n
 */
public class Javatesapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koneksi db = new Koneksi ();
        db.connect(); //menampilkan log di console
    }
    
}
