package lista_03;

public class OpenAddressingHashTable<K, V> {
    private static class Node<K, V> {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private final Node<K, V>[] table;
    private final int size;
    private final Node<K, V> DELETED = new Node<>(null, null);

    @SuppressWarnings("unchecked")
    public OpenAddressingHashTable(int capacity) {
        this.size = capacity;
        this.table = new Node[capacity];
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % size;
    }

    public void put(K key, V value) {
        int index = hash(key);
        for (int i = 0; i < size; i++) {
            int probeIndex = (index + i) % size;
            if (table[probeIndex] == null || table[probeIndex] == DELETED || table[probeIndex].key.equals(key)) {
                table[probeIndex] = new Node<>(key, value);
                return;
            }
        }
        throw new RuntimeException("Hash table is full");
    }

    public V get(K key) {
        int index = hash(key);
        for (int i = 0; i < size; i++) {
            int probeIndex = (index + i) % size;
            if (table[probeIndex] == null) {
                return null; // não encontrado
            }
            if (table[probeIndex] != DELETED && table[probeIndex].key.equals(key)) {
                return table[probeIndex].value;
            }
        }
        return null;
    }

    public boolean remove(K key) {
        int index = hash(key);
        for (int i = 0; i < size; i++) {
            int probeIndex = (index + i) % size;
            if (table[probeIndex] == null) {
                return false; // não encontrado
            }
            if (table[probeIndex] != DELETED && table[probeIndex].key.equals(key)) {
                table[probeIndex] = DELETED;
                return true;
            }
        }
        return false;
    }

    public void printTable() {
        for (int i = 0; i < size; i++) {
            System.out.print("Posição " + i + ": ");
            if (table[i] == null) {
                System.out.println("vazio");
            } else if (table[i] == DELETED) {
                System.out.println("removido");
            } else {
                System.out.println(table[i].key + " -> " + table[i].value);
            }
        }
    }

    // Teste
    public static void main(String[] args) {
        OpenAddressingHashTable<String, Integer> hashTable = new OpenAddressingHashTable<>(7);
        hashTable.put("um", 1);
        hashTable.put("dois", 2);
        hashTable.put("tres", 3);
        hashTable.put("quatro", 4);
        hashTable.put("cinco", 5);

        System.out.println("Valor da chave 'tres': " + hashTable.get("tres"));

        System.out.println("Remover chave 'dois': " + hashTable.remove("dois"));
        hashTable.put("seis", 6);

        hashTable.printTable();
    }
}
