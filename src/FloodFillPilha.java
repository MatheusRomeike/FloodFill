public class FloodFillPilha {
    private int[][] matriz;
    private int largura;
    private int altura;
    private int corAntiga;
    private int novaCor;

    public FloodFillPilha(int[][] matriz) {
        this.matriz = matriz;
        this.largura = matriz.length;
        this.altura = matriz[0].length;
    }

    public void floodFill(int x, int y, int novaCor) {
        corAntiga = matriz[x][y];
        this.novaCor = novaCor;

        if (corAntiga == novaCor) {
            return;
        }

        Pilha<Point> pilha = new Pilha<>();
        pilha.add(new Point(x, y));

        while (!pilha.isEmpty()) {
            Point atual = pilha.remove();

            int i = atual.x;
            int j = atual.y;

            if (matriz[i][j] == corAntiga) {
                matriz[i][j] = novaCor;

                if (i - 1 >= 0) pilha.add(new Point(i - 1, j));
                if (i + 1 < largura) pilha.add(new Point(i + 1, j));
                if (j - 1 >= 0) pilha.add(new Point(i, j - 1));
                if (j + 1 < altura) pilha.add(new Point(i, j + 1));
            }
        }
    }

    public void imprimirMatriz() {
        for (int i = 0; i < largura; i++) {
            for (int j = 0; j < altura; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 7},
                {1, 1, 1, 1, 1, 0, 0, 0, 7, 0},
                {0, 0, 1, 1, 1, 0, 0, 7, 0, 0},
                {0, 0, 0, 1, 1, 0, 7, 0, 0, 0},
                {0, 0, 0, 1, 1, 7, 0, 0, 0, 0},
                {0, 0, 0, 1, 7, 0, 0, 0, 0, 0},
                {0, 0, 0, 7, 1, 0, 0, 0, 0, 0},
                {0, 0, 7, 1, 1, 0, 0, 0, 0, 0},
                {0, 7, 0, 1, 1, 0, 0, 0, 0, 0},
                {7, 0, 0, 1, 1, 0, 0, 0, 0, 0},

        };

        FloodFillPilha floodFillPilha = new FloodFillPilha(matriz);

        System.out.println("Matriz original:");
        floodFillPilha.imprimirMatriz();

        int x = 0;
        int y = 0;
        int novaCor = 2;

        floodFillPilha.floodFill(x, y, novaCor);

        System.out.println("\nMatriz após o flood fill:");
        floodFillPilha.imprimirMatriz();
    }
}
