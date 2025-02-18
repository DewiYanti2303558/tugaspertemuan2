/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2;

import java.util.Scanner;
/**
 *
 * @author asus
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner bilangan = new Scanner(System.in);
        int d, e, w, hasil = 0;
        char operasi;
    
        System.out.print("Masukkan bilangan pertama: ");
        d = bilangan.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        e = bilangan.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        w = bilangan.nextInt();

        System.out.print("Pilih operasi (+, -, *, /): ");
        operasi = bilangan.next().charAt(0);
        // Cek pembagian nol
        if (operasi == '/' && (e == 0 || w == 0)) {
            System.out.println("ERORR Pembagian nol tidak diperbolehkan!");
            return;
        }
        // Operasi
        switch (operasi) {
            case '+':
                hasil = d + e + w;
                break;
            case '-':
                hasil = d - e - w;
                break;
            case '*':
                hasil = d * e * w;
                break;
            case '/':
                hasil = d / e / w;
                break;
            default:
                System.out.println("Operasi tidak valid!");
                return;
        }
        System.out.println("Hasil operasi: " + hasil);
    }
}
