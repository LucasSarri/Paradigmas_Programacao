import geometria.*;
import geometria.figuras.*;

public class Principal {
    public static void main (String [] p) {
        Circulo c1, c2, c3;
        c1 = new Circulo(3.0);
        c2 = new Circulo(2.0);
        c3 = c2;

        int quant = c1.informeInstancias();
        c2.recebaRaio(1.6);
    }
}
