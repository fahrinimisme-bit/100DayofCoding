import java.util.Scanner;

public class day18 {
    public static void main(String[] args) {
        Scanner abangduludek = new Scanner(System.in);
        System.out.println("saye urutkan dari byte jadi masukan angka dari -127 sampe 128");
        ;
        byte b = abangduludek.nextByte();
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;
        System.out.println("byte        : " + b);
        System.out.println("short       : " + s);
        System.out.println("int         : " + i);
        System.out.println("long        : " + l);
        System.out.println("float       : " + f);
        System.out.println("double      : " + d);
        abangduludek.close();
    }
}
