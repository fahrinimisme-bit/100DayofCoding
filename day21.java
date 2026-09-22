public class day21 {
    public static void main(String[] args) {
        String nama = "Eminem";
        String teksumureminem = "53";
        String tekstinggieminem = "1.73";
        String teksrapper = "true";
        String teksinisial = "E";

        int umur = Integer.parseInt(teksumureminem);
        double tinggi = Double.parseDouble(tekstinggieminem);
        boolean rapper = Boolean.parseBoolean(teksrapper);
        char inisial = teksinisial.charAt(0);
        int umurSaya = 18;

        System.out.printf("nama                     : %s%n", nama);
        System.out.printf("umur eminem              : %d%n", umur);
        System.out.printf("tinggi eminem            : %.2f m%n", tinggi);
        System.out.printf("rapper                   : %b%n", rapper);
        System.out.printf("inisial                  : %c%n", inisial);
        System.out.printf("selisih dengan umur saya : %d%n", umur - umurSaya);
    }
}
