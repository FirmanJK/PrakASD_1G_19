package P3_Tugas;

import java.util.Scanner;

public class BangunRuang {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Kerucut [] KerucutArray = new Kerucut[2];
        LimasSegiEmpatSamaSisi [] limasArray = new LimasSegiEmpatSamaSisi[2];
        Bola [] bolaArray = new Bola[2];

        for (int i = 0; i < KerucutArray.length; i++) {
            System.out.println("Kerucut ke-" + (i));
            System.out.println("Masukkan jari-jari :");
            double jariJariKerucut = sc.nextDouble();
            System.out.println("Masukkan Sisi Miring : ");
            double sisiMiring = sc.nextDouble();
            KerucutArray [i] = new Kerucut(jariJariKerucut, sisiMiring);

            System.out.println("Luas permukaan      : " + KerucutArray[i].hitungLuasPermukaan());
            System.out.println("Volume              : " + KerucutArray[i].hitungVolume());
            System.out.println();
        }

        for (int i = 0; i < limasArray.length; i++) {
            System.out.println("Limas ke-" + (i));
            System.out.println("Masukkan Panjang sisi alas :");
            double panjangSisiAlas = sc.nextDouble();
            System.out.println("Masukkan Tinggi limas : ");
            double tinggiLimas = sc.nextDouble();
            limasArray [i] = new LimasSegiEmpatSamaSisi(panjangSisiAlas, tinggiLimas);
            System.out.println("Luas permukaan : " + limasArray[i].hitungLuasPermukaan());
            System.out.println("Volume       : " + limasArray[i].hitungVolume());
            System.out.println();            
        }
        
        for (int i = 0; i < bolaArray.length; i++) {
            System.out.println("Bola ke-" + (i));
            System.out.println("Masukkan Jari-jari :");
            double jariJariBola = sc.nextDouble();
            bolaArray [i] = new Bola(jariJariBola);
            System.out.println("Luas permukaan  : " + bolaArray[i].hitungLuasPermukaan());
            System.out.println("Volume          : " + bolaArray[i].hitungVolume());
            System.out.println();
        }
    }
}