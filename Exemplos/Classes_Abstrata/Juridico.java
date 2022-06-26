import javax.lang.model.element.VariableElement;

public class Juridico extends Contribuinte{
    protected String cnpj;
    protected double gastosPessoal, gastosEqui;

    public Juridico (String vNome, float vRBAnual, String vCNPJ, double vGP, double vGE) {
        nome = vNome;

        if (vRBAnual < 0) {
            rendaBrutaAnual = 0.0;
        }
        else {
            rendaBrutaAnual = vRBAnual;
        }

        cnpj = vCNPJ;

        if (vGP < 0){
            gastosPessoal = 0;
        }
        else {
            gastosPessoal = vGP;
        }

        if (vGE < 0) {
            gastosEqui = 0;
        }
        else {
            gastosEqui = vGE;
        }
    }
}
