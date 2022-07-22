package geometria.figuras;

public class FiguraPlana {
    protected String cor;

    public FiguraPlana (String vCor) {
        cor = vCor;
    }

    public String informeCor () {
        return cor;
    }

    public static double areaCirculo (double vRaio) {
        return 3.14*vRaio*vRaio;
    }

    public static double areaTriangulo (double vBase, double vAltura) {
        return vBase*vAltura;
    }

    public static void imprimeFigura () {
        System.out.println("Funcoes da figura");
    }
}