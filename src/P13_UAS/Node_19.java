package P13_UAS;
import P13_UAS.Pembeli_19.Pembeli;
import P13_UAS.Pesanan_19.Pesanan;

public class Node_19 {
     private Pembeli pembeli19;
     private Pesanan pesanan19;
     private Node_19 prev19;
     private Node_19 next19;

    public Node_19(Pembeli pembeli19, Pesanan pesanan19) {
        this.pembeli19 = pembeli19;
        this.pesanan19 = pesanan19;
        this.prev19 = null;
        this.next19 = null;
    }

    public Pembeli getPembeli() {
        return pembeli19;
    }

    public void setPembeli(Pembeli pembeli19) {
        this.pembeli19 = pembeli19;
    }

    public Pesanan getPesanan() {
        return pesanan19;
    }

    public void setPesanan(Pesanan pesanan19) {
        this.pesanan19 = pesanan19;
    }

    public Node_19 getPrev() {
        return prev19;
    }

    public void setPrev(Node_19 prev19) {
        this.prev19 = prev19;
    }

    public Node_19 getNext() {
        return next19;
    }

    public void setNext(Node_19 next19) {
        this.next19 = next19;
    }
}