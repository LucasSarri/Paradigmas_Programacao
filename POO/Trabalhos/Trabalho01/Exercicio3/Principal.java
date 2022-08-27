public class Principal {
    public static void main (String[]args) {
        Interface int_obj = new Interface ();
        Ponto p1 = int_obj.construaPonto();
        Ponto p2 = int_obj.construaPonto();
        Retangulo ret = new Retangulo(p1,p2);
        int_obj.menu(ret);

    }
}