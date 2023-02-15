# Transcrição

Transcrição
A partir deste ponto o curso se tornará mais simples, pois a base da linguagem e seus conceitos nós já aprendemos; falamos sobre orientação básica, polimorfismo, exceções e pacotes. O que veremos será mais específico, como funcionalidades de algumas classes, ou seja, quais classes e pacotes o Java irá nos oferecer.

Para entendermos melhor como instrumentalizar algumas classes, começaremos a analisar a documentação Java. Digamos que seja necessário passar nosso projeto atual para outra equipe, para que essa transferência 
de projeto se dê da melhor forma precisamos nos preocupar com a documentação 
do código, o mínimo para ajudar os outros desenvolvedores. Precisamos, ainda, 
pensar em um modo de repassar todas as classes do projeto para a outra equipe 
da maneira mais simples o possível.

No caso da documentação, o Java oferece um recurso específico.
Essa seria um preview da documentação oficial do Java. A ideia é que a partir dos 
comentários elaborados, possamos criar um documento separado. Para isso, no cabeçalho 
do Eclipse, clicaremos em **"Project -> Generate Javadoc"**.

Na caixa de diálogo, selecionaremos o projeto desejado, neste caso, bytebank-herdado-conta. 
É importante dizer que esta ferramenta de Javadoc vem junto com o JDK, portanto é crucial 
te-lo instalado. Salvaremos o projeto na pasta padrão.

Ao darmos o "Ok", serão percorridas todas as classes e será criada uma página HTML que 
contém todas as informações do projeto. Foi criada uma pasta doc, e vários arquivos a 
partir dessa varredura de classes, mas o que nos interessa neste momento é o index

Veremos, justamente, o índice da documentação com todos os pacotes, são eles 
br.com.bybank.banco.especial, br.com.bybank.banco.modelo e br.com.bybank.banco.test.
Ao selecionarmos um deles, no caso br.com.bybank.banco.modelo, teremos acesso ao 
sumário do pacote com todas as interfaces, classes e exceções e os comentários realizados.

No sumário de classes, podemos selecionar alguma classe específica para obtermos mais 
informações. Selecionaremos a classe Cliente.

Veremos o comentário que elaboramos (Classe que representa um cliente no Bytebank), a 
versão e o autor. Também veremos seus construtores, e seus métodos públicos.

Voltaremos nossa atenção para a classe Conta.

Percebam que são exibidas diversas informações, inclusive suas classes filhas, que são 
ContaCorrente, ContaEspecial e ContaPoupanca.

São exibidas ainda as mesmas informações que vimos na classe Cliente, como construtores e métodos.

Notem que estamos lidando com uma documentação bem profissional, de desenvolvedor para 
desenvolvedor, e não para um usuário final que está fazendo uso da aplicação.

O primeiro passo para repassar um projeto é justamente gerar essa documentação. O Java 
iniciou a proposta de incluir a documentação dentro do código, como vimos nos comentários 
especiais. Se você realiza alguma modificação, as atualizações na documentação podem ser 
realizadas facilmente.


SOBRE JAR>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
Nos falta pensar em como podemos passar todas as classes para a outra equipe de desenvolvedores 
de forma inteligente.

Seguindo de onde paramos anteriormente, nosso próximo objetivo é repassar todas as classes para uma nova equipe.

Em um primeiro momento nos parece que basta acionar o atalho "Ctrl + C" e "Ctrl + V" em todas as 
classes compiladas e trabalho concluído. No entanto, essa não é a forma mais inteligente de distribuir o meu código.

A ideia é que passemos para o desenvolvedor o código compilado dentro de um arquivo ".zip", e a 
documentação, afinal, ele não necessariamente precisa do código fonte, que é de nossa responsabilidade.

No entanto, o Java não chama esse tipo de arquivo de código compilado de ".zip", o tipo do arquivo 
na verdade é "JAR".

Poderíamos criar esse arquivo ".jar" manualmente, manipulando todo o conteúdo através do visualizador 
"Navigator". Porém, o Eclipse nos fornece facilidades para esse tipo de ação.

Na área "Package Explorer", selecionaremos nosso projeto bytebank-herdado-conta, clicaremos com o botão 
direito do mouse e selecionaremos a opção "Export".

Na caixa de diálogo que será aberta, veremos que há vários modos de exportar nosso projeto. Como 
queremos apenas o código compilado, selecionaremos a opção "JAR file" e em seguida "next" para avançarmos 
na exportação.

exportando projeto
Na nova caixa de diálogo, selecionaremos as pastas que serão exportadas. Não exportaremos os arquivos 
internos do Eclipse (.classpath e .project), e sim, todo o conteúdo da pasta src. Lembrando que não 
estamos exportando o código fonte, apenas o código compilado, que o Eclipse denomina "class files". 
Exportaremos o código para o desktop com o nome de bytebank-1.0.jar.

exportando código compilado
Temos o arquivo JAR, que atua basicamente como um ".zip", mas em uma extensão diferente. Ao extrairmos 
os arquivos, veremos que todas as classes estarão presentes dentro da estrutura de pacotes.

Neste ponto do curso, já sabemos como exportar nosso projeto de forma inteligente e organizada. Como 
próximo passo, analisaremos o processo do ponto de vista da equipe que recebe o projeto.

No Eclipse, fecharemos todas classes que estão abertas através do atalho "Ctrl + Shift + W". Criaremos 
um novo projeto que chamaremos de bytebank-biblioteca. Para que não haja nenhuma confusão, fecharemos 
todos os outros projetos.

Clicaremos com o botão direito sobre bytebank-biblioteca e selecionaremos a opção "Close Unrelated Projects".

Normalmente, criamos uma pasta que armazenará todas as bibliotecas a serem utilizadas. Não existe um 
nome de pasta padrão, mas é muito comum utilizarmos o nome libs, que remete ao termo em inglês library. 
Nesta pasta arrastaremos nosso arquivo bytebank-1.0.jar.

O arquivo já faz parte do nosso projeto. O próximo passo é criar uma nova classe que chamaremos de 
TesteBiblioteca, que estará inserida em um novo pacote que nomearemos como br.com.alura.bytebank.

Observemos o código da nossa classe:

```java
package br.com.alura.bytebank

public class TesteBiblioteca { 

    public static void main(String[] args) { 

    }

}
```
Queremos utilizar a classe Conta.

```java
package br.com.alura.bytebank

public class TesteBiblioteca { 

    public static void main(String[] args) { 

        Conta c = new ContaCorrente(123, 321);

    }

}
```
Percebam que utilizamos os nomes simples das classes, o que gera erros na compilação do código. 
Precisamos utilizar o full qualified name neste caso, portanto, precisamos importar estas classes.

O Eclipse, nestes casos, sugere uma importação das classes. No entanto, essa opção não é mostrada, 
a sugestão é que se cria uma classe Conta, muito embora essa classe já exista dentro do arquivo bytebank-1.0.jar.

O que precisamos realizar é uma comunicação do Eclipse com os arquivos do projeto. Para isso existe 
uma configuração que ainda não realizamos, simplesmente copiamos o arquivo ".jar" para a ferramenta 
e isso não é o suficiente para que as classes se tornem visíveis e usuais.

Para realizarmos essa configuração, selecionamos o arquivo bytebank-1.0.jar na área do Package Explorer 
e pressionamos o botão direito do mouse, e selecionamos as opções "Build Path > Add to Build Path".

Assim feito, veremos que uma representação gráfica de jarra surge ao lado do nome do arquivo, apontado 
como Referenced Libraries, e dentro dele são exibidas todas os pacotes, que por sua vez, armazenam as classes.

arquivo .jar no projeto

Com isso, voltando ao código de TesteBiblioteca o Eclipse sugere a importação das classes Conta e 
ContaCorrente, afinal, elas estão acessíveis.

Faremos um pequeno teste para avaliar se o nosso código está de fato funcional, acionando o método deposita().

```java
package br.com.alura.bytebank

public class TesteBiblioteca { 

    public static void main(String[] args) { 

        Conta c = new ContaCorrente(123, 321);

        c.deposita(200.3);

        System.out.println(c.getSaldo());

    }

}
```
Tudo opera como o esperado.

Nesta aula aprendemos duas ações: primeiramente como criar a documentação dentro do código fonte 
e gerar os HTMLs organizados, depois, aprendemos como criar uma biblioteca que seja funcional para 
os desenvolvedores que recebem o projeto através de um arquivo ".jar".

O mundo Java possui uma série de ".jar"s, caso você queira criar um gráfico ou abrir uma conexão 
com um banco de dados, sempre haverá um ".jar" ou mais que auxiliarão em seu trabalho.

O que aprendemos?

Nessa aula mais leve vimos e aprendemos:

quais comentários e tags (anotações) a usar para definir o javadoc
como gerar o javadoc no Eclipse
que javadoc é uma documentação para desenvolvedores
que as classes Java padrão também usam javadoc
como criar nossa própria biblioteca através do JAR (J*ava *ARchive)
como importar a biblioteca no novo projeto
como criar um JAR executável
Na próxima aula vamos conhecer o pacote java.lang.

Conclui os 12 passos deste modulo Distribuição do seu código