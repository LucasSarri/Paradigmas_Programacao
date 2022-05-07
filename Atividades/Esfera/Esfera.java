public class Esfera {
    protected double raio;
    //Método sem inicialização explícita
    public Esfera () {}
    //Método modificador
    public void  recebeRaio (double vRaio) {
        raio = vRaio;
    }
    //Método de consulta
    public double informeRaio () {
        return raio;
    }
    //Método que calcula volume
    public double calculaVolume () {
        double volume;
        volume = (4 * 3.14 * raio * raio * raio)/3;
        return volume;
    }
}