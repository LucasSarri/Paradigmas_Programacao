public class Funcionario extends Pessoa {
    protected String matricula;
    protected double gratProd, salBase;
    protected int numDep;

    public Funcionario (String vNome, int vIdade, String vMat, double vSalBase, double vGratProd, int vND) {
        super(vNome,vIdade);
        matricula = vMat;

        if (vSalBase < 0.0) {
            salBase = 0.0;
        }
        else{
            salBase = vSalBase;
        }

        if (vGratProd < 0.0) {
            gratProd = 0.0;
        }
        else{
            gratProd = vGratProd;
        }

        numDep = vND;
    }

    public void recebeMatricula (String vMat) {
        matricula = vMat;
    }

    public String informeMatricula () {
        return matricula;
    }

    public void informeSalBase (double vSalBase) {
        if (vSalBase < 0.0) {
            salBase = 0.0;
        }
        else{
            salBase = vSalBase;
        }
    }

    public double recebeSalBase () {
        return salBase;
    }

    public void recebeGratProd (double vGratProd) {
        if (vGratProd < 0.0) {
            gratProd = 0.0;
        }
        else{
            gratProd = vGratProd;
        }
    }

    public double informeGratProd () {
        return gratProd;
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