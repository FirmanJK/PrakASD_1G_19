package P13_UAS;
import P13_UAS.Pesanan_19.Pesanan;

public class Pesanan_19 {
    class Pesanan {
        private int kodePesanan19, harga19;
        private String namaPesanan19;
    
        public Pesanan(int kodePesanan19, String namaPesanan19, int harga19) {
            this.kodePesanan19 = kodePesanan19;
            this.namaPesanan19 = namaPesanan19;
            this.harga19 = harga19;
        }
    
        public int getKodePesanan() {
            return kodePesanan19;
        }
    
        public void setKodePesanan(int kodePesanan19) {
            this.kodePesanan19 = kodePesanan19;
        }
    
        public String getNamaPesanan() {
            return namaPesanan19;
        }
    
        public void setNamaPesanan(String namaPesanan19) {
            this.namaPesanan19 = namaPesanan19;
        }
    
        public int getHarga() {
            return harga19;
        }
    
        public void setHarga(int harga19) {
            this.harga19 = harga19;
        }

        public String toString() {
            return "Pesanan{" +
                    "kodePesanan   =    " + kodePesanan19 +
                    ", namaPesanan =    '" + namaPesanan19 + '\'' +
                    ", harga       =    " + harga19 +
                    '}';
        }
    }
}