package P9_Stack;

public class Gudang19 {
    Barang19[] tumpukan;
    int size;
    int top;

    public Gudang19(int kapasitas){
        size = kapasitas;
        tumpukan = new Barang19[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else{
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size-1) {
            return true;
        } else{
            return false;
        }
    }

    public void tambahBarang(Barang19 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else{
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang19 ambilBarang(){
        if (!cekKosong()) {
            Barang19 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang");
            System.out.println("Kode unik dalam biner : " + konversiDesimalkeBiner(delete.kode));
            return delete;
        } else{
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang19 lihatBarangTeratas(){
        if (!cekKosong()) {
            Barang19 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas :" + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }    

    public void tampilkanBarang(){
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang : ");
            for (int i = 0; i <= top; i++) {
                System.out.printf("Kode %d: %s (kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);    
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }

    public String konversiDesimalkeBiner(int kode) {
        StackKonversi19 stack = new StackKonversi19();
        while (kode > 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}