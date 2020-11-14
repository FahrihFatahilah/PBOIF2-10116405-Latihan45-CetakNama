package Printer;
/**
 * @author Fahrih Fatahilah
 * Kelas : IF-2 / PBO-IF2
 * Nim   : 10116405
 * Deskripsi Program : Program cetak nama
*/
public class Printer {
    private int jmlCetak;
    private String nama;
    
    public int getJmlCetak(){
        return jmlCetak;
    }
    
    public void setJmlCetak(int jmlCetak){
        this.jmlCetak = jmlCetak;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void cetak(String nama){
        System.out.printf("Nama Anda : %s\n", nama);
    }
    
    public void cetak(int jlmCetak, String nama){
        int i = 0;
        
        System.out.printf("Hasil Cetak : \n");
        while(i < jmlCetak){
           System.out.printf("%d. %s\n", i+1 ,nama);
           i++;
        }
    }
}
