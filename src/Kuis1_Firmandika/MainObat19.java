package Kuis1_Firmandika;

import java.util.Scanner;

public class MainObat19 {
    static int JUMLAH_OBAT19 = 5;

    public static void main(String[] args) {
        Scanner sc19 = new Scanner(System.in);
        Obat19[] obat19 = new Obat19[5];

        //input data obat
        for (int i = 0; i < JUMLAH_OBAT19; i++) {
            System.out.println("\nMasukkan data obat ke-" + (i + 1));

            System.out.print("Nama obat     : ");
            String nama19 = sc19.next();

            System.out.print("Kategori obat : ");
            String kategori19 = sc19.next();

            System.out.print("Stok obat     : ");
            int stok19 = sc19.nextInt();

            System.out.print("Jumlah obat yang terjual : ");
            int jumlah19 = sc19.nextInt();

            obat19[i] = new Obat19(nama19, kategori19, stok19, jumlah19);
        }

        System.out.println();

        // Menampilkan seluruh data obat
        for (Obat19 o : obat19) {
            o.tampil();
        }

        System.out.println();

        // Menghitung dan menampilkan sisa obat
        for (Obat19 o : obat19) {
            int sisaObat19 = o.hitungSisa();
            System.out.println("Sisa obat " + o.getNama() + ": " + sisaObat19);
        }

        System.out.println();

        // Mencari dan menampilkan obat paling laku
        Obat19 obatPalingLaku19 = obat19[0];
        for (int i = 1; i < JUMLAH_OBAT19; i++) {
            if (obat19[i].getJumlahTerjual() > obatPalingLaku19.getJumlahTerjual()) {
                obatPalingLaku19 = obat19[i];
            }
        }

        System.out.println("Obat paling laku    : " + obatPalingLaku19.getNama());

        System.out.println();

        // Mengurutkan dan menampilkan daftar obat
        for (int i = 0; i < JUMLAH_OBAT19 - 1; i++) {
            for (int j = i + 1; j < JUMLAH_OBAT19; j++) {
                if (obat19[i].getStok() > obat19[j].getStok()) {
                    Obat19 temp19 = obat19[i];
                    obat19[i] = obat19[j];
                    obat19[j] = temp19;
                }
            }
        }

        System.out.println("Daftar obat : ");
        for (Obat19 o : obat19) {
            o.tampil();
        }
    }
}