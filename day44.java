import java.util.Scanner;

public class day44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nilai : ");
        int nilai = sc.nextInt();
        char predikat = ' ';

        if (nilai < 0 || nilai > 100) {
            System.out.println("nilai mu gak masok cak gak valid awakmu");
        } else if (nilai >= 85) {
            System.out.println("nilai mu sangat baik kamu keturunan albert einsten ya");
            predikat = 'A';
        } else if (nilai >= 75) {
            System.out.println("nilai mu baik ");
            predikat = 'B';
        } else if (nilai >= 65) {
            System.out.println("nilai mu lumayan normal lah");
            predikat = 'C';
        } else if (nilai >= 55) {
            System.out.println("nilai mu anjlok seperti rupiah");
            predikat = 'D';
        } else {
            System.out.println("nilai sangat sangat buruk saya sarankan jangan terlalu banyak mengikuti organisasi");
            predikat = 'E';
        }
        System.out.printf("nilai : %d predikat : %c ", nilai, predikat);

    }
}
