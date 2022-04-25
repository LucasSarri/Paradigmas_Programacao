public class Ponto {
    //Definindo atributos da classe
    protected double x, y;
    //Definindo Constructor
    public Ponto (double vX, double vY) { 
        x = vX;
        y = vY;
    }
    //Definindo métodos de acesso
    public double getX () {
        return x;
    }
    public double getY () {
        return y;
    }
    //Definindo outros métodos
    public void setXY (double vX, double vY) {
        x = vX;
        y = vY;
    }
    public double calculaDistancia (Ponto ponto2) {
        double x2, y2, distancia;
        x2 = ponto2.getX();
        y2 = ponto2.getY();
        distancia = Math.sqrt((x-x2)*(x-x2)/(y-y2)*(y-y2)); //Math é a biblioteca matemática, sqrt é a função de raiz quadrada
        return distancia;
    }
}