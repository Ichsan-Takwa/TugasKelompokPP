import java.util.*;

public class Nomor5 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);;
        String kota_A, kota_B, kota_C;
        int x_A, y_A, x_B, y_B, x_C, y_C;
        kota_A = inputan.next(); 
        x_A = inputan.nextInt();
        y_A = inputan.nextInt();
        kota_B = inputan.next();
        x_B = inputan.nextInt();
        y_B = inputan.nextInt();
        kota_C = inputan.next();
        x_C = inputan.nextInt();
        y_C = inputan.nextInt();
            inputan.close();
        
        double hasilAB = Math.sqrt(Math.pow(x_A-x_B, 2)+Math.pow(y_A-y_B, 2));
        double hasilAC = Math.sqrt(Math.pow(x_A-x_C, 2)+Math.pow(y_A-y_C, 2));
        double hasilBC = Math.sqrt(Math.pow(x_C-x_B, 2)+Math.pow(y_C-y_B, 2));
        
        if ((hasilAB >= hasilAC)&&(hasilAC >= hasilBC)) {
            System.out.println(kota_A+ " ke 1 "+ kota_B+ " : "+(int) hasilAB );
            if (hasilAC >= hasilBC) {
                System.out.println(kota_A+ " ke 2 "+ kota_C+ " : "+(int) hasilAC);
                System.out.println(kota_B+ " ke 3 "+ kota_C+ " : "+(int) hasilBC);
                
            } else {System.out.println(kota_B+ " ke 4 "+ kota_C+ " : "+(int) hasilBC);
                    System.out.println(kota_A+ " ke 5 "+ kota_C+ " : "+(int) hasilAC);}

        } else if ((hasilAC > hasilAB)&&(hasilAC > hasilBC)) {
            System.out.println(kota_A+ " ke 6 "+ kota_C+ " : "+(int) hasilAC );
            if (hasilAB > hasilBC) {
                System.out.println(kota_A+ " ke 7 "+ kota_B+ " : "+(int) hasilAB);
                System.out.println(kota_B+ " ke 8 "+ kota_C+ " : "+(int) hasilBC);
                
            } else {System.out.println(kota_B+ " ke 9 "+ kota_C+ " : "+(int) hasilBC);
                    System.out.println(kota_A+ " ke 10 "+ kota_B+ " : "+(int) hasilAB);}

        } else if ((hasilBC > hasilAC)&&(hasilBC > hasilAB)) {
            System.out.println(kota_B+ " ke 11 "+ kota_C+ " : "+(int) hasilBC );
            if (hasilAB > hasilAC) {
                System.out.println(kota_A+ " ke 12 "+ kota_B+ " : "+(int) hasilAB);
                System.out.println(kota_A+ " ke 13 "+ kota_C+ " : "+(int) hasilAC);
                
            } else {System.out.println(kota_A+ " ke 14 "+ kota_C+ " : "+(int) hasilAC);
                    System.out.println(kota_A+ " ke 15 "+ kota_B+ " : "+(int) hasilAB);}
        } else System.out.println("opsi akhir");
    }
}
