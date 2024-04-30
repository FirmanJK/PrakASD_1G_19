package P8;

public class DataSiswaFirman {
    SiswaFirman nomorFirman[] = new SiswaFirman[6];
    int idx;

    void tambah(SiswaFirman S) {
        if (idx < nomorFirman.length) {
            nomorFirman[idx] = S;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampilAll() {
        for (SiswaFirman S : nomorFirman) {
            if (S != null) {
                System.out.println("Nisn           = " + S.nisnFirman);
                System.out.println("Nama           = " + S.namaFirman);
                System.out.println("Alamat         = " + S.alamatFirman);
                System.out.println("Tahun masuk    = " + S.tahunMasukFirman);
                System.out.println("--------------------------");
            }
        }
    }

    void bubbleSort() {
        for (int i = 0; i < nomorFirman.length - 1; i++) {
            for (int j = 1; j < nomorFirman.length - i; j++) {
                if (nomorFirman[j] != null && nomorFirman[j - 1] != null && nomorFirman[j].namaFirman.compareTo(nomorFirman[j - 1].namaFirman) < 0) {
                    SiswaFirman temp = nomorFirman[j];
                    nomorFirman[j] = nomorFirman[j - 1];
                    nomorFirman[j - 1] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < nomorFirman.length - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < nomorFirman.length; j++) {
                if (nomorFirman[j] != null && nomorFirman[idxMax] != null && nomorFirman[j].tahunMasukFirman > nomorFirman[idxMax].tahunMasukFirman) {
                    idxMax = j;
                }
            }
            if (nomorFirman[idxMax] != null && nomorFirman[i] != null) {
                SiswaFirman temp = nomorFirman[idxMax];
                nomorFirman[idxMax] = nomorFirman[i];
                nomorFirman[i] = temp;
            }
        }
    }
}