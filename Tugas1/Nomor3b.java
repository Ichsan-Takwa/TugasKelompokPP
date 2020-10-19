// Alternatif dari Nomor 4 dengan menggunakan for loop
import java.util.Scanner;

public class Nomor3b {
    public static void main(String[] args) {

        Scanner inputan = new Scanner(System.in);
        String KalimatAwal =inputan.nextLine(); inputan.close();
        String kebalikan = "";
        int panjang = KalimatAwal.length();

        for (int i = panjang -1; 0 <= i; i--) {
            kebalikan = kebalikan + KalimatAwal.charAt(i);
        }
    
        if ((8 < panjang) && (panjang < 13)){
            
            if (KalimatAwal.equals(kebalikan)) {
                System.out.println(KalimatAwal+ " Palindrome");

            } else System.out.println(KalimatAwal+ " bukan Palindrome");

        } else System.out.println("Tidak memenuhi syarat");
    }
}
