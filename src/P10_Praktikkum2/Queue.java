package P10_Praktikkum2;

public class Queue {
    Nasabah19[] data;
    int front, rear, size, max;

    public Queue(int n) {
        max = n;
        data = new Nasabah19[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty(){
        if (size == 0) {
            return true;
        } else{
            return false;
        }
    }

    public boolean isFull(){
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek(){
        if (!isEmpty()) {
            System.out.println("elemen terdepan : " + data[front].norek + " " + data[front].nama + " "+
            data[front].alamat+ " " + data[front].umur + " " + data[front].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Print(){
        if (isEmpty()){
            System.out.println("Queue masih kosong");
        } else{
            int i = front;
            while (i != rear) {
                System.out.println(data[i].norek + " " + data[i].nama
                + " " + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
                i = (i+1) % max;
            }
            System.out.println(data[i].norek + " " + data[i].nama
            + " " + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil di kosongkan");
        } else{
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(Nasabah19 dt){
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        } else{
            if (isEmpty()) {
                front = rear = 0;
            } else{
                if (rear == max -1){
                    rear = 0;
                } else{
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public Nasabah19 Dequeue(){
        Nasabah19 dt = new Nasabah19();
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else{
            dt = data [front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max -1){
                    front = 0;
                } else {
                    front ++;
                }
            }
        }
        return dt;
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen terbelakang : " + data[rear].norek + " " + data[rear].nama + " "
            + data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
}