/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Deni Supriyatna
 */
public class Depan {
    
    public void Muka()throws IOException{
    BufferedReader pil = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Menghitung Luas dan keliling Bangun datar");
        System.out.println("1. Segitiga");
        System.out.println("2. Persegi");
        System.out.println("3. Lingkaran");
        System.out.println("4. Trapesium");
        System.out.println("5. Jajaran Genjang");
        System.out.println("6. Balok");
        System.out.println("7. Tabung");
        System.out.println("8. Keluar\n");
        System.out.println("Masukan pilihan yang anda ingin\n1,2,3,4,5,6 atau 7.");
      
        Hitung ja = new Hitung();
        Hitung2 li = new Hitung2();
        
        String pili = pil.readLine();
        int pilih = Integer.parseInt(pili);
        
        switch (pilih){
            case 1 :
                ja.segitiga();
                break;
            case 2 :
                ja.persegi();
                break;
            case 3 :
                li.lingkaran();
                break;
            case 4 :
                ja.Trapesium();
                break;
            case 5 :
                ja.JajarGenjang();
                break;
            case 6 :
                ja.Balok();
                break;
            case 7 :
                li.tabung();
                break;
            case 8 :
                System.out.println("Terima Kasih ^_^");
                break;
            default:
                System.out.println("masukan Salah");
            }
    }
}
