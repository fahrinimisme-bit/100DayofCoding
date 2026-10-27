import java.util.Scanner;

public class day56 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
            int n = s.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
}

        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        s.close();
    }
}
