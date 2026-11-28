import java.util.Scanner;

public class day88 {

    static void garis() {
        System.out.println("=========================================");
    }

    static void teks(String kata_kata_hari_ini_bossqu) {
        System.out.println("kata hari ini bossqu    !!!!" + kata_kata_hari_ini_bossqu);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("kata    : ");
        String kata_kata_hari_ini_bossqu = s.nextLine();

        garis();
        teks(kata_kata_hari_ini_bossqu);
        garis();
    }
}
