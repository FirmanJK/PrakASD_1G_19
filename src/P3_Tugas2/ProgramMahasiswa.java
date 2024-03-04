package P3_Tugas2;

import java.util.Scanner;

public class ProgramMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa[] mahasiswa = new Mahasiswa[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke- " + (i + 1));
            
            System.out.print("Masukkan Nama : ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan NIM : ");
            String nim = scanner.nextLine();

            System.out.print("Masukkan Jenis Kelamin : ");
            char jenisKelamin = scanner.next().charAt(0);

            System.out.print("IPK : ");
            double ipk = scanner.nextDouble();
            scanner.nextLine();

            mahasiswa[i] = new Mahasiswa(nama, nim, jenisKelamin, ipk);
        }
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.println("Nama : " + mahasiswa[i].getNama());
            System.out.println("NIM  : " + mahasiswa[i].getnim());
            System.out.println("Jenis Kelamin : " + mahasiswa[i].getjenisKelamin());
            System.out.println("IPK  : " + mahasiswa[i].getIpk());
        }
    }
}