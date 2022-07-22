package geometria;

public class Circulo {
    protected double raio;
    protected static int qtdInstancias = 0;
    protected static int numAlteracoes = 0;

    public Circulo (double vRaio) {
        if (vRaio >= 0) {
            raio = vRaio;
        }
        else {
            raio = 0.0;
        }
        qtdInstancias ++;
    }

    public void recebaRaio (double vRaio) {
        if (vRaio >= 0) {
            raio = vRaio;
        }
        else {
            raio = 0.0;
        } 
        numAlteracoes ++;
    }

    public int informeInstancias () {
        return qtdInstancias;
    }

    public double forneceArea () {
        return 3.14*raio*raio;
    }
}
