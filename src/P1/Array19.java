package P1;

import java.util.Scanner;

public class Array19 {

    public static void main(String[] args) {
        Scanner sc19 = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("Program Menghitung IP Semester  ");
        System.out.println("================================");

        // Input jumlah matakuliah
        System.out.print("Masukkan jumlah matakuliah    : ");
        int n = sc19.nextInt();
        sc19.nextLine();

        // Array untuk menyimpan nama matakuliah, nilai huruf, dan bobot SKS
        String[] namaMatkul = new String[n];
        String[] nilaiHuruf = new String[n];
        int[] bobotSks = new int[n];

        // Input data matakuliah
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nama matakuliah ke-" + (i + 1) + "   : ");
            namaMatkul[i] = sc19.nextLine();

            System.out.print("Masukkan nilai huruf matakuliah ke-" + (i + 1) + "    : ");
            nilaiHuruf[i] = sc19.nextLine();

            System.out.print("Masukkan bobot SKS matakuliah ke-" + (i + 1) + "  : ");
            bobotSks[i] = sc19.nextInt();

            sc19.nextLine();
        }

        // Hitung nilai setara
        double[] nilaiSetara = new double[n];
        for (int i = 0; i < n; i++) {
            switch (nilaiHuruf[i]) {
                case "A":
                    nilaiSetara[i] = 4.0;
                    break;
                case "B":
                    nilaiSetara[i] = 3.0;
                    break;
                case "C":
                    nilaiSetara[i] = 2.0;
                    break;
                case "D":
                    nilaiSetara[i] = 1.0;
                    break;
                case "E":
                    nilaiSetara[i] = 0.0;
                    break;
            }
        }

        // Hitung IP Semester
        double ipSemester = 0.0;
        double totalSks = 0.0;
        for (int i = 0; i < n; i++) {
            ipSemester += nilaiSetara[i] * bobotSks[i];
            totalSks += bobotSks[i];
        }

        ipSemester /= totalSks;

        // Tampilkan hasil
        System.out.println("IP Semester : " + ipSemester);
    }

}