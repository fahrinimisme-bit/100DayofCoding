import java.util.Scanner;

public class day20 {
    public static void main(String[] args) {
        Scanner jawasentris = new Scanner(System.in);

        System.out.print("masukan data char kandaqu        : ");
        char inisial = jawasentris.next().charAt(0);

        System.out.print("masukan data boolean kandaqu     : ");
        boolean status = jawasentris.nextBoolean();

        System.out.print("masukan data byte kandaqu        : ");
        byte bilanganbulat1 = jawasentris.nextByte();

        System.out.print("masukan data short kandaqu       : ");
        short bilanganbulat2 = jawasentris.nextShort();

        System.out.print("masukan data int kandaqu         : ");
        int bilanganbulat3 = jawasentris.nextInt();

        System.out.print("masukan data long kandaqu        : ");
        long bilanganbulat4 = jawasentris.nextLong();

        System.out.print("masukan data float kandaqu       : ");
        float bilangandesimal2 = jawasentris.nextFloat();

        System.out.print("masukan data double kandaqu      : ");
        double bilangandesimal1 = jawasentris.nextDouble();

        String s1 = String.valueOf(inisial);
        String s2 = String.valueOf(status);
        String s3 = String.valueOf(bilanganbulat1);
        String s4 = String.valueOf(bilanganbulat3);
        String s5 = String.valueOf(bilanganbulat2);
        String s6 = String.valueOf(bilanganbulat4);
        String s7 = String.valueOf(bilangandesimal2);
        String s8 = String.valueOf(bilangandesimal1);

        System.out.println("\n    HASIL KONVERSI KE STRING KANDAQU    ");
        System.out.println("char           =   " + s1.valueOf(inisial));
        System.out.println("boolean        =   " + s2.valueOf(status));
        System.out.println("byte           = " + s3.valueOf(bilanganbulat1));
        System.out.println("short          = " + s4.valueOf(bilanganbulat2));
        System.out.println("int            = " + s5.valueOf(bilanganbulat3));
        System.out.println("long           = " + s6.valueOf(bilanganbulat4));
        System.out.println("float          = " + s6.valueOf(bilangandesimal1));
        System.out.println("double         = " + s6.valueOf(bilangandesimal2));

        jawasentris.close();
    }
