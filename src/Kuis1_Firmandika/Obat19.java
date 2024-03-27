package Kuis1_Firmandika;

public class Obat19 {

    String nama19;
    String kategori19;
    int stok19;
    int jumlah19;

    public Obat19(String nama19, String kategori19, int stok19, int jumlah19) {
        this.nama19 = nama19;
        this.kategori19 = kategori19;
        this.stok19 = stok19;
        this.jumlah19 = jumlah19;
    }

    public String getNama() {
        return nama19;
    }

    public void setNama(String nama19) {
        this.nama19 = nama19;
    }

    public String getKategori() {
        return kategori19;
    }

    public void setKategori(String kategori19) {
        this.kategori19 = kategori19;
    }

    public int getStok() {
        return stok19;
    }

    public void setStok(int stok19) {
        this.stok19 = stok19;
    }

    public int getJumlahTerjual() {
        return jumlah19;
    }

    public void setJumlahTerjual(int jumlah19) {
        this.jumlah19 = jumlah19;
    }

    public void tampil() {
        System.out.println("Nama obat       : " + nama19);
        System.out.println("Kategori obat   : " + kategori19);
        System.out.println("Stok obat       : " + stok19);
        System.out.println("Jumlah obat yang terjual    : " + jumlah19);
        System.out.println();
    }

    public int hitungSisa() {
        return stok19 - jumlah19;
    }
}