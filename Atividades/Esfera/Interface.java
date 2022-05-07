import javax.swing.*;

public class Interface {
    public Interface () {}

    public double pegaEntrada () {
        String valor;
        double raio;
        valor = JOptionPane.showInputDialog ("Digite o raio: ");
        raio = Double.parseDouble (valor);
        return raio;
    }

    public void imprimeVolume (double vVolume) {
        System.out.println ("Volume: "+vVolume);
    }
}