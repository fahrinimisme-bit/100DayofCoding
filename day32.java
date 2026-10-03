
public class day32 {
public static void main(String[] args) {

    System.out.println("gaji wantimpres  : ");
    int gajiWantimpres = 76000000;
    System.out.println("gaji guru  : ");
    int gajiGuru = 500000;

    boolean gajiWantimpresLebihBesar = gajiWantimpres > gajiGuru;
    boolean gajiGuruLebihBesar = gajiGuru > gajiWantimpres;
    boolean gajiSama = gajiWantimpres == gajiGuru;
    boolean gajiTidakSama = gajiWantimpres != gajiGuru;


    System.out.println("Gaji Wantimpres lebih besar: " + gajiWantimpresLebihBesar);
    System.out.println("Gaji Guru lebih besar: " + gajiGuruLebihBesar);
    System.out.println("Gaji sama: " + gajiSama);
    System.out.println("Gaji tidak sama: " + gajiTidakSama);

}
}
