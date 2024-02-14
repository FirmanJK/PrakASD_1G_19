package P1;

import java.util.Scanner;

public class Fungsi19 {

    private static final int[][] STOCK_BUNGA = {
        {10, 6, 2, 5},
        {5, 11, 10, 7},
        {15, 9, 10, 12},
        { 7, 12, 5, 9}
    };

    private static final int[] HARGA_BUNGA = { 75000, 50000, 60000, 10000};

    public static void main(String[] args) {
        Scanner sc19 = new Scanner(System.in);

        System.out.println("========================");
        System.out.println("Pendapatan Setiap Cabang");
        System.out.println("========================");

        // Menampilkan pendapatan setiap cabang jika semua bunga habis terjual
        System.out.println("Pendapatan setiap cabang jika semua bunga habis terjual : ");
        for (int i = 0; i < STOCK_BUNGA.length; i++) {
            int pendapatanCabang = 0;
            for (int j = 0; j < STOCK_BUNGA[i].length; j++) {
                pendapatanCabang += STOCK_BUNGA[i][j] * HARGA_BUNGA[j];
            }
            System.out.println("Cabang " + (i + 1) + " : Rp" + pendapatanCabang);
        }

        System.out.println("\n=======================");
        System.out.println("      Jumlah Stock     ");
        System.out.println("=======================");

        // Menampilkan jumlah stok setiap jenis bunga pada cabang RoyalGarden
        System.out.println("Jumlah stok setiap jenis bunga pada cabang RoyalGarden  : ");
        for (int i = 0; i < HARGA_BUNGA.length; i++) {
            int totalStok = 0;
            for (int j = 0; j < STOCK_BUNGA.length; j++) {
                totalStok += STOCK_BUNGA[j][i];
            }
            System.out.println(namaBunga (i) + ": " + totalStok);
        }

        System.out.println("\n====================");
        System.out.println(" Pengurangan Stock    ");
        System.out.println("====================");
        // Mengurangi stok bunga karena bunga mati
        System.out.println("Pengurangan stok bunga karena bunga mati  : ");
        int penguranganAglonema = sc19.nextInt();
        int penguranganKeladi = sc19.nextInt();
        int penguranganAlocasia = sc19.nextInt();
        int penguranganMawar = sc19.nextInt();

        for (int i = 0; i < STOCK_BUNGA.length; i++) {
            STOCK_BUNGA[i][0] -= penguranganAglonema;
            STOCK_BUNGA[i][1] -= penguranganKeladi;
            STOCK_BUNGA[i][2] -= penguranganAlocasia;
            STOCK_BUNGA[i][3] -= penguranganMawar;
        }

        System.out.println("\n============================");
        System.out.println("   Total Stok Bunga Tersedia  ");
        System.out.println("==============================");
        // Menampilkan stok bunga setelah pengurangan
        System.out.println("Stok bunga setelah pengurangan    : ");
        for (int i = 0; i < STOCK_BUNGA.length; i++) {
            for (int j = 0; j < STOCK_BUNGA[i].length; j++) {
                System.out.print(STOCK_BUNGA[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static String namaBunga(int index) {
        switch (index) {
            case 0:
                return "Aglonema ";
            case 1:
                return "Keladi   ";
            case 2:
                return "Alocasia ";
            case 3:
                return "Mawar    ";
            default:
                return "         ";
        }
    }
}
