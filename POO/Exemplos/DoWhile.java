public class DoWhile {
    public static void main (String[] args) {
        Interface interfaceObj = new Interface ();
        Pessoa pessoaObj = new Pessoa ();
        int quantidade = interfaceObj.pegaQuantidadePessoas();
        int soma = 0, cont = 0;
        do {
            pessoaObj = interfaceObj.pegaPessoa();
            soma += pessoaObj.informeIdade();
            cont ++;
        }while (cont < quantidade);
        double media = soma/cont;
        interfaceObj.mostraMedia(media);
    }
}