import java.util.Scanner;

public class day23 {
    public static void main(String[] args) {
        Scanner doomsday = new Scanner(System.in);
        int sisi = doomsday.nextInt();
        int luasPersegi = sisi * sisi;
        System.out.printf("TOTAL LUAS PERSEGI = %d * %d%n = %d", sisi, sisi, luasPersegi);
        doomsday.close();
    }

}
