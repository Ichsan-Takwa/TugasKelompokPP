import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int x1, x2, y1, y2, a, b;
        x1 = inputan.nextInt();
        y1 = inputan.nextInt();
        x2 = inputan.nextInt();
        y2 = inputan.nextInt(); inputan.close();

        a = x1 - x2; b = y1 - y2;
        
        if (((a == 2) | (a == -2)) && ((b == 1) | (b == -1))) {
            System.out.println("valid");

        } else if (((b == 2) | (b == -2)) && ((a == 1) | (a == -1))) {
            System.out.println("valid");
        } else System.out.println("tidak valid");
    }
}
