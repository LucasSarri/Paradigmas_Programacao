public class Retangulo {
    protected Ponto ponto1, ponto2, ponto3, ponto4;

    public Retangulo (Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        ponto1 = p1;
        ponto2 = p2;
        ponto3 = p3;
        ponto4 = p4;
    }

    public void recebaRetangulo (Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        ponto1 = p1;
        ponto2 = p2;
        ponto3 = p3;
        ponto4 = p4;
    }

    public int informePerimetro () {
        int base, altura, perimetro;

        base = p3.calculaDistancia(p2);
        altura = p1.calculaDistancia(p3);
        perimetro = 2 * (base + altura);

        return perimetro;
    }

    public int informeArea () {
        int base, altura, area;

        base = p3.calculaDistancia(p2);
        altura = p1.calculaDistancia(p3);
        area = base * altura;

        return area;
    }

    public double informeDiagonal () {
        int base, altura, diagonal;

        base = p3.calculaDistancia(p2);
        altura = p1.calculaDistancia(p3);
        diagonal = (altura * altura) + (base*base);

        return Math.sqrt(diagonal);
    }

    public boolean informeLadosIguais () {
        int a,b,c,d;

        a = p1.calculaDistancia(p4);
        b = p1.calculaDistancia(p3);
        c = p3.calculaDistancia(p2);
        d = p4.calculaDistancia(p2);

        if ((a == b) && (c == d) && (a == c)) {
            return true;
        }
        else {
            return false;
        }
    }
}