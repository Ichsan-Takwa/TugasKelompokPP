import java.util.Scanner;
import java.lang.String;
public class Nomor1 {
    
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        String nama1, opsi1, nama2, opsi2, a, b, c;
        nama1 = inputan.next();
        opsi1 = inputan.next();
        nama2 = inputan.next();
        opsi2 = inputan.next(); inputan.close();

        a = "batu"; b = "gunting"; c = "kertas";
        int x = opsi1.compareTo(opsi2);

        if (((opsi1.equals(a)) | (opsi1.equals(b)) | (opsi1.equals(c))) && ((opsi2.equals(a)) | (opsi2.equals(b)) | (opsi2.equals(c)))) {

            if ((x == 5 ) | (x == 4) | (x == -9)){
                System.out.println(nama2+ " menang");

            } else if ((x == -5) | (x == -4) | (x == 9)) {
                System.out.println(nama1+ " menang");

            } else System.out.println("Hasil imbang");
            
        } else System.out.println("Data salah, coba lagi");    
    }
}
