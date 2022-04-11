## Como rodar programa
1. javac nome_programa.java \\ Quando roda cria o arquivo nome_programa.class
2. java nome_programa \\ Executa a classe
* OBS: todos arquivos referentes a um programa devem estar na mesma pasta, deve-se compilar todas as classes e executar somente a classe com método main
---
## Métodos
1. Estrutura:

    public tipo_retorno nome_metodo (parametros...) {
        //Código
        return retorno;
    }

2. Parâmetros: métodos podem ou não ter parâmetros para entrada no método, que serão valores utilizados durante o processamento do método.
3. Retorno: todo método deve apresentar um valor de retorno (int, double, void e etc), exceto o método constructor. Os métodos que retornam valores podem ser colocados no interior de outras instruções
---
## Escopo
O escopo de um elemento em Java determina a parte do código que é possível utilizar tal elemento, o mesmo é determinado a partir da declaração do elemento.
Em uma classe temos os atributos que podem ser vistos e utilizados por qualquer método da classe, podendo ser declarados em qualquer parte do código, já os valores passados como parâmetros estão apenas visíveis para o método em questão.