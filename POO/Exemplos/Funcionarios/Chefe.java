public class Chefe extends Funcionario {
    protected double gratChefia;
    
    public Chefe (String vNome, int vIdade, String vMat, double vSalBase, double vGratChefia, int vND) {
        super(vNome, vIdade, vMat, vSalBase, vGratChefia, vND);
        if(vGratChefia < 0) {
            gratChefia = 0;
        }
        else {
            gratChefia = vGratChefia;
        }
    }

    public double informGratChefia () {
        return gratChefia;
    }

    public void recebaGratChefia (double valor) {
        if(valor < 0) {
            gratChefia = 0;
        }
        else {
            gratChefia = valor;
        }
    }
}