Classes anônimas e Lambdas

Classes anônimas
Qual objeto?
O que acontece?
Finalmente Lambdas
E se fosse com lambda?
Foreach com lambda
O padrão Iterator
Mãos na massa: Classes anônimas
Mãos na massa: Lambdas
Conclusão
Projeto final

Como chamamos esse objeto que só encapsula uma função/método/procedimento?
- Function Object

Veja o código abaixo:

```java
Comparator<String> comp = new Comparator<String>() {

  @Override
  public int compare(String s1, String s2) {
    return s1.compareTo(s2);
  }
};
```
- É gerada uma classe anônima.
- É criado um objeto do tipo Comparator.

Conclui os 11 passos deste modulo Classes anônimas e Lambdas e finalizei este curso de java.util

