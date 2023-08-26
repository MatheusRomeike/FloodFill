import java.util.Scanner;

public class Ponto {
    private int x;
    private int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    private void ScannearX() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o ponto x: ");
        this.x = scanner.nextInt();
    }

    private void ScannearY() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o ponto y: ");
        this.y = scanner.nextInt();
    }

    public void ScannearPonto() {
        ScannearX();
        ScannearY();
    }
}
