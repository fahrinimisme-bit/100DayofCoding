import java.util.Scanner;

public class day41 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ISI TEMPERATURE DI RUANGAN ANDA\t°C:");
        double temperature = s.nextDouble();
        String suhu;

        if (temperature < 18) {
            suhu = "DINGIN";

        } else if (temperature <= 30) {
            suhu = "NORMAL";
        } else {
            suhu = "PUANAS CIK";
        }
        System.out.printf("TEMPERATURE DIRUANGAN ANDA %.1f°C \n SUHU: %s", temperature, suhu);

    }
}
