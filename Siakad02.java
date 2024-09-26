import java.util.Scanner;

public class Siakad02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data mahasiswa
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        
        System.out.print("Masukkan kelas: ");
        String kelas = input.nextLine();
        
        // Mengubah absen menjadi String
        System.out.print("Masukkan nomor absen: ");
        String absen = input.nextLine();  // Baca input sebagai String
        
        System.out.print("Masukkan nilai kuis: ");
        double nilaiKuis = input.nextDouble();
        
        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = input.nextDouble();
        
        System.out.print("Masukkan nilai ujian: ");
        double nilaiUjian = input.nextDouble();
        
        // Hitung nilai akhir
        double nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        // Menentukan nilai huruf dan kualifikasi
        String nilaiHuruf;
        String kualifikasi;
        
        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir >= 73 && nilaiAkhir < 80) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir >= 65 && nilaiAkhir < 73) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhir >= 60 && nilaiAkhir < 65) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir >= 50 && nilaiAkhir < 60) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else if (nilaiAkhir >= 39 && nilaiAkhir < 50) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        } else {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }

        // Output informasi lengkap
        System.out.println("\nMahasiswa dengan nama " + nama + " (NIM " + nim + ") kelas " + kelas + " nomor absen " + absen);
        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Kualifikasi: " + kualifikasi);
        System.out.println("Nilai akhir huruf: " + nilaiHuruf);
        
        // Menutup scanner
        input.close();
    }
}
