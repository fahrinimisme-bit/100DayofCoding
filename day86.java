import java.util.Scanner;

public class day86 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] nama = { "prabowo", "teddy", "bahlil", "hashim djojopoke", "jokowi" };
        System.out.print("nama yang dicari    : ");
        String n = s.nextLine();
        boolean m = false;
        int urut = 0;
        for (int i = 0; i < nama.length; i++) {
            if (nama[i].equalsIgnoreCase(n)) {
                m = true;
                urut = i + 1;
                break;

            }
        }
        if (m) {
            System.out.println("nama " + n + " urut  ke " + urut);

        } else {
            System.out.println("nama " + n + " tidak ada dalam daftar nama");
        }
    }
}
