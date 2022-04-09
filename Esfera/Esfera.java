public class Esfera {
    public double raio;
    
    public Esfera () {
        raio = 0.0;
    }

    public double calculaVolume () {
        double volume;
        volume = (4 * 3.14 * raio * raio * raio)/3;
        return volume;
    }

    public void  recebeRaio (double vRaio) {
        raio = vRaio;
    }
}