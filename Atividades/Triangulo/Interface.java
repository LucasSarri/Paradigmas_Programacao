import javax.swing.*;

public class Interface {
    public Interface () {}
    public double pegaAltura () {
        String valor;
        double altura;
        valor = JOptionPane.showInputDialog("Informe a altura ");
        altura = Double.parseDouble(valor);
        return altura;
    }
    public double pegaBase () {
        String valor;
        double base;
        valor = JOptionPane.showInputDialog("Informe a base ");
        base = Double.parseDouble(valor);
        return base;
    }
    public void mostraArea (double vArea) {
        System.out.println ("Area = "+vArea);
    }
}