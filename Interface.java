import javax.swing.*;

public class Interface {
    public Interface (){}
    
    public double pegaValorRaio () {
        String valor_lido;
        valor_lido = JOptionPane.showInputDialog("Digite o raio: ");
        double valor = Double.parseDouble(valor_lido);
        return valor;
    }
}