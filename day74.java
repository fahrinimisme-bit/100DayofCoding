import java.util.Scanner;

public class day74 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("masukkan teks   : ");
String teks = s.nextLine();
System.out.println("panjang teks     : " +teks.length());
System.out.println("teks huruf besar : " +teks.toUpperCase());
System.out.println("teks huruf kecil : " +teks.toLowerCase());
System.out.println("teks asli        : " +teks);
}
}
