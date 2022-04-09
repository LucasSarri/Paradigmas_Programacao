import javax.swing.*;

public class Interface {
    public Interface (){} //Método constructor
    
    public double pegaRaio () {
        String valor_lido;
        valor_lido = JOptionPane.showInputDialog("Digite o raio: ");
        double valor = Double.parseDouble(valor_lido);
        return valor;
    }

    public void mostreArea (double area) {
        System.out.println("Area "+area);
    }
}