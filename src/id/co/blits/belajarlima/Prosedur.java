/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.blits.belajarlima;

/**
 *
 * @author Toshiba
 */
public class Prosedur {
    void namaMantan(){
        System.out.println("Perempuan");
    }
    void luasPersegiPanjang (){
        int panjang = 10;
        int lebar = 8;
        int luas = panjang * lebar;
    System.out.println("Luas : "+luas);
    }
    void luasSegitiga(double alas, double tinggi){
        double setengah = 0.5;
        double luas = setengah*alas*tinggi;
        System.out.println("Luas Segitiga = "+ luas);
    }
}
