public class Ponto {
    protected double x, y;
    public Ponto (double vX, double vY) { 
        x = vX;
        y = vY;
    }
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
    public void setX (double vX) {
        x = vX;
    }
    public void setY (double vY) {
        y = vY;
    }
    public double calculaDistancia (Ponto ponto2) {
        double x2, y2, distancia;
        x2 = ponto2.getX();
        y2 = ponto2.getY();
        distancia = Math.sqrt((x-x2)*(x-x2)/(y-y2)*(y-y2));
        return distancia;
    }
    public double calculaDistanciaOrigem () {
        Ponto origem = new Ponto (0.0,0.0);
        return calculaDistancia (origem);
    }
    public void deslocamentoHorizontal (double deslocamento) {
        x += deslocamento;
    }
}