/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asci;

import java.util.Scanner;
/**
 *
 * @author asus
 */
public class ASCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       // ASCI A memiliki nilai 65 dan B 66
        char A65 = 'A';
        char B66 = 'B';
        
         int asciA65 = (int) A65;
         int asciB66 = (int) B66;
         
         int hasil = asciA65 + asciB66;
         System.out.println("Hasil penjumlahan ASCII 'A' dan 'B' = " + hasil);
        
        
    }
    
}
