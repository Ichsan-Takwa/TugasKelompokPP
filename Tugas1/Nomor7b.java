import java.util.Scanner;
public class Nomor7 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        // Meng-input array 10 baris bertama (angka1)
        int[] angka1 = {inputan.nextInt(),inputan.nextInt(),inputan.nextInt(),inputan.nextInt(),inputan.nextInt(),inputan.nextInt(),inputan.nextInt(),inputan.nextInt(),inputan.nextInt(),inputan.nextInt()};
        int max = -9999999; int min = 9999999;

        // Meng-input array 10 baris kedua (angka2)
        int[] angka2 = {inputan.nextInt(),inputan.nextInt(),inputan.nextInt(),inputan.nextInt(),inputan.nextInt(),inputan.nextInt(),inputan.nextInt(),inputan.nextInt(),inputan.nextInt(),inputan.nextInt()};
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
