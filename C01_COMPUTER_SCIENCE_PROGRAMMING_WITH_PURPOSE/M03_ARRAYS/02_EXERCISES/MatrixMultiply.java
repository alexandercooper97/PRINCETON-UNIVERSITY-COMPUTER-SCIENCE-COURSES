import java.util.*;

public final class MatrixMultiply {
    private MatrixMultiply() {}

    /** Multiply A(n×m) dot B(m×p)*/
    public static int[][] multiply(int[][] A, int[][] B) {
        if (A == null || B == null || A.length == 0 || B.length == 0)
            throw new IllegalArgumentException("Null or empty matrices");

        int n = A.length;
        int m = A[0].length;
        int m2 = B.length;
        int p = B[0].length;

        // Validar rectangulares
        for (int i = 0; i < n; i++)
            if (A[i].length != m) throw new IllegalArgumentException("A not rectangular");
        for (int i = 0; i < m2; i++)
            if (B[i].length != p) throw new IllegalArgumentException("B not rectangular");

        if (m != m2) throw new IllegalArgumentException("cols(A) != rows(B)");

        int[][] C = new int[n][p];
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < m; k++) {
                int aik = A[i][k];
                if (aik == 0) continue;
                for (int j = 0; j < p; j++) {
                    C[i][j] += aik * B[k][j];
                }
            }
        }
        return C;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // Leer matriz A
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] A = new int[n][m];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++)
                    A[i][j] = sc.nextInt();

            // Leer matriz B
            int m2 = sc.nextInt();
            int p = sc.nextInt();
            int[][] B = new int[m2][p];
            for (int i = 0; i < m2; i++)
                for (int j = 0; j < p; j++)
                    B[i][j] = sc.nextInt();

            // Multiplicar
            int[][] C = multiply(A, B);


            System.out.print("\n");
            // Imprimir resultado
            for (int i = 0; i < C.length; i++) {
                for (int j = 0; j < C[0].length; j++) {
                    if (j > 0) System.out.print(" ");
                    System.out.print(C[i][j]);
                }
                if (i + 1 < C.length) System.out.println();
            }
            System.out.print("\n");
        } catch (Exception e) {
            System.out.print("ERROR");
        }
    }
}

