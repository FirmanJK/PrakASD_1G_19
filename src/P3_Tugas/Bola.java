package P3_Tugas;

public class Bola {
    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    double hitungLuasPermukaan() {
        return 4 * 3.14 * jariJari * jariJari;
    }

    double hitungVolume() {
        return (4.0/3.0) * 3.14 * jariJari * jariJari * jariJari;
    }
}