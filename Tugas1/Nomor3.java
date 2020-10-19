import java.lang.StringBuffer;
import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        StringBuffer KalimatAwal = new StringBuffer(inputan.nextLine()); inputan.close();
        String asli, kebalikan;

        asli = KalimatAwal.toString();
        KalimatAwal.reverse();
        kebalikan = KalimatAwal.toString() ;
        
        int panjang = KalimatAwal.length();
       
        if ((8 < panjang) && (panjang < 13)){
            
            if (asli.equals(kebalikan)) {
                System.out.println(asli+ " Palindrome");

            } else System.out.println(asli+ " bukan Palindrome");

        } else System.out.println("Tidak memenuhi syarat");
    }
}