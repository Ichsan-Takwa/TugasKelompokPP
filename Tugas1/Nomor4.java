import java.util.Scanner;
public class Nomor4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int x;
    System.out.print(" X = "); 
    x = input.nextInt(); 
    int y;
    String posisi = "\033[2A \033[12C";
    System.out.println( posisi+ "Y = "+ (y = input.nextInt())); 
    input.close();
    
    double hasil = ((double)(y + x)/2)*(1+ y - x);
    
    if (hasil%n==0) { System.out.println((int) hasil+ " habis dibagi dengan "+ n);
        } else System.out.println((int) hasil+ " Tidak habis dibagi "+ n);
    }
}
