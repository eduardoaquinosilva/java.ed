package lista_01;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import java_basico.Produto;

public class Questao34e {
    public static void main(String[] args) {
        /**
         * A classe HashMap implementa a interface Map. Tem como objetivo gerar um mapeamento de elementos. Para isso, a classe HashMap utiliza uma tabela Hash. Tem complexidade O(1) e permite apenas uma chave null.
         */
        Map<Integer, Produto> products = new HashMap<Integer, Produto>();
        products.put(0, new Produto(1, "Produto", 5.59));
        products.put(5, new Produto(2, "Produto Produzido", 5.98));
        System.out.println(products.get(0));
        for (int key : products.keySet()) {
            System.out.println(products.get(key));
        }
        System.out.println();

        /**
         * A classe LinkedHashMap implementa a interface Map. Para realizar seu trabalho utiliza uma lista encadeada associada a uma tabela Hash. Também tem complexidade O(1) e permite apenas uma chave null.
         */
        Map<Integer, Produto> products2 = new LinkedHashMap<Integer, Produto>();
        products2.put(0, products.get(0));
        products2.put(2, products.get(5));
        System.out.println(products2.get(0));
        for (int key : products2.keySet()) {
            System.out.println(products2.get(key));
        }
        System.out.println();

        /**
         * A classe TreeMap implementa a interface Map. Para realizar seu trabalho ela utiliza uma árvore binária com complexidade O(log n). Não permite nenhuma chave null e deixa os elementos ordenados.
         */
        Map<Integer, Produto> products3 = new TreeMap<Integer, Produto>();
        products3.put(0, products.get(0));
        products3.put(10, products.get(5));
        System.out.println(products3.get(0));
        for (int key : products3.keySet()) {
            System.out.println(products3.get(key));
        }
    }
}
