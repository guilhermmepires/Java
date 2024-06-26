# Variáveis
Uma variável é um espaço na memória do computador destinado a um dado que é alterado durante a execução do algoritmo. Para funcionar corretamente, as variáveis precisam ser definidas por nomes e tipos.

Em java, para criamos uma variável, precisamos de três coisas essencias:
1. Definir o __tipo de dado__ que esta variável irá armazenar;
2. Definir um __identificador__ para esta variável; 
3. __Atribuir um valor__ a esta variável. 
```java
public class programa
{
    public static void main(String[] args) {
        // Podemos fazer uma declaração e atribuir um valor, em uma única linha. 
        int idade = 50; 
        System.out.print(idade);

        // Temos também a possibilidade de __declarar__ uma variável e atruibur um valor a ela futuramente.
        int idade; 
        idade = 50;
        
        System.out.print(idade);

    }
}
```

<br>

## Variáveis por debaixo dos panos 
Quando criamos uma variável, na verdade, o que estamos realmente fazendo é:
1. Alocar um espaço em memória;
2. Este espaço recebe um endereço;
3. Atribuimos um valor a este endereço.

![image](https://github.com/FireguiQueen/Java/assets/98475125/fda89935-d180-4a56-a0ff-f7be5b1015df)

Então, quando printamos o valor de nossa variável no terminal através do `System.out.print(idade)`, na verdade, `idade` refere-se
ao endereço do espaço alocado que armazena um valor.

<br>

_______________________

# Tipos de dados primitivos

## 🔢 Tipos para valores numéricos
Se determinado tipo de dado aloca um espaço capaz de armazenar Y de bits, não será possível guardar valores (neste espaço) que excedam Y bits para sua representação.

- __`byte`__ ao declarar uma variável do tipo byte, é alocado espaço em memória de 8 bits (1 byte).
- __`short`__ ao declarar uma variável do tipo short, é alocado espaço em memória de 16 bits (2 bytes). 
- __`int`__ ao declarar uma variável do tipo int, é alocado espaço em memória de 32 bits.
- __`long`__ ao declarar uma variável do tipo long, é alocado espaço em memória de 64 bits. 
- __`float`__ ao declarar uma variável do tipo float, é alocado espaço em memória de 32 bits. A diferença entre o float e o int, é que o float aceita números decimais (números com vírgula, ex: 3.50)
- __`double`__ ao declarar uma variável do tipo double, é alocado espaço em memória de 64 bits. A diferença entre o double e o long, é que o double aceita números decimais.

```java
    short idade = 77;
    int totalPessoasBrasileiras = 250000;
    long totalPessoasMundo = 8000000000L;
    float salario = 4000.50F;
```

<br>

## 🔤 Tipo para caracteres 
- __`char`__ ao declarar uma variável do tipo char, é alocado espaço em memória de 8 bits. Este espaço alocado em memória é utilizado para armazenar __somente__ 1 caracter, nada além disso. Não tente colocar, por exemplo, dois caracteres. Pois você estará tentando colocar 16 bits de informação em um espaço que aguenta apenas 8.  
```java
    // É possível informar um caracter de duas formas:
    char letra = 'a';
        // ou
    char letra = 65; 
```
> No fim, tanto a letra 'a' quanto o valor 65, representam o valor de `01100001` (8 bits).

<br>

 ## ❎ Tipo para representar verdadeiro/falso 
- __`boolean`__ ao declarar uma variável do tipo boolean, é alocado espaço em memória de 1 bit, este digito binário pode ser __zero__ ou __um__. Zero representa 'falso' e um representa 'verdadeiro'.
```java
    boolean isTodayCloudy = true;
    boolean isItRaining = true;
    boolean isMyWalletEmpty = false; 
    boolean sheHasADog = true; 
```
