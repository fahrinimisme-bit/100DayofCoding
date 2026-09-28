import java.util.Scanner;

public class day27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int k = ++a;
        int b = a++;
        System.out.printf("%d%n%d%n", k, b);
        int c = --a;
        int f = a--;
        System.out.printf("%d%n%d%n", c, f);
        s.close();
    }
}
