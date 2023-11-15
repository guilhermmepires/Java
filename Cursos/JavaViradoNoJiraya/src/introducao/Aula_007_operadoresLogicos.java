// OPERADORES LÓGICOS
/*
    São eles:
    and: &&
    or: ||
    negative: !

    Quando usados em expressões, eles fazem com que a expressão retorne 'TRUE' ou 'FALSE'.

    O operador 'and' (&&) requer que duas expressões sejam verdadeiras para retornar 'TRUE'.
    O operador 'or' (||) requer que apenas uma das duas expressões seja verdadeira para retornar 'TRUE'.
*/
package introducao;

public class Aula_007_operadoresLogicos
{
    public static void main(String[] args)
    {
        // Abaixo, temos uma expressão "normal".
        int num = (50 + 50) * 2; // Essa expressão retorna o valor de 200.

        // Agora, uma expressão que utiliza um operador de COMPARAÇÃO, retornando 'true' ou 'false'.
        boolean y = 20 > 10;

        // Vamos usar operadores lógicos em expressões.
        // Neste exemplo, avaliamos a condição financeira considerando dois requisitos:
        // 1. Ter uma casa.
        // 2. Ter mais de 30.000 no banco.

        boolean temCasa = true;
        boolean temTrintaMil = true;
        boolean condicaoFinanceiraBoa = temCasa && temTrintaMil;

        // Expressão completa: temCasa && temTrintaMil
        // Aqui, o operador lógico AND (&&) verifica se ambas as condições são 'true'.
        // Se sim, a expressão completa também é 'true'.

        // LEMBRE-SE, ao usar o operador 'AND', a expressão completa retorna 'true' apenas se todas as expressões forem verdadeiras.

        // EXEMPLOS:
        System.out.println(true && true); // true (ambas são verdadeiras)
        System.out.println(true && false); // false (uma delas é falsa)
        System.out.println(true && true && true); // true (todas são verdadeiras)
        System.out.println(false && true && true); // false (uma delas é falsa)

        // Verificar se pode comprar bebidas alcoólicas: precisa ser maior de idade e ter dinheiro suficiente.
        double carteira = 30.0;
        int idade = 20;
        boolean podeComprarABreja = carteira >= 5 && idade >= 18;
        // a variável 'podeComprarABreja' receberá 'true' porque a carteira tem mais de 5 e a idade é maior que 18.

        // ****** * * ********* * ************ *** ****** ****** * ************ * * *************

        // Operador 'or' (||)

    }
}
