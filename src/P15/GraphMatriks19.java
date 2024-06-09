package P15;

public class GraphMatriks19 {
    int vertex;
    int [][] matriks;
    
    public GraphMatriks19(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = 0;
    }

    public void printGraph() throws Exception{
        for (int i = 0; i < vertex; i++) {
            System.out.println("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.println((char) ('A' + j) + " (" + matriks[i][j] + "m),");
                }
            }
            System.out.println();
        }
    }

    public void degree(int asal) throws Exception{
        int k, totalIn = 0, totalOut = 0;

        for (int j = 0; j < vertex; j++) {
            if (matriks[j][asal] != 0) {
                ++totalIn;
            }
        }
        for (k = 0; k < vertex; k++) {
            if (matriks[asal][k] != 0) {
                ++totalOut;
            }
        }
        System.out.println("InDegree dari Gedung " +  (char) ('A' + asal)+ ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal)+ ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalIn + totalOut));
    }
}