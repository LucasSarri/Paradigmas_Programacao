public class Circulo {    
    protected double raio;
    
    //Método Constructor
    public Circulo () {
        raio = 0.0;
    }

    public double calculaArea () {
        double area;
        area = 3.14 * raio * raio;
        return area;
    }

    public void recebaRaio (double vRaio) {
        raio = vRaio;
    }
}