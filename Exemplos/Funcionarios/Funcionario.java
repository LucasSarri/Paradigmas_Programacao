public class Funcionario extends Pessoa {
    protected String matricula;
    protected double gratProd, salBase;
    protected int nd;

    public Funcionario (String vNome, String vMat, double vSalBase, double vGratProd, int vND) {
        super(vNome,'*',0);
        matricula = vMat;
        if (vSalBase < 0) {
            salBase = 0.0;
        }
        else{
            salBase = vSalBase;
        }
    }

    public String informeMatricula () {
        return matricula;
    }

    public double forneceSalarioBruto () {
        return salBase + gratProd;
    }

    public double fornecaDesconto () {
        double bruto = this.forneceSalarioBruto();
        if (bruto <= 1000) {
            return 0.0;
        }
        else if (bruto <= 1800) {
            return bruto * 0.1 - 100;
        }
        else {
            return bruto * 0.25 - 370;
        }
    }

    public double fornecaSalarioLiquido () {
        return this.forneceSalarioBruto() - this.fornecaDesconto();
    }
}