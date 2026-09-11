public class day10 {
    public static void main(String[] args) {
        
        System.out.println("batas penyimpanan pada tipe data di Java:\n");

        System.out.println("Byte   : " + Byte.MIN_VALUE + " s/d " + Byte.MAX_VALUE);
        System.out.println("Short  : " + Short.MIN_VALUE + " s/d " + Short.MAX_VALUE);
        System.out.println("Int    : " + Integer.MIN_VALUE + " s/d " + Integer.MAX_VALUE);
        System.out.println("Long   : " + Long.MIN_VALUE + " s/d " + Long.MAX_VALUE);
        System.out.println("Float  : " + Float.MIN_VALUE + " s/d " + Float.MAX_VALUE);
        System.out.println("Double : " + Double.MIN_VALUE + " s/d " + Double.MAX_VALUE + "\n");
        
        char huruf = 'A';
        System.out.println("Char dipakai buat simpan 1 karakter, contohnya: " + huruf);

        boolean kondisi = true;
        System.out.println("Boolean cuma punya 2 nilai: " + kondisi + " atau " + !kondisi);
    }
}
