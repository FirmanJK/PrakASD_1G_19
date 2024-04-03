package P6_bubble_selection_insertion.LatihanPraktikum;


public class HotelService {
    Hotel rooms [] = new Hotel[5];
int idx;

    void tambah(Hotel H) {
        if (idx < rooms.length) {
            rooms[idx] = H;
            idx++;
        } else{
            System.out.println("Data sudah penuh!");
        }
    }
    
    void tampilAll(){
        for (Hotel H : rooms) {
            System.out.println("Nama Hotel = " + H.nama);
            System.out.println("Kota       = " + H.kota);
            System.out.println("Harga      = " + H.harga);
            System.out.println("Bintang    = " + H.bintang);
            System.out.println("--------------------------");
        }
    }
    
    void bubbleSort() {
        for (int i = 0; i < rooms.length-1; i++) {
            for (int j = 1; j < rooms.length-i; j++) {
                if (rooms[j].harga < rooms[j-1].harga) {
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < rooms.length-1; i++) {
            int idxMax = i;
            for (int j = i+1; j < rooms.length; j++) {
                if (rooms[j].bintang > rooms[idxMax].bintang) {
                    idxMax = j;
                }
            }
            Hotel temp = rooms[idxMax];
            rooms[idxMax] = rooms[i];
            rooms[i] = temp;
        }
    }
}