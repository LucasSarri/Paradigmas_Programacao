public class Principal {
    public static void main (String[] args) {
        Interface interface_teste;
        Circulo circulo_teste;
        double raio, area;

        circulo_teste = new Circulo();
        interface_teste = new Interface();

        raio = interface_teste.pegaRaio();
        circulo_teste.recebaRaio(raio);
        area = circulo_teste.calculaArea();
        interface_teste.mostreArea(area);
    }
}