import javax.swing.*;

public class Interface {
    public Interfacec(){}
    public Funcionario construaFuncionario () {
        String nome = JOptionPane.showInputDialog("nome ");
        String mat = JOptionPane.showInputDialog("matricula ");
        String salBase = JOptionPane.showInputDialog("salario base ");
        String grat = JOptionPane.showInputDialog("gratificacao ");
        String dependentes = JOptionPane.showInputDialog("dependentes ");
        double salarioBase = Double.parseDouble(salBase);
        double prod = Double.parseDouble(grat);
        int nDep = Integer.parseInt(dependetes);

        String tipoFunc = JOptionPane.showInputDialog("funcionario F, chefe C e apoio A ");
        char tipo = tipoFunc.charAt(0);

        if (tipo == 'A' || tipo == 'a') {
            return new Apoio (nome, mat, salarioBase, prod, nDep);
        }
        else if (tipo == 'C' || tipo == 'c'){
            String gratChefia = JOptionPane.showInputDialog("Gratificacao Chefia ");
            double chefia = Double.parseDouble(gratChefia);
            return new Chefe(nome, mat, salarioBase, prod, nDep, chefia);
        }
        else {
            return new Funcionario (nome, mat, salarioBase, prod, nDep);
        }
    }
    public int pegueQuantidade () {
        String quant = JOptionPane.showInputDialog("Quantidade ");
        return Integer.parseInt(quant);
    }
    public void apresentaDemonstrativo (Funcionario F) {
        System.out.println("Nome "+F.informeNome());
        System.out.println("Matricula "+F.informeMatricula());
        //FornecaSalarioBruto, FornecaSalarioLiquido e fornecaDesconto
        if (F instanceof Chefe) {
            System.out.println("Chefe");
            System.out.println("Grat chefia "+((Chefe)F).informGratChefia());
        }
        else if(F instanceof Apoio){
            System.out.println("Funcionario de apoio");
            System.out.println(((Apoio)F).fornecaAuxilioEducacao());
        }
        else{
            System.out.printl("Funcionario");
        }
    }
}
