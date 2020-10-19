import java.util.Scanner;
public class Nomor8b {
    public static void main(String[] args) {
        String posisi = "\033[1A \033[10C";
        
        Scanner inputan = new Scanner(System.in);
        int[] p = new int[10];
        int[] s = new int[10];
        int kena = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print(" P = ");
            p[i] = inputan.nextInt();
            System.out.print(posisi+ "S = ");
            s[i] = inputan.nextInt();
            if ((Math.pow(p[i], 2)+1)==s[i]) { kena += 1;}

           
        }
        System.out.println("Peluru mengenai sasaran = "+ kena);
        System.out.println("Peluru mengenai sasaran = "+ (10-kena));
    }
}
