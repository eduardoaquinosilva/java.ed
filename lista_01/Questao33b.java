package lista_01;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import java_basico.Produto;

public class Questao33b {
    public static void main(String[] args) {
        /**
         * A classe HashSet implementa a interface Set. Assim como todos que implementam Set, a HashSet não permite elementos iguais. Além disso, não há como ter garantia de qual ordem será utilizada no armazenamento de um HashSet. Não é possível solicitar ordenação por valor nem por ordem de inserção. Para funcionar utiliza-se de uma tabela Hash.
         */
        Set<Produto> products = new HashSet<Produto>();
        products.add(new Produto(2, "Outro Produto", 10.99));
        products.add(new Produto(1, "Produto", 5.89));
        products.add(new Produto(2, "Produto Repetido", 4.87));
        System.out.println(products + "\n");

        /**
         * A classe LinkedHashSet implementa a interface Set. A grande diferença dela para a HashSet é sua capacidade de manter a ordem de inserção com uma estrutura de lista encadeada ao mesmo tempo que utiliza a tabela Hash.
         */
        Set<Produto> products2 = new LinkedHashSet<Produto>();
        products2.add(new Produto(2, "Outro Produto", 10.99));
        products2.add(new Produto(1, "Produto", 5.89));
        products2.add(new Produto(2, "Produto Repetido", 4.87));
        System.out.println(products2 + "\n");

        /**
         * A classe TreeSet implementa a interface Set. A grande diferença das outras duas implementações está associada a sua capacidade de manter os elementos ordenados por utilizar uma SortedList internamente junto à uma árvore binária.
         */
        Set<Produto> products3 = new TreeSet<Produto>();
        products3.add(new Produto(2, "Outro Produto", 10.99));
        products3.add(new Produto(1, "Produto", 5.89));
        products3.add(new Produto(2, "Produto Repetido", 4.87));
        System.out.println(products2 + "\n");
    }
}
