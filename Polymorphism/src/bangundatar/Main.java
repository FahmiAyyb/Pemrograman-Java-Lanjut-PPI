/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author Fahmii
 */
public class Main {
      public static void main(String[] args) {
        
        BangunDatar bangunDatar = new BangunDatar();
        Persegi persegi = new Persegi(7);
        Segitiga segitiga = new Segitiga(3, 9);
                
        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();
        
        System.out.println("Luas persegi: " + persegi.luas());
        System.out.println("keliling persegi: " + persegi.keliling());
        System.out.println("Luas segitiga: " + segitiga.luas());
    }
}
