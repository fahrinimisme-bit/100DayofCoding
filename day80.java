import java.util.Scanner;

public class day80 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] bulan = { "1. januari", "2. februari", "3. maret", "4. april", "5. mei", "6. juni", "7. juli",
                "8. agustus", "9. september", "10. oktober", "11. november", "12. desember" };
        System.out.print("no. bulan ke : " );
        int no = s.nextInt();
        System.out.println(bulan[no -1]);

    }
}
