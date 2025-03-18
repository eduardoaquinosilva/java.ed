package lista_03;

import java.util.LinkedList;

public class SeparateChainingHashTable<K, V> {
    private static class Node<K, V> {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Node<K, V>>[] table;
    private int size;

    @SuppressWarnings("unchecked")
    public SeparateChainingHashTable(int capacity) {
        table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
        size = capacity;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % size;
    }

    // Inserir ou atualizar chave/valor
    public void put(K key, V value) {
        int index = hash(key);
        for (Node<K, V> node : table[index]) {
            if (node.key.equals(key)) {
                node.value = value; // Atualiza se chave já existe
                return;
            }
        }
        table[index].add(new Node<>(key, value)); // Insere se chave nova
    }

    // Buscar valor pela chave
    public V get(K key) {
        int index = hash(key);
        for (Node<K, V> node : table[index]) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null; // Não encontrado
    }

    // Remover chave/valor
    public boolean remove(K key) {
        int index = hash(key);
        var iterator = table[index].iterator();
        while (iterator.hasNext()) {
            if (iterator.next().key.equals(key)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    // Imprimir o conteúdo da tabela
    public void printTable() {
        for (int i = 0; i < size; i++) {
            System.out.print("Bucket " + i + ": ");
            for (Node<K, V> node : table[i]) {
                System.out.print("[" + node.key + " = " + node.value + "] ");
            }
            System.out.println();
        }
    }

    // Teste
    public static void main(String[] args) {
        SeparateChainingHashTable<String, Integer> hashTable = new SeparateChainingHashTable<>(5);
        hashTable.put("um", 1);
        hashTable.put("dois", 2);
        hashTable.put("tres", 3);
        hashTable.put("quatro", 4);
        hashTable.put("cinco", 5);
        hashTable.put("dois", 22); // Atualização de valor

        System.out.println("Valor da chave 'tres': " + hashTable.get("tres"));
        System.out.println("Removendo chave 'quatro': " + hashTable.remove("quatro"));

        hashTable.printTable();
    }
}
