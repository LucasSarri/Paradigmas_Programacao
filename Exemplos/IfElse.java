public class IfElse {
    public static void main (String[] args) {
        Interface i = new Interface ();
        Pessoa p = new Pessoa ();
        double soma = 0.0, soma_masc = 0.0, soma_fem = 0.0, media = 0.0;
        int cont = 0, cont_masc = 0, cont_fem = 0;
        char sexo;
        int quantidade = i.pegaQuantidadePessoa ();
        do {
            p = i.pegaPessoa ();
            soma += p.informeIdade();
            sexo = p.informeSexo();
            if(sexo = 'M' || sexo = 'm') {
                cont_masc++;
                soma_masc += p.informeIdade();
            }
            else {
                cont_fem++;
                soma_fem += p.informeIdade();
            }
            cont++;
        } while (cont < quantidade);
        media = soma/cont;
    }
}