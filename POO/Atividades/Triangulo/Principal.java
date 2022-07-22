public class Principal {
    public Principal () {}
    public static void main (String[] args) {
        Interface interfaceObj = new Interface ();
        Triangulo trianguloObj = new Triangulo (0.0, 0.0);
        trianguloObj.recebeAltura(interfaceObj.pegaAltura());
        trianguloObj.recebeBase(interfaceObj.pegaBase());
        interfaceObj.mostraArea(trianguloObj.calculaArea());
    }
}