import java.util.Scanner;

public class day24 {
    public static void main(String[] args) {
        Scanner amba = new Scanner(System.in);
        int panjang = amba.nextInt();
        int lebar = amba.nextInt();
        int LuasPersegi = panjang * lebar;
        System.out.printf(" HASIL = %d%n", LuasPersegi);
        amba.close();
        
    }
}
