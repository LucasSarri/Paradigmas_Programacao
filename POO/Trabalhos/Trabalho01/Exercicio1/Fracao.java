public class Fracao {
    protected int numerador, denominador;
    protected boolean status;

    public Fracao (int valorNum, int valorDen) {
        numerador = valorNum;
        denominador = valorDen;

        if (denominador == 0) {
            status = false;
        }
        else {
            status = true;
        }
    }

    public void recebaDenominador (int valorDen) {
        denominador = valorDen;

        if (denominador == 0) {
            status = false;
        }
        else {
            status = true;
        }
    }

    public void recebeNumerador (int valorNum) {
        numerador = valorNum;
    }

    public int informeDenominador () {
        return denominador;
    }

    public int informeNumerador () {
        return numerador;
    }

    public Fracao forneceSomaCom (Fracao outra) {
        int den, num;
        Fracao soma;

        if (this.denominador != outra.denominador) {
            den = this.calculaMMC(this.denominador, outra.denominador);
            n = ((den / this.denominador)*this.numerador) + ((den / outra.denominador)*outra.numerador);
            //Implementar simplificação
            return soma = new Fracao (n,d);
        }
        else {
            num = this.numerador + outra.numerador;
            den = this.denominador;
            return soma = new Fracao (n,d);
        }
    }

    public int calculaMMC (int d1, int d2) {
        return d1 * (d2 / mdc(d1,d2));
    }

    public int calculaMDC (int d1, int d2) {
        while (b != 0) {
            int r = d1 % d2;
            d1 = d2;
            d2 = r;
        }
        return d1;
    }
}