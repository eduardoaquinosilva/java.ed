package lista_03;

public class Questao13 {
    public static void main(String[] args) {
        // 1. Algoritmos de Busca

        // 1.1 Busca Linear
        // Esse método de busca consiste em verificar cada elemento da estrutura de forma sequencial até encontrar o elemento desejado. Por mais que seja mais fácil de ser implementado, é pouco eficiente.
        // Melhor caso: O(1)
        // Pior caso: O(n)

        // 1.2 Busca Binária
        // Esse método consiste em reduzir sucessivamente o espaço de busca até encontrar o elemento desejado na chave central. Por mais que seja uma forma bem mais eficiente de busca, pressupõe que a estrutura esteja previamente ordenada.
        // Melhor caso: O(1)
        // Pior caso: O(log n)

        // 1.3 Árvore Binária
        // Utiliza uma estrutura dinâmica de árvore binária que mantém os elementos ordenados dinamicamente. Para cada nó, os elementos à esquerda são menores que ele e os elementos à direita são maiores.
        // Melhor caso: O(1)
        // Pior caso: O(log n)

        // 1.4 Tabela de Dispersão
        // Utiliza uma tabela hash, uma estrutura indexada, e aplica uma função de dispersão e um tratamento de colisões. A função de dispersão transforma a chave "k" em um endereço da tabela "h(k)". O tratamento de colisões trata os casos em que duas ou mais chaves se transformam no mesmo endereço da tabela. Com o endereçamento fechado são utilizadas listas encadeadas para armazenar as chaves no mesmo endereço. Com o endereçamento aberto um novo endereço é definido para essa chave.
        // Melhor caso: O(1)
        // Pior caso: O(n)


        // 2. Algoritmos de Ordenação
        
        // 2.1 Bubble Sort
        // Consiste em percorrer a estrutura n-1 vezes trocar os elementos adjascentes que estiverem fora de ordem.
        // Melhor caso: O(n^2)
        // Pior caso: O(n^2)

        // 2.2 Select Sort
        // Seleciona sempre o elemento com menor valor, dentre os que ainda não foram colocados no lugar, e é trocado com o primeiro deles.
        // Melhor caso: O(n^2)
        // Pior caso: O(n^2)

        // 2.3 Insert Sort
        // Busca pelo elemento com o menor valor, dentre os que ainda não foram colocados no lugar, e o insere no seu devido lugar comparando com os que vieram antes dele.
        // Melhor caso: O(n)
        // Pior caso: O(n^2)

        // 2.4 Quick Sort
        // Escolhe-se um elemento pivô, como o elemento central, ordena tudo que está a sua esquerda, depois o que está a sua direita e aplica isso de forma recursiva.
        // Melhor caso: O(n*logn)
        // Pior caso: O(n^2)

        // 2.5 Shell Sort
        // Parecido com o InsertSort, mas invés de fazer a troca com elementos a uma distância 1, é feita a troca com elementos a uma distância H.
        // Melhor caso: O(n*logn)
        // Pior caso: O(n)

        // 2.6 Heap Sort
        // Percorre cada elemento da estrutura e insere-o em um heap (árvore binária). Ao final de todas as inserções basta ler os elementos da árvore.
        // Melhor caso: O(n*logn)
        // Pior caso: O(n*logn)
    }
}
