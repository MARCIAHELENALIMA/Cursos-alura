Ordenação de listas

Ordenando listas
Comparando Strings
A ordem natural
Interfaces para ordenar
Ordem natural
Por que não funciona?
Desafio Collections
Ordenar Arrays
Mãos na massa: Ordenação de listas
Mão na massa: Ordenar pelo String
Mãos na massa: Ordem Natural
O que aprendemos?

No mundo Java existem duas interfaces para definir o critério de ordenação dos elementos de uma lista.

As interfaces são:
- java.util.Comparator
- java.lang.Comparable

No contexto da aula, o que significa ordem natural?
- É a ordem definida pelo próprio elemento da lista.

Como podemos inverter a ordem de uma lista?
- você pode usar o método reverse da classe Collections:
```java
Collections.reverse(lista);
```

Como podemos embaralhar todos os elementos de uma lista?
-  Para embaralhar existe o método shuffle:
```java
Collections.shuffle(lista);
```

Como podemos rotacionar os elementos de uma lista?
- para rotacionar tem o método rotate:
```java
Collections.rotate(lista, 5); //rotacionar 5 posicoes
```
O que aprendemos?


Nessa aula fundamental e importante aprendemos que:

para ordenar uma lista é preciso definir um critério de ordenação
há duas formas de definir esse critério
pela interface Comparator
pela interface Comparable (ordem natural)
o algoritmo de ordenação já foi implementado
na lista no método sort
na classe Collections pelo método sort
a classe Collections é uma fachada com vários métodos auxiliares para trabalhar com as coleções, principalmente listas
Respira fundo, pois estamos quase no fim desse curso, no entanto falta ainda aprender (finalmente!) as famosas lambda expressions. Tá pronto para continuar?

Conclui os 12 passos deste modulo Ordenação de listas