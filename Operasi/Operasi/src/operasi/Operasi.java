/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operasi;
 import java.util.Scanner;
/**
 *
 * @author asus
 */
public class Operasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner isi = new Scanner(System.in);
        int ranking;
        
        System.out.println("Isi ranking kelas: ");
        ranking = isi.nextInt();
        boolean naikKelas = true;
       
    if ((ranking == 1) && (naikKelas)) {
       System.out.println("Selamat ya!! anda mendapatkan hadiah karena rangking 1. "); 
    } else {
        System.out.println("Yah! Anda tidak mendapatkan hadiah semangat terus belajarnya. "); 
    }
    }
    
}
