public class Principal {
    public static void main (String[] args) {
        Ponto pa = new Ponto(0.0,0.0);
        Ponto pb = null;
        Ponto pc = new Ponto(5.0,6.0);

        pa.setXY(8.0, 9.0);
        double distancia = pa.calculaDistancia(pc);
        System.out.println(distancia);
    }
}
