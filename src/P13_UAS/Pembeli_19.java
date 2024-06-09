package P13_UAS;

public class Pembeli_19 {
    class Pembeli {
        private String namaPembeli19, noHp19;
    
        public Pembeli(String namaPembeli19, String noHp19) {
            this.namaPembeli19 = namaPembeli19;
            this.noHp19 = noHp19;
        }
    
        public String getNamaPembeli() {
            return namaPembeli19;
        }
    
        public void setNamaPembeli(String namaPembeli19) {
            this.namaPembeli19 = namaPembeli19;
        }
    
        public String getNoHp() {
            return noHp19;
        }
    
        public void setNoHp(String noHp19) {
            this.noHp19 = noHp19;
        }
        private static class Customer {
            private String nama;
            private String noHp;
    
            public Customer(String nama, String noHp) {
                this.nama = nama;
                this.noHp = noHp;
            }
    
            public String getNama() {
                return nama;
            }
    
            public String getNoHp() {
                return noHp;
            }
        }
    }
}