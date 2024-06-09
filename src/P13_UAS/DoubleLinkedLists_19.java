package P13_UAS;

import P13_UAS.Pembeli_19.Pembeli;
import P13_UAS.Pesanan_19.Pesanan;

public class DoubleLinkedLists_19 {
    private Node_19 head19;
    private Node_19 tail19;
    private int size19;

    public DoubleLinkedLists_19() {
        this.head19 = null;
        this.tail19 = null;
        this.size19 = 0;
    }

    public boolean isEmpty() {
        return size19 == 0;
    }

    public int size() {
        return size19;
    }

    public void addFirst(Pembeli pembeli19, Pesanan pesanan19) {
        Node_19 newNode19 = new Node_19(pembeli19, pesanan19);
        if (isEmpty()) {
            head19 = newNode19;
            tail19 = newNode19;
        } else {
            newNode19.setNext(head19);
            head19.setPrev(newNode19);
            head19 = newNode19;
        }
        size19++;
        }

        public void addLast(Pembeli pembeli19, Pesanan pesanan19) {
            Node_19 newNode19 = new Node_19(pembeli19, pesanan19);
            if (isEmpty()) {
                head19 = newNode19;
                tail19 = newNode19;
            } else {
                tail19.setNext(newNode19);    
        }
    }
}