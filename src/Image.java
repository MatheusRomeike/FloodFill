public class Image {
    public static int[][] image = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    };

    final static String ANSI_RED = "\u001B[31m";
    final static String ANSI_BLACK = "\u001B[30m";
    final static String ANSI_RESET = "\u001B[0m";

    public void printImage() {
        for (int[] line : image) {
            int index = 0;
            System.out.print("[");
            for (int pixel : line) {
                index++;
                String pixelText = index == line.length ? pixel + "" : pixel + ", " ;

                if (pixel == 1)
                    printColored(pixelText, ANSI_BLACK);
                else if (pixel == 2)
                    printColored(pixelText, ANSI_RED);
                else
                    System.out.print(pixelText);
            }
            System.out.println("]");
        }
        System.out.println("------------------------------");
    }

    private void printColored(String pixel, String color) {
        System.out.print(color + pixel + ANSI_RESET);
    }

    public int getLargura() {
        return image[0].length;
    }

    public int getAltura() {
        return image.length;
    }

    public int getFundo() {
        return getAltura();
    }

    public void setPixel(Ponto ponto, int cor) {
        image[ponto.getX()][ponto.getY()] = cor;
        printImage();
    }

    public int getPixel(Ponto ponto) {
        return image[ponto.getX()][ponto.getY()];
    }

}
