/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

import java.io.*;
/**
 *
 * @author Deni Supriyatna
 */
public class Hitung {
Depan ama = new Depan();
int p,l,s,m,pilih;
double lu,kel;
String LL = "Menghitung Luas";
String LK = "Menghitung Keliling";

private double luasPersegi(int p,int l){
return p*l;
}

private double voBalok(){
return luasPersegi(p, l)*s;
}

private double KelBalok(){
return kelSegi3(p, l, s)*4;
}

private double LPBalok(int p,int l,int s){
return 2*((p*l)+(p*s)+(l*s));
}        

private double kelilingPersegi(int p, int l){
return (p+l)*2;
}
       
private double luasSegi3 (int p,int l){
return (p*l)/2;
}

private double kelSegi3 (int p, int l, int s){
return p+l+s;
}

private void inputanSegi3()throws IOException{
BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String panjang,lebar;
    System.out.println(LL);
    System.out.println("Masukan Tinggi segitiga ");
    panjang = stdin.readLine();
    p = Integer.parseInt(panjang);
    System.out.println("masukan Alas segitiga");
    lebar = stdin.readLine();
    l = Integer.parseInt(lebar);
}

private void inputanSegi3K()throws IOException{
BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String panjang,lebar,sisi;
    System.out.println(LK);
    System.out.println("Masukan sisi A");
    panjang = stdin.readLine();
    p = Integer.parseInt(panjang);
    System.out.println("masukan sisi B");
    lebar = stdin.readLine();
    l = Integer.parseInt(lebar);
    System.out.println("masukan sisi c");
    sisi = stdin.readLine();
    s = Integer.parseInt(sisi);
}

private void inputanPersegi()throws IOException{
BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String panjang,lebar;
    System.out.println("Masukan panjang ");
    panjang = stdin.readLine();
    p = Integer.parseInt(panjang);
    System.out.println("masukan Lebar");
    lebar = stdin.readLine();
    l = Integer.parseInt(lebar);
}

private void inputanBalok()throws IOException{
BufferedReader sttd = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Masukan TInggi");
    String tinggi = sttd.readLine();
    s = Integer.parseInt(tinggi);
}

private void inputanJajarL()throws IOException{
BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String panjang,lebar;
    System.out.println(LL);
    System.out.println("Masukan Tinggi ");
    panjang = stdin.readLine();
    p = Integer.parseInt(panjang);
    System.out.println("masukan Alas");
    lebar = stdin.readLine();
    l = Integer.parseInt(lebar);
}

private void inputanJajarK()throws IOException{
BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String panjang,lebar;
    System.out.println(LK);
    System.out.println("Masukan Sisi A");
    panjang = stdin.readLine();
    p = Integer.parseInt(panjang);
    System.out.println("masukan Sisi B");
    lebar = stdin.readLine();
    l = Integer.parseInt(lebar);
}

public void layer (){
    System.out.println("1. Menghitung Luas");
    System.out.println("2. Menghitung keliling");
    System.out.println("3. Kembali");
}

public void segitiga()throws IOException{
    BufferedReader pin = new BufferedReader(new InputStreamReader(System.in));
    
    String pilihan;
    System.out.println("Menghitung Luas & Keliling Segitiga");
    layer();
    pilihan = pin.readLine();
    pilih = Integer.parseInt(pilihan);
    
    switch (pilih){
        case 1 :
            inputanSegi3();
            lu = luasSegi3(p,l);
            System.out.println("Luas segitiga adalah : "+lu);
            break;
        case 2 :
            inputanSegi3K();
            kel = kelSegi3(p, l, s);
            System.out.println("Keliling Segitiga adalah : "+kel);
            break;
        case 3 :
        ama.Muka();
        break;
        default :
            System.out.println("Anda salah memasukan pilihan");
    }
}

public void persegi () throws IOException {
    BufferedReader pin = new BufferedReader(new InputStreamReader(System.in));
    
    String pilihan;
    System.out.println("Menghitung Luas & Keliling Persegi & persegi Panjang");
    layer();
    pilihan = pin.readLine();
    pilih = Integer.parseInt(pilihan);
    
    switch (pilih){
        case 1 :
            System.out.println(LL);
            inputanPersegi();
            lu = luasPersegi(p, l);
            System.out.println("Luas persegi adalah : "+lu);
            break;
        case 2 :
            System.out.println(LK);
            inputanPersegi();
            kel = kelilingPersegi(p, l);
            System.out.println("Keliling persegi adalah : "+kel);
            break;
        case 3 :
        ama.Muka();
        break;
        default:
            System.out.println("anda salah memasukan pilihan");
    }
}

public void Balok () throws IOException {
    BufferedReader pin = new BufferedReader(new InputStreamReader(System.in));
    
    double vol;
    String pilihan;
    System.out.println("Menghitung Volume, keliling Balok");
    System.out.println("1. Volume");
    System.out.println("2. Keliling");
    System.out.println("3. Luas permukaan");
    System.out.println("4. Kembali");
    pilihan = pin.readLine();
    pilih = Integer.parseInt(pilihan);
    
    switch (pilih){
        case 1 :
            System.out.println("Volume");
            inputanPersegi();
            inputanBalok();
            vol = voBalok();
            System.out.println("Luas persegi adalah : "+vol);
            break;
        case 2 :
            System.out.println(LK+"Balok");
            inputanPersegi();
            inputanBalok();
            kel = KelBalok();
            System.out.println("Luas persegi adalah : "+kel);
            break;
        case 3 :
            System.out.println(LL+"Balok");
            inputanPersegi();
            inputanBalok();
            lu = LPBalok(p, l, s);
            System.out.println("Luas persegi adalah : "+lu);
            break;
        case 4 :
        ama.Muka();
        break;
        default:
            System.out.println("anda salah memasukan pilihan");
    }
}

public void JajarGenjang()throws IOException{
BufferedReader pin = new BufferedReader(new InputStreamReader(System.in));
    
    String pilihan;
    System.out.println("Menghitung Luas & Keliling Jajargenjang");
    layer();
    pilihan = pin.readLine();
    pilih = Integer.parseInt(pilihan);
    
    switch (pilih){
        case 1 :
            inputanJajarL();
            lu = luasPersegi(p, l);
            System.out.println("Luas jajargenjang adalah : "+lu);
            break;
        case 2 :
            inputanJajarK();
            kel = kelilingPersegi(p, l);
            System.out.println("Keliling jajargenjang adalah : "+kel);
            break;
        case 3 :
        ama.Muka();
        break;
        default:
            System.out.println("anda salah memasukan pilihan");
                }
    }

private double LuasTrapesium(int a,int c,int t){
return 0.5*(a+c)*t;
}

private double KelTrapesium(int a,int b, int c, int d){
return a+b+c+d;
}

public void inputTraL()throws IOException{
BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String panjang,lebar,tinggi;
    System.out.println(LL);
    System.out.println("Masukan Sisi sejajar A");
    panjang = stdin.readLine();
    p = Integer.parseInt(panjang);
    System.out.println("masukan Sisi sejajar B");
    lebar = stdin.readLine();
    l = Integer.parseInt(lebar);
    System.out.println("masukan Tinggi");
    tinggi = stdin.readLine();
    s = Integer.parseInt(tinggi);
}

public void inputTraK()throws IOException{
BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String panjang,lebar,tinggi,miring;
    System.out.println(LK);
    System.out.println("Masukan Sisi sejajar A");
    panjang = stdin.readLine();
    p = Integer.parseInt(panjang);
    System.out.println("masukan Sisi sejajar B");
    lebar = stdin.readLine();
    l = Integer.parseInt(lebar);
    System.out.println("masukan Tinggi");
    tinggi = stdin.readLine();
    s = Integer.parseInt(tinggi);
    System.out.println("masukan Sisi Miring");
    miring = stdin.readLine();
    m = Integer.parseInt(miring);
}

public void Trapesium()throws IOException{
BufferedReader pin = new BufferedReader(new InputStreamReader(System.in));
    
    String pilihan;
    System.out.println("Menghitung Luas & Keliling Trapesium");
    layer();
    pilihan = pin.readLine();
    pilih = Integer.parseInt(pilihan);
    
    switch (pilih){
        case 1 :
            inputTraL();
            lu = LuasTrapesium(p, l, s);
            System.out.println("Luas Trapesium adalah : "+lu);
            break;
        case 2 :
            inputTraK();
            kel = KelTrapesium(p, l, s, m);
            System.out.println("Keliling jajargenjang adalah : "+kel);
            break;
        case 3 :
        ama.Muka();
        break;
        default:
            System.out.println("anda salah memasukan pilihan");
        }
    }
}
