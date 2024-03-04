package P3_Tugas2;

import java.util.Scanner;

public class ProgramMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa[] mahasiswa = new Mahasiswa[3];

        // Input data mahasiswa
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            
            System.out.print("Masukkan Nama : ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan NIM : ");
            String nim = scanner.nextLine();

            System.out.print("Masukkan Jenis Kelamin : ");
            char jenisKelamin = scanner.next().charAt(0);

            System.out.print("Masukkan IPK : ");
            double ipk = scanner.nextDouble();
            scanner.nextLine();

            mahasiswa[i] = new Mahasiswa(nama, nim, jenisKelamin, ipk);
        }

        // Menghitung total IPK
        double totalIpk = 0;
        for (Mahasiswa mhs : mahasiswa) {
            totalIpk += mhs.getIpk();
        }

        // Menghitung rata-rata IPK
        double rataRataIpk = totalIpk / mahasiswa.length;

        // Mencari mahasiswa dengan IPK terbaik
        Mahasiswa mahasiswaTerbaik = mahasiswa[0];
        for (int i = 1; i < mahasiswa.length; i++) {
            if (mahasiswa[i].getIpk() > mahasiswaTerbaik.getIpk()) {
                mahasiswaTerbaik = mahasiswa[i];
            }
        }

        // Menampilkan hasil
        System.out.printf("\nRata-rata IPK: %.2f\n", rataRataIpk);
        System.out.println("Mahasiswa dengan IPK terbaik    :");
        System.out.println("Nama    : " + mahasiswaTerbaik.getNama());
        System.out.println("NIM     : " + mahasiswaTerbaik.getnim());
        System.out.println("Jenis Kelamin : " + mahasiswaTerbaik.getjenisKelamin());
        System.out.println("IPK     : " + mahasiswaTerbaik.getIpk());
    }
}