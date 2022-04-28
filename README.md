## Como rodar programa
1. javac nome_programa.java \\ Quando roda cria o arquivo nome_programa.class
2. java nome_programa \\ Executa a classe
* OBS: todos arquivos referentes a um programa devem estar na mesma pasta, deve-se compilar todas as classes e executar somente a classe com método main
---
## Criação de Classes e Arquivos
O nome do arquivo deve ser o mesmo da classe, considerando que os nomes devem iniciar com uma letra maiúscula e se tiver mais de uma palavra utilizar a notação CamelCase.
---
## Expressões Lógicas
Elas realizam a comparação entre valores e variáveis retornando um valor booleano (verdadeiro ou falso), para se criar uma operação lógica usamos os seguintes operadores:
### Operadores relacionais
* Maior >
* Maior igual >=
* Menor <
* Menor igual <=
* Igual ==
* Diferente !=
### Operadores Lógicos
* E (and) &&: retorna verdadeiro caso os dois operandos forem verdadeiros
* Ou (or) ||: retorna verdadeiro caso um dos operandos forem verdadeiros
* Não (not) !: inverte o valor do operando
---
## Métodos
1. Estrutura:
    > public tipo_retorno nome_metodo (parametros...) {
    >
    >   //Código
    >
    >   return retorno;
    >
    > }
2. Parâmetros: métodos de uma determinada classe podem necessitar de elementos de outra classe ou valores externos para executar suas funções, portanto esse método recebe como parâmetro os valores que necessitar.
3. Retorno: o retono se trata de um valor resultante do processamento de todo o código do método, todo método deve apresentar um valor de retorno (int, double, void e etc), exceto o método constructor.
---
## Serviços
Para se solicitar um serviço deve-se importar a classe e chamar seus métodos no código, sendo assim são passados valores como argumento durante a solicitação do serviço que devem ser na mesma quantidade, tipo e ordem dos parâmetros no método em si. Exemplo:
    >
    >   ponto.setXY(5.0,6.0)
    >
Neste exemplo foi utilizado o método setXY da classe ponto, onde são passados 5 e 6 como argumentos, onde o 5 representa o x e o 6 o y por causa da ordem definida na declaração da classe.