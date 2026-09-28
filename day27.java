import java.util.Scanner;

public class day27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int k = ++a;
        int b = a++;
        System.out.printf("increment prefix\t:%d%n", k);
        System.out.printf("increment postfix\t:%d%n", b);
        int c = --a;
        int f = a--;
        System.out.printf("decrement prefix\t:%d%n", c);
        System.out.printf("decrement postfix\t:%d%n", f);
        
        s.close();
    }
}
