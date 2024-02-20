package P2;

import java.util.Scanner;
public class BukuMain19 {
    
    public static void main(String[] args) {
        Buku bk1 = new Buku19();
        bk1.judul1 = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual();
        bk1.gantiHarga(hrg:60000);
        bk1.tampilInformasi();




    }
}
