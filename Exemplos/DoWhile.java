public class DoWhile {
    public static void main (String[] args) {
        Interface i = new Interface ();
        Pessoa p = new Pessoa ();
        int quantidade = i.pegaQuantidadePessoas();
        int soma = 0, cont = 0;
        do {
            p = i.pegaPessoa();
            soma += p.informeIdade();
            cont ++;
        }while (cont < quantidade);
        double media = soma/cont;
        i.mostraMedia(media);
    }
}