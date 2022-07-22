public class Ex01 {
    public static void main (String[] args) {
        Principal p = new Principal();
        System.out.println (p.maior(3.4, 7.0, 5.6));
        System.out.println (p.maior('g','H'));
    }
    public double maior (double a, double b) {
        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }
    public double maior (double a, double b, double c) {
        return this.maior(a, this.maior(b,c));
    }
    public char maior (char x, char y) {
        if(x > y) {
            return x
        }
        else {
            return y;
        }
    }
}