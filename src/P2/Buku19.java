package P2;

public class Buku19 {
    String judul, pengarang;
    int halaman, stok, harga, hargaTotal, jumlahBuku;
    double diskon;

    void tampilInformasi() {
        System.out.println("Judul          : " + judul);
        System.out.println("Pengarang      : " + pengarang);
        System.out.println("Jumlah halaman : " + halaman);
        System.out.println("Sisa stok      : " + stok);
        System.out.println("Harga          : " + harga);
        System.out.println("Harga Total    : " + hargaTotal);
    }
    void terjual(int jml) {
        if(stok > 0) {
           stok -= jml;
           jumlahBuku += jml;
        }
    }
    void restock(int jml) {
        stok += jml;
    }
    void gantiHarga(int hrg) {
        harga = hrg;
    }
    int hitungDiskon() {
        if (hargaTotal > 15000) {
            diskon = hargaTotal * 0.12;
            
        } else if (hargaTotal > 75000){

        
            diskon = hargaTotal * 0.05;
        } else {

        }
            return (int) diskon;
    }
    
    int hargaSetelahDiskon = (hargaTotal * (int) diskon);
    
    int hitungHargaTotal(){
        hargaTotal = harga * jumlahBuku;
        return hargaTotal;
    }
    int hitungHargaBayar () {
        return hargaTotal - hargaSetelahDiskon; 
    }
    public Buku19() {

    }
    
    public Buku19(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;

    }
}