package Tugas_Latihan;
/**
 *
 * @author user
 * NAMA     : Afsani Wahyu Mawardi
 * KELAS    : TI RegPagi
 * NIM      : 23215058
 * Dekskipsi 
 * Progam   : Progam ini untuk menampilkan Switch-Case Warna
 *          Warna Kepribadian
 */
import java.util.Scanner;
public class Latihan_29 {
    
    // Konstanta untuk warna
    public static final String RESET = "\033[0m";
    public static final String BG_MERAH = "\033[41m";  // Background merah
    public static final String BG_HIJAU = "\033[42m";  // Background hijau
    public static final String BG_KUNING = "\033[43m"; // Background kuning
    public static final String BG_BIRU = "\033[44m";   // Background biru
    public static final String BG_UNGU = "\033[45m";   // Background ungu
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Menampilkan header
        System.out.println("\033[35mYUK CEK\033[0m \033[34mKEPRIBADIANMU\033[0m \033[31mDARI\033[0m \033[34mWARNA\033[0m \033[33mFAVORITMU\033[0m\n");

        
        // Menampilkan warna-warna dan background color
        System.out.println( "   " + BG_MERAH + "       MERAH      " + RESET );
        System.out.println( "   " + BG_HIJAU + "       HIJAU      " + RESET );
        System.out.println( "   " + BG_KUNING + "      KUNING      " + RESET );
        System.out.println( "   " + BG_BIRU + "       BIRU       " + RESET );
        System.out.println( "   " + BG_UNGU + "       UNGU       " + RESET );

        // Minta pengguna memilih warna
        System.out.println("");
        System.out.print("PILIH WARNA FAVORITMU: ");
        String warnaFavorit = scanner.nextLine().toUpperCase();

        // Minta pengguna memasukkan nama
        System.out.print("NAMA KAMU: ");
        String nama = scanner.nextLine();

        // Tampilkan hasil tes kepribadian berdasarkan warna
        System.out.println("\n===HASIL TEST KEPRIBADIAN " + nama + "===");
        System.out.println("Warna Favoritmu adalah " + warnaFavorit);

        switch (warnaFavorit) {
            case "MERAH":
                System.out.println("1. Pemimpin,\n2. Berani,\n3. Energik,\n4. Suka tantangan,\n5. Percaya diri,\n6. Emosional,\n7. Agresif,\n8. Impulsif");
                break;
            case "HIJAU":
                System.out.println("1. Damai,\n2. Peduli,\n3. Sabar,\n4. Penyayang,\n5. Harmonis,\n6. Lembut,\n7. Mandiri,\n8. Suka alam");
                break;
            case "KUNING":
                System.out.println("1. Optimis,\n2. Ceria,\n3. Kreatif,\n4. Cerdas,\n5. Sosial,\n6. Suka bersenang-senang,\n7. Mudah bosan,\n8. Egois");
                break;
            case "BIRU":
                System.out.println("1. Menyenangkan,\n2. Bijaksana,\n3. Pembawaan diri tenang saat menghadapi masalah,\n4. Dinamis,\n5. Senang berbagi,\n6. Bersahabat,\n7. Tidak terlalu suka menjadi sorotan banyak orang,\n8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai");
                break;
            case "UNGU":
                System.out.println("1. Intuitif,\n2. Mistis,\n3. Kreatif,\n4. Sensitif,\n5. Misterius,\n6. Independen,\n7. Individualis,\n8. Suka hal-hal yang unik");
                break;
            default:
                System.out.println("Warna yang Anda pilih tidak valid.");
        }
    }
}