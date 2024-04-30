package P8;

public class SiswaFirman {
    String nisnFirman;
    String namaFirman;
    String alamatFirman;
    int tahunMasukFirman;
    double nilaiRataRataFirman;

    public SiswaFirman(String nisnFirman, String namaFirman, String alamatFirman, int tahunMasukFirman, double nilaiRataRataFirman) {
        this.nisnFirman = nisnFirman;
        this.namaFirman = namaFirman;
        this.alamatFirman = alamatFirman;
        this.tahunMasukFirman = tahunMasukFirman;
        this.nilaiRataRataFirman = nilaiRataRataFirman;
    }

    public String getNama() {
        return namaFirman;
    }

    public void setNama(String namaFirman) {
        this.namaFirman = namaFirman;
    }

    public String getAlamat() {
        return alamatFirman;
    }

    public void setAlamat(String alamatFirman) {
        this.alamatFirman = alamatFirman;
    }

    public int getTahunMasuk() {
        return tahunMasukFirman;
    }

    public void setTahunMasuk(int tahunMasukFirman) {
        this.tahunMasukFirman = tahunMasukFirman;
    }

    public String toString() {
        return "Siswa{" +
                "nisn            ='" + nisnFirman + '\'' +
                ", nama          ='" + namaFirman + '\'' +
                ", alamat        ='" + alamatFirman + '\'' +
                ", tahunMasuk    =" + tahunMasukFirman +
                ", nilaiRataRata =" + nilaiRataRataFirman +
                '}';
    }
    void tampil() {
        System.out.println("Nisn        = "+ nisnFirman);
        System.out.println("Nama        = "+ namaFirman);
        System.out.println("Alamat      = "+ alamatFirman);
        System.out.println("Tahun Masuk = "+ tahunMasukFirman);
    }
}   