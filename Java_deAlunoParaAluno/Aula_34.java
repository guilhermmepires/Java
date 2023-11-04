// Vetores multidimensionais
/*
    Um vetor multidimensional nada mais é do que um vetor que armazena outros vetores.
    Ou seja, o elemento de um vetor multidimensional é um vetor. 
*/

    // >>> DEFININDO E ACESSANDO VALORES DE UM VETOR NORMAL.

    // 1º - Definimos um array e colocamos seus elementos diretamente.
        int[] lista = {100, 200, 300}; 
    
    // 2° - Definimos um array e não colocamos seus elementos, apenas definimos quantos elemenetos podem haver
        int[] lista_0 = new int[3];

    // Acessando seus valores:
    lista[0];  // retorna 100. 
    lista[2];  // retorna 300. 


    // >>> DEFININDO E ACESSANDO VALORES DE UM VETOR MULTIDIMENSIONAL.

    // 1° - Definimos um array multidimensional colocando seus elementos diretamente.
    int[][] list = { [200, 100], [400, 2, 4], [0] };

    // Acessando seus valores:
    
    // Retorna 200.
    // Entramos no array 'list'. Entramos no primeiro elemento dele (um vetor). Entramos no primeiro elemento deste vetor.
    list[0][0] 