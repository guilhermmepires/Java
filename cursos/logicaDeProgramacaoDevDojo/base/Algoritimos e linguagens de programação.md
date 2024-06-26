# Algoritmos e Linguagens de Programação

## Algoritimos
Algoritmos são utilizados para resolver problemas de forma eficiente e prática. Um algoritimo Pode ser definido como um conjunto de instruções para resolver um problema específico.

Algoritmos frequentemente são relacionados diretamente à computação, onde o código de um software é formado por um ou mais algoritimos. Cada um desempenhando um papel crucial para o funcionamento do programa.

Mas a realidade é que os algoritmos não são exclusivos da computação e também estão presentes em nossa vida cotidiana, como, por exemplo, atravessar uma rua. Para isso, geralmente seguimos um algoritmo simples:

1. Olhar para os dois lados: direita e esquerda.
2. Se houver carros vindo, esperar. Se não houver carros, atravessar a rua.

No entanto, é importante notar que os algoritmos em nossos programas podem ser muito mais complexos. Por exemplo, o algoritmo mencionado anteriormente poderia ser expandido da seguinte forma:

1. Olhar para os dois lados: __direita e esquerda__.
2. Há carros vindo?
+ __NÃO__: atravessar a rua.
+ __SIM__: Eles estão longe?
+ + __SIM__: Atravessar a rua.
+ + __NÃO__: Aguardar os carros passarem para atravessar a rua.

____________________

## Linguagem de máquina
A linguagem de máquina (ou linguagem de montagem) é a única linguagem que nossos computadores são capazes de __compreender__. Esta linguagem nada mais é do que uma sequência de bits (dígitos binários), ou seja, zeros e uns. O número 0 (zero) representa o estado de _desligado_, e o número 1 (um) representa o estado de _ligado_. Com esta junção de zeros e uns, somos capazes de representar informações, e por consquência, desenvolver softwares (jogos, drivers, aplicativos comuns e etc..).    

No entanto, seria extremamente difícil e nada prático para nós, desenvolvedores, utilizá-la para a crição de software. Por isso, criamos as linguagens de programação de alto nível.

## Assembly
Nos "primórdios" da computação, foi criado o assembly, que na época, poderia ser considerada uma __linguagem de programação de alto nível__. A ideia por trás do assembly era trabalhar com uma linguagem um pouco mais compreensível e menos verbosa do que __zeros e uns__. 

Para se concluir o desenvolvimento de um programa, o código feito nessa linguagem seria __compilado para linguagem de máquina__. Em outras palavras, o software desenvolvido em assembly passaria por um processo de tradução, resultando em código de máquina.

![cs3](https://github.com/FireguiQueen/Java/assets/98475125/fab22565-c394-4bbc-8ecb-eaf320039160)

### Linguagens de programação: High-level e low-level
Uma linguagem "high-level" é quando sua sintaxe é voltada para o entendimento humano. Isso significa que esse tipo de linguagem é muito mais intuitivo, amigável e mais fácil de aprender. Além disso, elas possuem uma alta portabilidade, isto é, são capazes de serem executadas diferentes tipos de sistemas sem grandes alterações. 

Uma linguagem de programação de baixo nível é aquela em que a escrita do código é mais próxima da linguagem entendida pela máquina. Isso implica em uma sintaxe mais complexa e menos comandos intuitivos. Programas escritos em linguagens de baixo nível geralmente apresentam menor portabilidade. Por exemplo, ao comparar com linguagens de alto nível como C++, onde o código fonte é compilado e adaptado com base no hardware do usuário, linguagens de baixo nível como Assembly não passam por esse processo de compilação específica. Consequentemente, um código escrito em Assembly para um computador de 1994 pode não funcionar em máquinas com hardwares mais modernos.

Como podemos observar na imagem abaixo, as linguagens "high-level" (de alto nível) contêm palavras do vocabulário inglês. A linguagem assembly também as possui, mas em termos de complexidade na compreensão do código, ela é consideravelmente mais desafiadora. 
   
![csexamples](https://github.com/FireguiQueen/Java/assets/98475125/4b9fe8ff-543b-4054-8e57-43e3e34e51d3)

____________________

### Diferentes formas de programar: Uma única forma de compreender.
Para criar um software nós podemos optar por linguagens de alto nível, como Java, C e C++ (...), ou adentrar o mundo das linguagens de baixo nível, como o Assembly. Porém, independente da linguagem escolhida, todas compartilham um propósito singular: passar por um processo de compilação para se traduzir em uma sequência de zeros e uns, a __única__ linguagem que nossas máquinas conseguem compreender.

Alguns podem argumentar que esta afirmação não se aplica às linguagens interpretadas, como o JavaScript, onde o código não é compilado diretamente para binário. Em vez disso, ele é interpretado por um motor, como o V8 do Google. No entanto, mesmo nesses casos, o código é eventualmente traduzido para linguagem de montagem para que a máquina possa compreendê-lo.

