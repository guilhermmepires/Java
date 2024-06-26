// COMENTÁRIOS
/*
    Os comentários são textos que não fazem parte do programa em sí. Eles não interferem no funcionamento do mesmo.

    O processo de compilação identifica o que não faz parte do programa e, consequentemente, elimina esses trechos para gerar o arquivo '.class'.
    Quando o compilador reconhece um comentário de bloco, por exemplo, ele compreende que todo o conteúdo dentro desse bloco pode ser descartado.

    > RESUMINDO: Em arquivos '.class' não vemos os comentários no bytecode.
    Isso ocorre porque, quando nosso arquivo '.java' passa pela compilação para se tornar um '.class', os comentários são removidos
    durante o processo.


    // ** UTILIDADE **
    Comentar trechos de código pode ser necessário, mas em geral, a necessidade de comentar pode sugerir que o
    código pode ser mal elaborado. O ideal é priorizar um código autoexplicativo, que elimine a necessidade de comentários.
    Por essa razão, em muitos casos, a prática de comentar códigos NÃO é recomendada. Mas é claro, a situação pode variar 
    dependendo do contexto.
    
    // ** TIPOS DE COMENTÁRIOS EM JAVA** 
    - de linha 
    - de bloco 
    - javaDoc

    
    Comentários de linha (utilizado para comentar em uma única linha) e de bloco (utilizado para comentar em diversas linhas) 
    geralmente são evitados, pois, como mencionado anteriormente, a necessidade de explicar pequenos trechos pode indicar que 
    o código necessita de melhorias estruturais.

    O 'javaDoc', abreviação de "java documentation", é utilizado para documentar MÉTODOS e CLASSES.
    O 'javadoc' é muito bom pois ele aceita formatação HTML, o que torna os comentários mais legíveis e compreensíveis.
*/

package introducao.sec_01_comentarios;

public class aula_01
{

    /**
        Isto é um comentário <b>em java doc</b>
        Com ele podemos fazer documentações detalhadas sobre determinada classe ou método.
    */
    public static void main(String[] args)
    {
        // Isto é um comentário de linha.

        /*
            Este é um comentário de bloco.
            Usado para documentar informações mais extensas,
            cobrindo trechos maiores de código.
        */
    }
}
