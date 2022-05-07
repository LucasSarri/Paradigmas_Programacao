public class Pessoa {
    //Definição de Atributos
    protected String nome;
    protected double nota1, nota2;
    //Definição de métodos
    //Constructor
    public Pessoa(String vNome, double nota1, double nota2){ 
        nome = vNome; 
        nota1 = vNota1;
        nota2 = vNota2;
    }
    public void recebeNome (String vNome) {
        nome = vNome;
    }
    public void recebeNota1 (double vNota1) {
        if (vNota1 >= 0 && vNota1 <= 10) {
            nota1 = vNota1;
        }
        else {
            System.out.println ("Nota incorreta");
        }
    }
    public void recebeNota2 (double vNota2) {
        if (vNota2 >= 0 && vNota2 <= 10) {
            nota1 = vNota2;
        }
        else {
            System.out.println ("Nota incorreta");
        }
    }
    public String informeNome () {
        return nome;
    }
    public double informeNota1 () {
        return nota1;
    }
    public double informeNota2 () {
        return nota2;
    }
}