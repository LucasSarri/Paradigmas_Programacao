public class While {
    public static void main (String[] args) {
        Interface i = new Interface ();
        int n = i.pegaNaoNegativo ();
        int fat = 1;
        int cont = 0;
        while (cont < n) {
            cont ++;
            fat *= cont;
        }
        i.mostraResultado(fat);
    }
}