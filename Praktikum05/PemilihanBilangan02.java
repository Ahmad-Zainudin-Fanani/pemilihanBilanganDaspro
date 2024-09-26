import java.util.Scanner;
/**
 * PemilihanBilangan02
 */
public class PemilihanBilangan02 {

    public static void main(String[] args) {
        // Deklarasi scanner
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        if (angka % 2 == 0)
        {
            System.out.println("Angka " + angka + " termasuk bilangan genap");
        }
        else
        {
            System.out.println("Angka " + angka + " termasuk bilangan ganjil");
        }

        // Menutup scanner
        sc.close();
    }
}
