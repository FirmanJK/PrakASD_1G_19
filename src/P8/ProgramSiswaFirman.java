package P8;

import java.util.Scanner;

public class ProgramSiswaFirman {
    public static void main(String[] args) {
        DataSiswaFirman list = new DataSiswaFirman(); // Menggunakan DataSiswaFirman
        Scanner scanner = new Scanner(System.in);

        // Inisialisasi data siswa
        SiswaFirman S1 = new SiswaFirman("2321", "Adi", "Mali", 2015, 81);
        SiswaFirman S2 = new SiswaFirman("2341", "Diki", "Madiun", 2014, 82);
        SiswaFirman S3 = new SiswaFirman("2351", "Dina", "Singosari", 2013, 80);
        SiswaFirman S4 = new SiswaFirman("2451", "Adin", "Bandulan", 2011, 87);
        SiswaFirman S5 = new SiswaFirman("2351", "Ali", "Blitar", 2010, 85);
        SiswaFirman S6 = new SiswaFirman("2317", "Dika", "Malang", 2012, 90);

        // Menambahkan data ke objek list
        list.tambah(S1);
        list.tambah(S2);
        list.tambah(S3);
        list.tambah(S4);
        list.tambah(S5);
        list.tambah(S6);

        while (true) {
            System.out.println("\nMenu Utama    :");
            System.out.println("1. Tampilkan data siswa");
            System.out.println("2. Cari data siswa berdasarkan nama");
            System.out.println("3. Urutkan data siswa berdasarkan tahun masuk");
            System.out.println("0. Keluar");

            System.out.print("Pilih menu : ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Tampilkan data siswa : ");
                    list.tampilAll();
                    break;
                case 2:
                    System.out.print("Masukkan nama siswa yang dicari : ");
                    String namaCari = scanner.nextLine();
                    list.bubbleSort();
                    tampilkanDataSiswa(list, namaCari);
                    break;
                case 3:
                    list.selectionSort();
                    System.out.println("Urutkan data siswa berdasarkan tahun masuk : ");
                    list.tampilAll();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan Sistem Informasi Akademik!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    // Metode untuk menampilkan data siswa berdasarkan nama
    static void tampilkanDataSiswa(DataSiswaFirman list, String namaCari) {
        boolean ditemukan = false;
        for (SiswaFirman siswa : list.nomorFirman) {
            if (siswa != null && siswa.namaFirman.equalsIgnoreCase(namaCari)) {
                System.out.println("Nisn        = " + siswa.nisnFirman);
                System.out.println("Nama        = " + siswa.namaFirman);
                System.out.println("Alamat      = " + siswa.alamatFirman);
                System.out.println("Tahun masuk = " + siswa.tahunMasukFirman);
                System.out.println("--------------------------");
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Data siswa dengan nama " + namaCari + " tidak ditemukan.");
        }
    }
}