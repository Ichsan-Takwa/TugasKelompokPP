import java.util.Scanner;

public class Nomor6 {
    public static void main(String[] args) {
    Scanner data_pangeran = new Scanner(System.in);
    int tinggi, berat_badan, poin;
    tinggi = data_pangeran.nextInt();
    berat_badan = data_pangeran.nextInt();
    String hobby = data_pangeran.next(); 
    data_pangeran.close();

    // poin dari tinggi
        poin = 0;
    if (tinggi < 150) { poin += 1; }
    if ( 151 < tinggi  && tinggi < 160) { poin += 2; }
    if (161 < tinggi  && tinggi < 170)  { poin += 3; }
    if (171 < tinggi  && tinggi < 180)  { poin += 4; }
    if (181 < tinggi  && tinggi < 190)  { poin += 5; }
       
    // poin dati berat_badan badan
    if (berat_badan < 40) { poin += 1; }
    if (41 < berat_badan && berat_badan < 85)     { poin += 3; }
    if (86 < berat_badan && berat_badan < 100)    { poin += 2; }
        
    // poin dari hobby
    if (hobby.equals("basket"))  { poin += 3; 
    } else if (hobby.equals("game"))    { poin += 2; 
    } else poin += 1;

    // menentukan kategori ketampanan :v
    if (poin < 5) { System.out.println("Tampan"); }
    if (8 > poin && poin > 6) { System.out.println("Tampan sekali"); }
    if (8 < poin) { System.out.println("Tampan maksimal"); }
    
    }
}
