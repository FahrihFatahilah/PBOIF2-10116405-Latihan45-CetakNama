package Printer;
/**
 * @author Fahrih Fatahilah
 * Kelas : IF-2 / PBO-IF2
 * Nim   : 10116405
 * Deskripsi Program : Program cetak nama
 */
import java.util.Scanner;
public class CetakNama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Printer printer = new Printer();
        
        System.out.printf("=====Aplikasi Pencetak Nama=====\n");
        System.out.printf("Masukkan nama anda : "); printer.setNama(scan.nextLine());
        System.out.printf("Mau cetak nama berapa kali? : "); printer.setJmlCetak(scan.nextInt());
        printer.cetak(printer.getNama());
        printer.cetak(printer.getJmlCetak(),printer.getNama());
    }
    
}
