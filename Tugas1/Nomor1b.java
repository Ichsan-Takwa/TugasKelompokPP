import java.util.Scanner;
public class Nomor1b {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        String nama1, opsi1, nama2, opsi2, a, b, c;
        nama1 = inputan.next();
        opsi1 = inputan.next();
        nama2 = inputan.next();
        opsi2 = inputan.next(); inputan.close();

        a = "batu"; b = "gunting"; c = "kertas";

        if (opsi1.equals(a) && opsi2.equals(a)) { System.out.println("Hasil imbang"); 

        } else if (opsi1.equals(a) && opsi2.equals(b)) { System.out.println(nama1+ " menang");

        } else if (opsi1.equals(a) && opsi2.equals(c)) { System.out.println(nama2+ " menang"); 

        } else if (opsi1.equals(b) && opsi2.equals(a)) { System.out.println(nama2+ " menang"); 

        } else if (opsi1.equals(b) && opsi2.equals(b)) { System.out.println("Hasil imbang"); 

        } else if (opsi1.equals(b) && opsi2.equals(c)) { System.out.println(nama2+ " menang"); 

        } else if (opsi1.equals(c) && opsi2.equals(a)) { System.out.println(nama1+ " menang"); 

        } else if (opsi1.equals(c) && opsi2.equals(b)) { System.out.println(nama2+ " menang"); 

        } else if (opsi1.equals(c) && opsi2.equals(c)) { System.out.println("Hasil imbang"); 

        } else System.out.println("Data salah, coba lagi");
    }
}
