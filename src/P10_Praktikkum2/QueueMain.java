package P10_Praktikkum2;

import java.util.Scanner;

public class QueueMain {

    public static void menu() {
        System.out.println("Pilih menu : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian kelar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        Scanner sc19 = new Scanner(System.in);

        System.out.print("Masukkan kapasistas queue : ");
        int jumlah = sc19.nextInt();

        Queue antri19 = new Queue(jumlah);
        int pilih;

        do{
            menu();
            pilih = sc19.nextInt();
            sc19.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("No Rekening : ");
                    String norek = sc19.nextLine();
                    System.out.print("Nama : ");
                    String nama =  sc19.nextLine();
                    System.out.print("Alamat : ");
                    String alamat = sc19.nextLine();
                    System.out.print("Umur : ");
                    int umur = sc19.nextInt();
                    System.out.print("Saldo : ");
                    double saldo = sc19.nextDouble();
                    Nasabah19 nb = new Nasabah19(norek, nama, alamat, umur,saldo);
                    sc19.nextLine();
                    antri19.Enqueue(nb);
                    break;
                case 2:
                    Nasabah19 data = antri19.Dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) & !"".equals(data.alamat)
                        && data.umur != 0 && data.saldo !=0) {
                            System.out.println("Antrian yang keluar : " + data.norek + " " + data.nama + " " 
                            + data.alamat + " " + data.umur + " " + data.saldo);
                            break;
                        }
                case 3:
                    antri19.peek();
                    break;
                case 4:
                     antri19.Print();
                    break;
            }
        } 
        while(pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}