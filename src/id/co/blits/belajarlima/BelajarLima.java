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
public class BelajarLima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fungsi fungsi = new Fungsi();
        int perkalian = fungsi.perkalian(2, 7);
        System.out.println("Tugas Fungsi Berparameter ");
    System.out.println("Hasil penghitungan = "+perkalian+"\n\n");
       
        Prosedur prosedur = new Prosedur();
      prosedur.namaMantan();
      prosedur.luasPersegiPanjang();
      
      //Fungsi fungsi = new Fungsi();
      int hasil = fungsi.perhitungan();
        System.out.println("Hasil : "+hasil);
      String kata = fungsi.mencoba();
        System.out.println(""+kata);
      boolean status = fungsi.disuruh();
      if (status == true){
          System.out.println("Cari Pacar donks");     
      }
      else{
          System.out.println("Ajak Nikah");
      } 
       double perhitungan3 = fungsi.perhitungan3();
        System.out.println("Hasil : "+perhitungan3);
       double alas =10;
       double tinggi = 10;
       prosedur.luasSegitiga(alas, tinggi);
       
       }
    
}
