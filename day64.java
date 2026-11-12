import java.util.Scanner;

public class day64 {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Masukkan N  : ");
    int n = s.nextInt();
    int total = 1;
    for (int i = 1; i <= n; i++) {
        total*=i;
        System.out.println("loop ke : "+ i+", dengan total : " +total );
    }
    System.out.println("hasil dari " + n + "! = "+ total);


}
}
