As classes Wrappers

Autoboxing e Unboxing
Métodos da classe Integer
O Wrapper Integer
Código confuso
Parsing
A classe Number
Qual primitivo?
Conhece os wrappers?
Mãos na massa: Wrappers
O que aprendemos?

No último vídeo vimos o primeiro Wrapper: java.lang.Integer

Nesse contexto, o que são Wrappers?
- São classes que contém funcionalidades e encapsulam a variável de tipo primitivo!

O Autoboxing / unboxing pode ser confuso. Será que você desmistifica o código abaixo?

```java
public class TesteWrapper {

    public static void main(String[] args){
        Integer ref = Integer.valueOf("3");
        ref++;
        System.out.println(ref);
    }
}
```
O código compila e roda? Qual seria resultado?

## Compila, roda e imprime 4.

Correto, realmente incrementa o valor inteiro, mesmo sendo uma referência. O que acontece por baixo dos panos é um autoboxing / unboxing na linha que incrementa a variável (ref++). Você pode imaginar que essa linha será substituída por três novas:

```java
int valor = ref.intValue();
valor = valor + 1;
ref = Integer.valueOf(valor);
```
O valor é desembrulhado, depois incrementado e depois embrulhado de novo!


O que aprendemos?

Nessa aula focamos nas classes WRAPPERS e aprendemos que

para cada primitivo existe uma classe chamada Wrapper
para guardar um primitivo numa coleção é preciso criar um objeto que embrulha o valor
a criação do objeto Wrapper é chamada de autoboxing
a retirada do valor primitivo do objeto Wrapper é chamada de unboxing
autoboxing e unboxing acontecem automaticamente.
as classes wrapper possuem vários métodos auxiliares, por exemplo para o parsing
todas as classes wrappers que representam um valor numérico possuem a classe java.lang.Number como mãe
Na próxima aula vamos aprender como ordenar as listas!

conclui os 10 passos deste moduloAs classes Wrappers 