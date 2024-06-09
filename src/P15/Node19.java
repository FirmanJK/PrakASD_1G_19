package P15;

public class Node19 {
    int data;
    Node19 prev, next;
    int jarak;

    public Node19 (Node19 prev, int data, int jarak, Node19 next){
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }
}