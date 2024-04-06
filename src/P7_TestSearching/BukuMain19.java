package P7_TestSearching;

import java.util.Scanner;

public class BukuMain19 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku19 data = new PencarianBuku19();
        int jumBuku = 5;

        System.out.println("================================================");
        System.out.println("Masukkan data Buku secara Urut dari Kode Buku Terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
        System.out.println("============================");
        System.out.print("Kode Buku \t: ");
        int kodeBuku = s.nextInt();
        System.out.print("Judul Buku \t: ");
        String judulBuku = s1.nextLine();
        System.out.print("Tahun Terbit \t: ");
        int tahumTerbit = s.nextInt();
        System.out.print("Pengarang \t: ");
        String pengarang = s1.nextLine();
        System.out.print("Stock \t\t: ");
        int stock = s.nextInt();

        Buku19 m = new Buku19(kodeBuku, judulBuku, tahumTerbit, pengarang, stock);
        data.tambah(m);
        }
    System.out.println("=====================================================");
    System.out.println("Data keseluruhan Mahasiswa : ");
    data.tampil();

    System.out.println("_____________________________________________________");
    System.out.println("_____________________________________________________");
    System.out.println("Pencarian Data : ");
    System.out.println("Masukkan Kode Buku yang dicari : ");
    System.out.print("Kode Buku : ");
    int cari = s.nextInt();
    System.out.println("Menggunakan Sequential Search");
    int posisi = data.FindSeqSearch(cari);
    data.Tampilposisi(cari, posisi);

    data.TampilData(cari, posisi);

    Buku19 dataBuku19 = data.FindBuku(cari);
    dataBuku19.tampilDataBuku();
    }
}