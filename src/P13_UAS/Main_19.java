package P13_UAS;
import java.util.Scanner;

public class Main_19 {

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

    private static class Antrian {
        private Customer[] customers;
        private int head;
        private int tail;

        public Antrian() {
            customers = new Customer[100];
            head = 0;
            tail = 0;
        }

        public void enqueue(Customer customer) {
            customers[tail++] = customer;
            if (tail == customers.length) {
                tail = 0;
            }
        }

        public Customer dequeue() {
            if (head == tail) {
                return null;
            }
            Customer customer = customers[head++];
            if (head == customers.length) {
                head = 0;
            }
            return customer;
        }

        public boolean isEmpty() {
            return head == tail;
        }

        public int size() {
            if (tail >= head) {
                return tail - head;
            } else {
                return customers.length - head + tail;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Antrian antrian = new Antrian();

        String nama  = "Mocahmmad Firmandika Jati Kusuma";
        String nim   = "2341720229";
        String absen = "19";

        System.out.println("======= QUIZ 2 PRAKTIKUM ASD TI 1G =======");
        System.out.println("dibuat oleh : " + nama);
        System.out.println("NIM         : " + nim);
        System.out.println("Absen       : " + absen);
        System.out.println("===============================================");
        System.out.println("Sistem Antrian Resto\n");

        int pilihan;
        do {
            System.out.println("Menu");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan Pengurututan pesanan by nama");
            System.out.println("5. Hitung total Pendapatan");
            System.out.println("6. Keluar");
            System.out.print("Pilih(1-5): ");

            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                System.out.println("------------------------------------");
                System.out.println("        Masukkan Data Pembeli       ");
                System.out.println("------------------------------------");
                    System.out.print("Nomor Antrian   : ");
                    String antrian19 = scanner.nextLine();
                    System.out.print("Nama Customer   : ");
                    String nama19 = scanner.nextLine();
                    System.out.print("Nomor HP        : ");
                    String noHp19 = scanner.nextLine();
                    antrian.enqueue(new Customer(nama19, noHp19));
                    System.out.println("Pelanggan " + nama19 + "telah ditambahkan ke antrian.");
                    break;
                case 2:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
                        System.out.println("       Daftar Antrian Resto Royal Delish       ");
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
                        for (int i = 0; i < antrian.size(); i++) {
                            System.out.println("|No." + "    Nama Customer" + "   |No.hp");
                            Customer customer = antrian.customers[(antrian.head + i) % antrian.customers.length];
                            System.out.println(( "|" + i + 1) + ". " + "\t|" + customer.getNama() + "\t| " + customer.getNoHp());
                            System.out.print("Total Antrian : ");
                        }
                    }
                    break;
                case 3:
                System.out.println("+++++++++++++++++++++++++++++++++++++");
                System.out.println("       Transaksi input pesanan       ");
                System.out.println("+++++++++++++++++++++++++++++++++++++");
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
                        System.out.println("       Daftar Antrian Resto Royal Delish       ");
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
                        Customer customer = antrian.dequeue();
                        System.out.println("Pelanggan " + customer.getNama() + " telah dilayani.");
                    }
                    break;
                case 4:
                    // Laporan Pengurututan pesanan by nama
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("       Daftar Pesanan Masuk Resto Royal Delish       ");
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    break;
                case 5:
                    // Hitung total Pendapatan
                    System.out.println("++++++++++++++++++++++");
                    System.out.println("   TOTAL PENDAPATAN   ");
                    System.out.println("++++++++++++++++++++++");
                    break;
                case 6:
                    System.out.println("Terima kasih !");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 6);

        scanner.close();
    }
}