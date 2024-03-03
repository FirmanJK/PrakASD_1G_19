package P3_ArrayBalok;

public class Segitiga {
    public int alas;
    public int tinggi;
    
    public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    public double hitungLuas() {
        return 1/2 * alas * tinggi;
    }

    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return (int) alas + (int) tinggi + (int) sisiMiring;
    }
}