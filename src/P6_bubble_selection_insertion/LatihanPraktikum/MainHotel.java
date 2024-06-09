package P6_bubble_selection_insertion.LatihanPraktikum;

import java.util.Scanner;

public class MainHotel {
    
    public static void main(String[] args) {
        
       HotelService list = new HotelService();
       Hotel H1 = new Hotel("Santika", "Madiun", 300000, (byte) 3);
       Hotel H2 = new Hotel("Ibis", "Malang", 400000, (byte) 4);
       Hotel H3 = new Hotel("Haris", "Surabaya", 200000, (byte) 2);
       Hotel H4 = new Hotel("Mercure", "Blitar", 600000, (byte) 6);
       Hotel H5 = new Hotel("Grand", "Palembang", 800000, (byte) 8); 

       list.tambah(H1);
       list.tambah(H2);
       list.tambah(H3);
       list.tambah(H4);
       list.tambah(H5);

       Scanner sc19 = new Scanner(System.in);
       System.out.println("\n-----------------------------------------------------------------------");
       System.out.println("Daftar penginapan disorting berdasarkan : ");
       System.out.println("1.Harga dimulai dari harga termurah ke harga tertinggi");
       System.out.println("2.Rating bintang penginapan dari bintang tertinggi (5) ke terendah (1)");
       System.out.println("------------------------------------------------------------------------");
       System.out.print("Masukkan pilihan : ");
       int pilihan = sc19.nextInt();

       switch (pilihan) {
        case 1:
            System.out.println("Sorting Hotel berdasarkan Harga termurah");
            list.bubbleSort();
            list.tampilAll();
            break;
        
        case 2:
            System.out.println("Sorting Hotel berdasarkan Bintang tertinggi");
            list.selectionSort();
            list.tampilAll();
            break;
            default:

            System.out.println("Pilihan tidak ada!");
            break;
       }
    }
}