import java.util.Scanner;
public class Nomor8 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        // Meng-input data ( P dan S)
        int p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
        String posisi = "\033[1A \033[10C";
        System.out.print(" P = ");
        p1 = inputan.nextInt();
        System.out.print(posisi+ "S = ");
        s1 = inputan.nextInt();
        System.out.print(" P = ");
        p2 = inputan.nextInt();
        System.out.print(posisi+ "S = ");
        s2 = inputan.nextInt();
        System.out.print(" P = ");
        p3 = inputan.nextInt();
        System.out.print(posisi+ "S = ");
        s3 = inputan.nextInt();
        System.out.print(" P = ");
        p4 = inputan.nextInt();
        System.out.print(posisi+ "S = ");
        s4 = inputan.nextInt();
        System.out.print(" P = ");
        p5 = inputan.nextInt();
        System.out.print(posisi+ "S = ");
        s5 = inputan.nextInt();
        System.out.print(" P = ");
        p6 = inputan.nextInt();
        System.out.print(posisi+ "S = ");
        s6 = inputan.nextInt();
        System.out.print(" P = ");
        p7 = inputan.nextInt();
        System.out.print(posisi+ "S = ");
        s7 = inputan.nextInt();
        System.out.print(" P = ");
        p8 = inputan.nextInt();
        System.out.print(posisi+ "S = ");
        s8 = inputan.nextInt();
        p9 = inputan.nextInt();
        System.out.print(posisi+ "S = ");
        s9 = inputan.nextInt();
        System.out.print(" P = ");
        p10 = inputan.nextInt();
        System.out.print(posisi+ "S = ");
        s10 = inputan.nextInt();
        inputan.close();
        int  kena = 0;
        
        // Pengecekan kondisi
        if ((Math.pow(p1, 2)+1)==s1) { kena += 1;}
        if ((Math.pow(p2, 2)+1)==s2) { kena += 1;}
        if ((Math.pow(p3, 2)+1)==s3) { kena += 1;}
        if ((Math.pow(p4, 2)+1)==s4) { kena += 1;}
        if ((Math.pow(p5, 2)+1)==s5) { kena += 1;}
        if ((Math.pow(p6, 2)+1)==s6) { kena += 1;}
        if ((Math.pow(p7, 2)+1)==s7) { kena += 1;}
        if ((Math.pow(p8, 2)+1)==s8) { kena += 1;}
        if ((Math.pow(p9, 2)+1)==s9) { kena += 1;}
        if ((Math.pow(p10, 2)+1)==s10) { kena += 1;}

        // output hasil
        System.out.println("Peluru mengenai sasaran = "+ kena);
        System.out.println("Peluru tidak mengenai sasaran = "+ (10-kena));
    }
}
