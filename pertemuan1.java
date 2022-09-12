import java.util.Scanner;
public class pertemuan1 {
    public static void main (String[] args){
        int nilai_a, nilai_b, pilihan, result= 0;

        Scanner input_pilihan = new Scanner (System.in);
        System.out.println("Program Kalkulator Sederhana: ");
        System.out.println("===============================");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");

        // Input Data
        System.out.println("Masukkan Nilai A: ");
        nilai_a = input_pilihan.nextInt();
        System.out.println("Masukkan Nilai B: ");
        nilai_b = input_pilihan.nextInt();

        // Pilih Operasi
        System.out.println("Pilih operasi Yang Diinginkan: ");
        pilihan = input_pilihan.nextInt();

        switch (pilihan) {
            case 1 : result = nilai_a + nilai_b; break;
            case 2 : result = nilai_a - nilai_b; break;
            case 3 : result = nilai_a * nilai_b; break;
            default : System.out.println("Maaf Operasi yang anda pilih tidak tersedia");
        }
        System.out.println("Hasil: " + result );

    }

}
