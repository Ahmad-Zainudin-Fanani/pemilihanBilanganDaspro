import java.util.Scanner;

public class PemilihanBilangan02 {

    public static void main(String[] args) {
        // Deklarasi scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        // Menggunakan ternary operator untuk menentukan genap atau ganjil
        String hasil = (angka % 2 == 0) ? "termasuk bilangan genap" : "termasuk bilangan ganjil";
        
        // Menampilkan hasil
        System.out.println("Angka " + angka + " " + hasil);

        // Menutup scanner
        sc.close();
    }
}
