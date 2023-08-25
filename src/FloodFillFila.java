public class FloodFillFila {
    private Image imagem;

    public FloodFillFila(Image imagem) {
        this.imagem = imagem;
    }

    public void Inicializar() {
        int tamanhoFila = (imagem.getLargura() * imagem.getAltura() - imagem.getFundo()) / 2;
        Fila<Ponto> fila = new Fila<Ponto>(tamanhoFila);
        Ponto pontoInicial = obterPonto();
        fila.add(pontoInicial);
        imagem.setPixel(pontoInicial, 2);

        while (!fila.isEmpty()) {
            Ponto ponto = fila.remove();
            procurarPontos(ponto, fila);
        }
        System.out.println("Imagem preenchida com sucesso.");
    }

    private void procurarPontos(Ponto pontoInicial, Fila<Ponto> fila) {
        int x = pontoInicial.getX();
        int y = pontoInicial.getY();

        int[] horizontal = { 0, 0, 1, -1 };
        int[] vertical = { 1, -1, 0, 0 };

        for (int i = 0; i < horizontal.length; i++) {
            Ponto ponto = new Ponto(x + horizontal[i], y + vertical[i]);
            if (podePintar(ponto)) {
                fila.add(ponto);
                imagem.setPixel(ponto, 2);
                sleep(250);
            }
        }
    }

    private void sleep(int ms) {
        try {
            Thread.sleep(ms);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private boolean podePintar(Ponto ponto) {
        int x = ponto.getX();
        int y = ponto.getY();

        if (x >= 0 && x < imagem.getLargura() && y >= 0 && y < imagem.getAltura()) {
            int valorPixel = imagem.getPixel(new Ponto(x, y));

            return valorPixel == 0;
        }
        return false;
    }

    private Ponto obterPonto() {
        imagem.printImage();
        Ponto ponto = new Ponto(0, 0);
        ponto.ScannearPonto();
        while (ponto.getX() >= imagem.getLargura() - 1 || ponto.getX() < 0 || ponto.getY() >= imagem.getAltura() - 1 || ponto.getY() < 0 || imagem.getPixel(ponto) == 1) {
            System.out.println("Informe pontos válidos.");
            ponto.ScannearPonto();
        }
        return ponto;
    }
}
