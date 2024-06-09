package P5_BruteForceDivideConquer;

import java.util.Scanner;

public class MainPangkat {
    
    public static void main(String[] args) {
        Scanner sc19 = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("Masukkan jumlah elemen yang dihitung : ");
        int elemen = sc19.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.println("Masukkan nilai yang dipangkatkan : ");
            int nilai = sc19.nextInt();
            System.out.println("Masukkan nilai pangkat : ");
            int pangkat = sc19.nextInt();
            png[i] = new Pangkat(nilai, pangkat);
        }

        System.out.println("\nPilih metode yang ingin digunakan : ");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide Conquer");
        System.out.println("Masukkan pilihan : ");
        int choice = sc19.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("\nHASIL PANGKAT - BRUTE FORCE");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari "
                    + png [i].nilai+ " pangkat "
                    + png [i].pangkat+ " adalah "
                    + png [i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            
            case 2:
                System.out.println("\nHASIL PANGKAT - DIVIDE AND CONQUER");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari "
                    + png [i].nilai+ " pangkat "
                    + png [i].pangkat+ " adalah "
                    + png [i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }
}