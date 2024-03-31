package P5_BruteForceDivideConquer;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc19 =new Scanner(System.in);
        System.out.println("================================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. misal : 5.9)");

        System.out.print("Masukkan jumlan perusahaan : ");
        int jmlPerusahaan = sc19.nextInt();
        Sum []Perusahaan = new Sum[jmlPerusahaan];

        for (int i = 0; i < jmlPerusahaan; i++) {
            System.out.println("=========================================");
            System.out.println("Data perusahaan ke- " +(i+1));
            System.out.print("Masukkan jumlah bulan : ");
            int elm = sc19.nextInt();
            Perusahaan[i] = new Sum(elm);
            System.out.println("=========================================");

            for (int j = 0; j < elm; j++) {
                System.out.print("Masukkan untung bulan ke- " +(j+1)+ " = ");
                Perusahaan[i].keuntungan[j] = sc19.nextDouble();
            }
        }
        for (int i = 0; i < Perusahaan.length; i++) {
            System.out.println("Data perusahaan ke- " +(i+1) + " : ");   
            System.out.println("==============================================");
            System.out.println("Algoritma Brute Force ");
            System.out.println("Total Keuntungan perusahaan selama "+ Perusahaan[i].elemen +" bulan adalah = "
                                +Perusahaan[i].totalBF(Perusahaan[i].keuntungan));
            System.out.println("==============================================");
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total Keuntungan perusahaan selama "+ Perusahaan[i].elemen +" bulan adalah = "
                                +Perusahaan[i].totalDC(Perusahaan[i].keuntungan, 0, Perusahaan[i].elemen-1));
        }
    }
}