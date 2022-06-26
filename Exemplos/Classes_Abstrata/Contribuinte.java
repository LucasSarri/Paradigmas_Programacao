// Criando classe abstrata Contribuinte
public abstract class Contribuinte {
    protected String nome;
    protected double rendaBrutaAnual;

    public String informeNome() {
        return nome;
    }

    public double informeRendaBrutaAnual() {
        return rendaBrutaAnual;
    }

    public abstract double fornecaImposto() {
    }
}
