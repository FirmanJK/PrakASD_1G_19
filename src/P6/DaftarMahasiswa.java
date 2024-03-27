package P6;

public class DaftarMahasiswa {

    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    //setelah ini tuliskan method tambah()
    //setelah ini tuliskan method tampil()
    // setelah ini tuliskan method bubbleSort()
    
    //Setelah ini tuliskan method tambah ()
   void tambah(Mahasiswa m){
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
            } else{
            System.out.println("Data sudah penuh !! ");
       }
    }

    void tampil() {
        for (Mahasiswa m : listMhs) {
            m.tampil();
            System.out.println("============================");
        }
    }

}
