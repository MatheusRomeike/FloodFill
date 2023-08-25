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

    public void printImage() {
        for (int[] line : image) {
            int index = 0;
            System.out.print("[");
            for (int pixel : line) {
                index++;
                if (index == line.length)
                    System.out.print(pixel);
                else
                    System.out.print(pixel + ", ");
            }
            System.out.println("]");
        }
        System.out.println("------------------------------");
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
