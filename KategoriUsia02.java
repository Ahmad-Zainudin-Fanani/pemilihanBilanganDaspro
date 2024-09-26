import java.util.Scanner;

public class KategoriUsia02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan usia Anda: ");
    
        if (!input.hasNextInt()) {
            System.out.println("Input tidak valid. Silakan masukkan angka positif.");
            input.close();
            return; 
        }
        int usia = input.nextInt();
        
        if (usia < 0) {
            System.out.println("Usia tidak bisa negatif. Silakan masukkan angka positif.");
            input.close();
            return;
        }
        // Menentukan kategori usia
        String kategori;
        if (usia >= 0 && usia <= 12) {
            kategori = "Anak";
        } else if (usia >= 13 && usia <= 19) {
            kategori = "Remaja";
        } else if (usia >= 20 && usia <= 64) {
            kategori = "Dewasa";
        } else {
            kategori = "Lansia";
        }

        // Menampilkan kategori usia
        System.out.println("Kategori usia Anda: " + kategori);

        // Menutup scanner
        input.close();
    }
}
