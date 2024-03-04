package P3_Tugas2;

public class Mahasiswa {
    String nama, nim;
    char jenisKelamin;
    double ipk;

    public Mahasiswa(String nama, String nim, char jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }

    public String getNama() {
        return nama;
    }

    public String getnim() {
        return nim;
    }

    public char getjenisKelamin() {
        return jenisKelamin;
    }

    public double getIpk() {
        return ipk;
    }
}
