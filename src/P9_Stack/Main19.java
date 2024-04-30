package P9_Stack;
import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        Gudang19 gudang = new Gudang19(7);
        Scanner sc19 = new Scanner(System.in);
        
        boolean ulangi = true;
        while (ulangi) {
            System.out.println("\nMenu : ");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih operasi : ");
            int pilihan = sc19.nextInt();
            sc19.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang : ");
                    int kode = sc19.nextInt();
                    System.out.print("Masukkan nama barang : ");
                    String nama = sc19.next();
                    System.out.print("Masukkan nama kategori : ");
                    String kategori = sc19.next();
                    Barang19 barangBaru = new Barang19(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    ulangi = false;
                    break;
                default:

                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
        }
    }
}