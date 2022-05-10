public class Triangulo {
    protected double base, altura, area;
    public Triangulo (double vBase, double vAltura) {
        base = vBase;
        altura = vAltura;
    }
    public void recebeBase (double vBase) {
        if (vBase >= 1) {
            base = vBase;
        }
        else {
            System.out.println ("Valor incorreto");
        }
    }
    public void recebeAltura (double vAltura) {
        if (vAltura >= 1) {
            altura = vAltura;
        }
        else {
            System.out.println ("Valor incorreto");
        }
    }
    public double informeBase () {
        return base;
    }
    public double informeAltura () {
        return altura;
    }
    public double calculaArea () {
        area = (base*altura)/2;
        return area;
    }
}