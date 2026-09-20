import java.util.Scanner;

public class day19 {
    public static void main(String[] args) {
        Scanner KANDABAHLIL = new Scanner(System.in);

        System.out.print("Masukkan angka double kandaq: ");
        double angka = KANDABAHLIL.nextDouble();

        float hasilFloat = (float) angka;
        long hasilLong = (long) hasilFloat;
        int hasilInt = (int) hasilLong;
        short hasilShort = (short) hasilInt;
        byte hasilByte = (byte) hasilShort;

        System.out.println("\nHasil konversi:");
        System.out.println("Double : " + angka);
        System.out.println("Float  : " + hasilFloat);
        System.out.println("Long   : " + hasilLong);
        System.out.println("Int    : " + hasilInt);
        System.out.println("Short  : " + hasilShort);
        System.out.println("Byte   : " + hasilByte);

        KANDABAHLIL.close();
    }
}
