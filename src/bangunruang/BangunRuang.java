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
public class BangunRuang {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        System.out.println("Deni Supriyatna. \n43A87006150265\nSI/TI/3C.Malam\n");
        Depan den = new Depan();
        String ulang;
        BufferedReader pil = new BufferedReader(new InputStreamReader(System.in));
        do{
        den.Muka();
        System.out.println("\nApakah ingin mengulang program ? ?\n(Y/T)");
        ulang = pil.readLine();
        
        } while (!("T").equalsIgnoreCase(ulang));    
    }
}
