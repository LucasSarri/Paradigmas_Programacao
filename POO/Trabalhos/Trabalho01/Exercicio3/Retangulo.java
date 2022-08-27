public class Retangulo {
    private Ponto p1;
    private Ponto p2;

    public Retangulo (Ponto ponto1, Ponto ponto2) {
        p1 = ponto1;
        p2 = ponto2;
    }
    public Retangulo () {
        p1 = new Ponto (0,0);
        p2 = new Ponto (0, 0);
    } 
    public void criarRetangulo (Ponto ponto1, Ponto ponto2) {
        p1 = ponto1;
        p2 = ponto2;
    }
    public double calculaPerimetro () {
        double base = p2.x - p1.x;
        double altura = p1.y - p2.y;
        return 2*base + 2*altura;
    }
    public double calculaArea () {
        double base = p2.x - p1.x;
        double altura = p1.y - p2.y;
        return base*altura;
    }
    public double calculaDiagonal () {
        double base = p2.x - p1.x;
        double altura = p1.y - p2.y;
        double soma = base*base + altura*altura;
        return Math.sqrt(soma);
    }
    public boolean pontoDentro (Ponto p3) {
        boolean dentro = false;
        if (p3.y <= p2.y && p3.y >= p1.y) {
            if (p3.x >= p1.x && p3.x <= p2.x) {
                dentro = true;
            }
        }
        return dentro;
    }
    public boolean ladosIguais () {
        double base = p2.x - p1.x;
        double altura = p1.y - p2.y;
        boolean iguais = false;
        if (base == altura) {
            iguais = true;
        }
        return iguais;
    }
}