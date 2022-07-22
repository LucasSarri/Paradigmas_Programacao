## Como rodar programa
1. javac nome_programa.java \\ Quando roda cria o arquivo nome_programa.class
2. java nome_programa \\ Executa a classe
* OBS: todos arquivos referentes a um programa devem estar na mesma pasta, deve-se compilar todas as classes e executar somente a classe com método main.
---
## Criação de Classes e Arquivos
O nome do arquivo deve ser o mesmo da classe, considerando que os nomes devem iniciar com uma letra maiúscula e se tiver mais de uma palavra utilizar a notação CamelCase. Declaração:

encapsulamento class NomeClasse {
    //Declaração de atibutos
    public int numero;
    ...
    //Declaração de Construtor
    public NomeClasse (argumentos) {
        // Comandos
    }
    //Declaração de métodos
    public int metodoQualquer (argumentos) {
        //Comandos
        return algumaCoisa;
    }
}

Instanciação:

NomeClasse objetoClasse = new NomeClasse (argumentos do construtor);
---
## Encapsulamento
Omissão de certas características de uma classe como métodos ou atributos, apresentando ao usuário somente características relevantes para o funcionamento do programa.
Para se aplicar o conceito de encapsulamento podemos usar os modificadores de acesso que podem ser aplicados a métodos, atributos e classes, alterando assim sua visibilidade.
* Private: permite o acesso apenas dentro da própria classe, objetos derivados dessa classe podem acessar diretamente os atributos.
* Protected: permite o acesso dentro da classe, de subclasses especializadas e dentro do pacote, classes especializadas herdam características com o modificador protected.
* Public: permite o acesso das características da classe a todo o programa.
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
## Processo de Repetição
Quando é necessário repetir o mesmo trecho de código podemos utilizar estruturas de repetição.
### Comandos de repetição
* Do-While: executa os comandos dentro do bloco pelo menos duas vezes e segue executando os mesmos 
caso uma determinada condição for verdadeira.
>
>   do {
>       //Codigo
>   } while(condicao)
>
* While: para se executar os comandos dentro do bloco ele primeiro confere se a condição for verdadeira, caso for ele executa os comandos enquanto a mesma for verdadeira, caso for falsa ele nem executa.
>
>   while (condicao) { 
>       //Codigo
>   }
>
* For: executa a repetição do bloco de códigos de acordo com 3 expressões internas.
>
>   for (expressao1;expressao2;expressao3) {
>       //Codigos
>   }
>
A primeira expressão trata-se da inicialização da variável de controle, já a segunda é a expressão lógica que determina a finalização da repetição e a terceira é responsável por alterar o valor da váriavel de controle.
* Break: este comando interrompe o comando atual e passa para o próximo, pode ser usado em estruturas condicionais ou de repetição.
---
## Processo de Seleção
Quando é necessário disponibilizar mais de uma opção para a execução do programa podemos utilizar estruturas condicionais.
### Comandos condicionais
* IF-ELSE: basicamente define uma ação para ser feita caso uma condição seja verdadeira e uma
para caso a condição seja falsa.
>
>   if (condicao) {
>       //Código para caso condição ser verdadeira
>   }
>   else {
>       //Código para caso condição ser falsa
>   }
>
* Switch: determina várias possíbilidades de acordo com os possíveis valores de uma variável.
>
>   switch (expressao) {
>       case valor1:
>           //Codico1;
>       break;
>       ...
>       default:
>           //Comando para casos gerais;
>       break;
>   }
>           
---
## Métodos
1. Estrutura:
    >   public tipo_retorno nome_metodo (parametros...) {
    >
    >       //Código
    >
    >       return retorno;
    >
    >   }
2. Parâmetros: métodos de uma determinada classe podem necessitar de elementos de outra classe ou valores externos para executar suas funções, portanto esse método recebe como parâmetro os valores que necessitar.
3. Retorno: o retono se trata de um valor resultante do processamento de todo o código do método, todo método deve apresentar um valor de retorno (int, double, void e etc), exceto o método constructor.
---
## Serviços
Para se solicitar um serviço deve-se importar a classe e chamar seus métodos no código, sendo assim são passados valores como argumento durante a solicitação do serviço que devem ser na mesma quantidade, tipo e ordem dos parâmetros no método em si. Exemplo:
    >
    >   ponto.setXY(5.0,6.0)
    >
Neste exemplo foi utilizado o método setXY da classe ponto, onde são passados 5 e 6 como argumentos, onde o 5 representa o x e o 6 o y por causa da ordem definida na declaração da classe.
---
## Palavra-chave Super
O comando super ativa o construtor da superclasse (classe ancestral) dentro da subclasse.
Em Java, todo construtor deve ter o método construtor da superclasse usando super, caso não tiver essa chamada o Java executa o construtor padrão. Existe 2 maneiras de usar o comando:
super();
super(parâmetros);
Exemplos:
Construtor(int vA) {
    a = vA;
}
Construtor () {}
---
## Mecanismo de Herança
Possibilita a especialização, característica de POO pois possibilita a reutilização de código.
Exemplo: Aluno (subclasse) é um tipo de Pessoa (superclasse), a classe Aluno herda as características de Pessoa, portanto não precisa reescrever o código de Pessoa, apenas as características específicas da classe Aluno