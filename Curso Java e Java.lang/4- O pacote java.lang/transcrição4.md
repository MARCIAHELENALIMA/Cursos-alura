# Transcrição

O que é correto afirmar sobre o pacote java.lang?
-Possui classes essenciais para qualquer programa 
Correto, as classes String e System são apenas dois exemplos de vários outros.

-Não precisa do import, é automaticamente importado.
Correto, não é preciso colocar explicitamente o import java.lang.

-As classes String e System vem desse pacote.
Correto, e veremos ainda vários outras classes desse pacote fundamental.

Quando falamos sobre exceções já vimos várias classes como Exception, 
RuntimeException, NullPointerException ou ArithmeticException.
Todas essas classes vem do pacote java.lang e por isso não era preciso importá-las.

**Uma das classes que frequentemente lidamos é a String. Qual das afirmativas é a correta sobre ela:
Um objeto do tipo String não pode ser alterado.
Correto, objetos da classe String são imutáveis. Isso significa que, uma vez criado, não pode ser 
alterado, por isso qualquer alteração cria um novo objeto String.

É uma classe definida em java.lang e por isso não há a necessidade de importar.
Correto, pois a classe String realmente é do pacote java.lang. O FQN é java.lang.String**

O que aprendemos?

Nessa aula aprendemos e conhecemos:

o package java.lang é o único pacote que não precisa ser importado
nele tem classes fundamentais que qualquer aplicação precisa, como a classe String e System
objetos da classe String são imutáveis e usamos uma sintaxe literal para criar (object literal)
qualquer método de alteração da classe String devolve uma nova String que representa a alteração
a classe String é uma CharSequence
se precisamos concatenar muitos String devemos usar a classe StringBuilder
vimos vários métodos da classe String como trim, charAt, contains, isEmpty, length, indexOf, replace
Na próxima aula veremos outra classe fundamental: java.lang.Object

Conclui os 11 passos deste modulo O pacote java.lang