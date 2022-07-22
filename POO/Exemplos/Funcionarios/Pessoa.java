public class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa (String vNome, int vIdade) { 
        nome = vNome; 
        idade = vIdade;
    }

    public Pessoa() {}

    public void recebeNome (String vNome) {
        nome = vNome;
    }
    
    public String informeNome () {
        return nome;
    }

    public void recebeIdade (int vIdade) {
        idade = vIdade;
    }

    public int informeIdade () {
        return idade;
    }
}