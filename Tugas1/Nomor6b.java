import java.util.Scanner;
public class Nomor6b {
    public static void main(String[] args) {
    Scanner data_pangeran = new Scanner(System.in);
    int tinggi, berat_badan, poin;
    String loop = "ya";

    do {
    tinggi = data_pangeran.nextInt();
    berat_badan = data_pangeran.nextInt();
    String hobby = data_pangeran.next();
    

    // poin dari tinggi
    poin = 0;
    if (tinggi <= 150) { poin += 1; 
    } else if (tinggi <= 160)  { poin += 2; 
    } else if (tinggi <= 170)  { poin += 3; 
    } else if (tinggi <= 180)  { poin += 4; 
    } else poin += 5;

    // poin dati berat_badan badan
    if (berat_badan <= 40)          { poin += 1; 
    } else if (berat_badan <= 85)   { poin += 3; 
    } else if (berat_badan < 100)   { poin += 2; }
        
    // poin dari hobby
    if (hobby.equals("basket"))  { poin += 3; }
    if (hobby.equals("game"))    { poin += 2; 
    } else poin += 1;

    // menentukan kategori ketampanan :v
    if (poin <= 5) { System.out.println("Tampan"); 
    } else if (poin <= 8) { System.out.println("Tampan sekali"); 
    } else System.out.println("Tampan maksimal"); 

    System.out.println("\nmasukkan data lagi? (ya/tidak)");
    loop = data_pangeran.next();
    } while (loop.equals("ya"));
    data_pangeran.close();
    System.out.println("===== SELESAI =====");
    }
}
