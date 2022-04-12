public class Ponto {
    //Definindo atributos da classe
    protected double x, y;
    //Definindo Constructor
    public Ponto (double vX, double vY) { 
        x = vX;
        y = vY;
    }
    //Definindo métodos
    public double getX () {
        return x;
    }
    public double getY () {
        return y;
    }
    public void setXY (double vX, double vY) {
        x = vX;
        y = vY;
    }
}