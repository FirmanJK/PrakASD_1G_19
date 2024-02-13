package P1;

import java.util.Scanner;

public class Pemilihan19 {

    public static void main(String[] args) {
        Scanner sc19 = new Scanner(System.in);
        
        // Mendapatkan input nilai dari user
        System.out.println("==============================");
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan nilai tugas  : ");
        int nilaiTugas = sc19.nextInt();
        System.out.print("Masukkan nilai kuis   : ");
        int nilaiKuis = sc19.nextInt();
        System.out.print("Masukkan nilai UTS    : ");
        int nilaiUTS = sc19.nextInt();
        System.out.print("Masukkan nilai UAS    : ");
        int nilaiUAS = sc19.nextInt();
        System.out.println("=============================");

        // Menghitung nilai akhir
        double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);

        // Validasi nilai
        if (nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 || nilaiUTS < 0 || nilaiUTS > 100 || nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("=============================");
            System.out.println("    Nilai tidak valid        ");
            System.out.println("=============================");
            return;
        }

        // Konversi nilai akhir ke nilai huruf
        String nilaiHuruf;
        if (nilaiAkhir >= 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 73) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 39) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        // Menentukan keterangan lulus/tidak lulus
        String keterangan;
        System.out.println("=============================");
        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
            keterangan = "LULUS";
        } else {
            keterangan = "TIDAK LULUS";
        }

        // Menampilkan hasil
        System.out.println("Nilai akhir : " + nilaiAkhir);
        System.out.println("Nilai huruf : " + nilaiHuruf);
        System.out.println("=============================");

        System.out.println("=============================");
        System.out.println("Keterangan  : " + keterangan);
        System.out.println("=============================");
    }
    
}
