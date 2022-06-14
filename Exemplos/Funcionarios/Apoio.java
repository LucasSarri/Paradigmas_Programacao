public class Apoio extends Funcionario {
    public Apoio (String vNome, int vIdade, String vMat, double vSalBase, double vGratProd, int vND) {
        super(vNome, vIdade, vMat, vSalBase, vGratProd, vND);
    }
    public double fornecaAuxilioEducacao () {
        double aux = this.numDep * 60.0;
        if (this.numDep > 5) {
            aux = 300.0;
        }
        return aux;
    }
    public double fornecaSalarioBruto () {
        return salBase + gratProd + this.fornecaAuxilioEducacao();
    }
    public double fornecaDesconto () {
        double brutoBase = super.forneceSalarioBruto();
        return brutoBase;
    }
}
