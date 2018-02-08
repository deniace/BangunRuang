/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

import java.io.*;
import java.text.DecimalFormat;
/**
 *
 * @author Deni Supriyatna
 */
public class Hitung2 {
    public final double phi = 3.14285714;
    DecimalFormat df = new DecimalFormat("0.00");
    int r,t;
    double kel,lu;
    
    private void inputanLing()throws IOException{
        BufferedReader pin = new BufferedReader(new InputStreamReader(System.in));
        String jariJari;
        System.out.println("Masukan jari jari lingkaran");
        jariJari = pin.readLine();
        r = Integer.parseInt(jariJari);
    }
    
    private void inputanVL()throws IOException{
        BufferedReader pin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Masukan Tinggi Tabung");
        String tinggi = pin.readLine();
        t = Integer.parseInt(tinggi);
    }
    
    private double luasLingkaran(int jari2){
    return phi*jari2*jari2;
    }
    
    private double VolTabung (){
    return luasLingkaran(r)*t;
    }
    
    private double kelilingLingkaran(int jari2){
    return phi * (jari2*2);
    }
    
    private double LuasTabung(){
    return (luasLingkaran(r)*2)+(kelilingLingkaran(r)*t);
    }
    
    public void lingkaran()throws IOException{
    BufferedReader pin = new BufferedReader(new InputStreamReader(System.in));
    Depan ain = new Depan();
    int pilih;
    
    String pilihan;
    Hitung tung = new Hitung();
    System.out.println("Menghitung Luas & keliling Lingkaran");
    tung.layer();
    pilihan = pin.readLine();
    pilih = Integer.parseInt(pilihan);
    
    switch (pilih){
        case 1 :
            System.out.println("Menghitung Luas");
            inputanLing();
            lu = luasLingkaran(r);
            System.out.println("Luas lingkaran = "+df.format(lu));
        break;
        case 2 :
            System.out.println("Menghitung Keliling");
            inputanLing();
            kel = kelilingLingkaran(r);
            System.out.println("Keliling Lingkaran = "+df.format(kel));
        break;
        case 3 :
        ain.Muka();
        break;
        default:
            System.out.println("masukan salah");
        }
    }
    
    
    public void tabung()throws IOException{
    BufferedReader pin = new BufferedReader(new InputStreamReader(System.in));
    Depan ain = new Depan();
    int pilih;
    
    String pilihan;
    Hitung tung = new Hitung();
    System.out.println("Menghitung volume dan luas permukaan Tabung");
    System.out.println("1. Menghitung Volume");
    System.out.println("2. Menghitung Luas permukaan");
    System.out.println("3. Kembali");
    pilihan = pin.readLine();
    pilih = Integer.parseInt(pilihan);
    
    switch (pilih){
        case 1 :
            System.out.println("Menghitung volume");
            inputanLing();
            inputanVL();
            lu = VolTabung();
            System.out.println("Volume Tabung = "+df.format(lu));
        break;
        case 2 :
            System.out.println("Menghitung Luas permukaan");
            inputanLing();
            inputanVL();
            kel = LuasTabung();
            System.out.println("Luas permukaan tabung = "+df.format(kel));
        break;
        case 3 :
        ain.Muka();
        break;
        default:
            System.out.println("masukan salah");
        }
    }
    
}
