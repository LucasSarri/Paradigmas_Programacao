public class Fisico extends Contribuinte {
    protected String cpf;
    protected int numDep;
    protected double gastosSaude, gastosEduca;

    public Fisico (String vNome, float vRBAnual, String vCPF, int vNumDep, double vGS, double vGE){
        nome = vNome;

        if (vRBAnual < 0) {
            rendaBrutaAnual = 0.0;
        }
        else {
            rendaBrutaAnual = vRBAnual;
        }

        cpf = vCPF;

        if (vNumDep < 0) {
            numDep = 0;
        }
        else {
            numDep = vNumDep;
        }

        if (vGS < 0) {
            gastosSaude = 0;
        }
        else {
            gastosSaude = vGS;
        }

        if (vGE < 0) {
            gastosEduca = 0;
        }
        else {
            gastosEduca = vGE;
        }
    }
}