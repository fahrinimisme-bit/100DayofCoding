import java.util.Scanner;

public class day31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Gibran memenuhi syarat umur jadi wakil presiden? : ");
        boolean gibranBisa = sc.nextBoolean();

        System.out.print("mahfud md memenuhi syarat umur jadi wakil presiden? : ");
        boolean mahfudBisa = sc.nextBoolean();

        boolean semuanyaMemenuhiSyarat = gibranBisa && mahfudBisa;
        boolean salahSatuMemenuhiSyarat = gibranBisa || mahfudBisa;
        boolean gibranTidakBisaJadiWakilPresiden = !gibranBisa;

        System.out.printf("Keduanya memenuhi syarat : %b%n", semuanyaMemenuhiSyarat);
        System.out.printf("Salah satu memenuhi syarat : %b%n", salahSatuMemenuhiSyarat);
        System.out.printf("Gibran tidak bisa jadi wakil presiden : %b%n", gibranTidakBisaJadiWakilPresiden);

        sc.close();
    }
}
