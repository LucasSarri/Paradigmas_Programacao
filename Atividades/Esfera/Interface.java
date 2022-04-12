import javax.swing.*;

public class Interface {
    public Interface () {}

    public double pegaRaio () {
        String valor;
        double raio;
        valor = JOptionPane.showInputDialog ("Digite o raio: ");
        raio = Double.parseDouble (valor);
        return raio;
    }

    public void mostraVolume (double vVolume) {
        System.out.println ("Volume: "+vVolume);
    }
}