package P3_Tugas;

public class LimasSegiEmpatSamaSisi {
    private double sisiAlas;
    private double tinggiLimas;

    public LimasSegiEmpatSamaSisi(double sisiAlas, double tinggiLimas) {
        this.sisiAlas = sisiAlas;
        this.tinggiLimas = tinggiLimas;
    }

    double hitungLuasPermukaan() {
        double luasAlas = sisiAlas * sisiAlas;
        double luasSisiTegak = 4 * (0.5 * sisiAlas * tinggiLimas);
        return luasAlas + luasSisiTegak;
    }

    double hitungVolume() {
        return (1/3) * sisiAlas * tinggiLimas;
    }
}