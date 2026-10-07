import java.util.Scanner;

public class day36 {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("masukkan bilangan: ");
    int bilangan = s.nextInt();
    if (bilangan % 2 == 0) {
        System.out.println("bilangan genap");
    } else {
        System.out.println("bilangan ganjil");
    }
}
}
