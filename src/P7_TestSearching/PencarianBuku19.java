package P7_TestSearching;

public class PencarianBuku19 {
    Buku19 listBk[] = new Buku19[5];
    int idx;
    
    void tambah(Buku19 m) {
        if (idx < listBk.length){
            listBk[idx] =m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku19 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = 0;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku == cari) {
                i = posisi;
                break;  
            }
        }
        return posisi;
    }

    void Tampilposisi(int x, int pos){
        if(pos != -1){
            System.out.println("data : " + x + " ditemukan pada indeks " +pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan ");
        }
    }
}