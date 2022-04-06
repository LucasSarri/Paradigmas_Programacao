public class Circulo {    
    protected double raio;
    
    public Circulo () {
        raio = 0.0;
    }

    public double fornece_area() {
        double area;
        area = 3.14 * raio * raio;
        return area;
    }

    public void receba_area(double vRaio) {
        raio = vRaio;
    }
}