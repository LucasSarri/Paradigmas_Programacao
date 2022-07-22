public class Ip {
    protected int n;

    public Ip (int vN) {
        if (vN > 0) {
            n = vN;
        }
        else {
            n = 0;
        }
    }

    public int informeN () {
       return n;
    }

    public void recebeValorN (int vN) {
        if (vN > 0) {
            n = vN;
        }
        else {
            n = 0;
        }
    }

    public boolean ehPar () {
        if (n % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public int forneceSomaDivisores () {
        int soma = 0, aux;
        aux = n;

        while (aux > 0) {
            if (n % aux == 0) {
                soma += aux;
            }
            aux--;
        }

        return soma;
    }

    public int forneceFatorial () {
        int fatorial, aux;
        fatorial = 1;
        aux = n;

        while (aux > 0) {
            fatorial *= aux;
        }

        return fatorial;
    }
}