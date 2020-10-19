import java.util.Scanner;
public class Nomor7 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        // Meng-input array 10 baris bertama (angka1)
        int A,A2,A3,A4,A5,A6,A7,A8,A9,A10;
        A = inputan.nextInt();
        A2 = inputan.nextInt();
        A3 = inputan.nextInt();
        A4 = inputan.nextInt();
        A5 = inputan.nextInt();
        A6 = inputan.nextInt();
        A7 = inputan.nextInt();
        A8 = inputan.nextInt();
        A9 = inputan.nextInt();
        A10 = inputan.nextInt();
        int[] angka1 = {A,A2,A3,A4,A5,A6,A7,A8,A9,A10};
        int max = -9999999; int min = 9999999;

        // Meng-input array 10 baris kedua (angka2)
        int B,B2,B3,B4,B5,B6,B7,B8,B9,B10;
        B = inputan.nextInt();
        B2 = inputan.nextInt();
        B3 = inputan.nextInt();
        B4 = inputan.nextInt();
        B5 = inputan.nextInt();
        B6 = inputan.nextInt();
        B7 = inputan.nextInt();
        B8 = inputan.nextInt();
        B9 = inputan.nextInt();
        B10 = inputan.nextInt();
        inputan.close();
        int[] angka2 = {B,B2,B3,B4,B5,B6,B7,B8,B9,B10};
        int max2 = -9999999; int min2 = 9999999;

        // looping perbandingan (angka1) 
        for (int i = 0; i < angka1.length; i++) {
            if (angka1[i]> max) { max = angka1[i]; }
            if (angka1[i]< min) { min = angka1[i]; }
        }

        
        // looping perbandingan (angka2)
        for (int i = 0; i < angka2.length; i++) {
            if (angka2[i]> max2) { max2 = angka2[i]; }
            if (angka2[i]< min2) { min2 = angka2[i]; }
        }

        System.out.println("Max = "+ max+" dan Min = "+min );
        System.out.println("Max = "+ max2+" dan Min = "+min2 );
        
    }
}
