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
        System.out.print("------------------------------");
    }

}
