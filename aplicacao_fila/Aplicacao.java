package aplicacao_fila;

import filas.MyInterfaceQueue;
import filas.MyQueueArray;

// Conte as distâncias de uma cidade para todas as outras cidades
public class Aplicacao {
    public static void main(String[] args) {
        int INITIAL_CITY = 5;
        int CITIES_QUANTITY = 6;
        int[][] CITIES_DISTANCES = {{0, 3, 0, 0, 0, 0},
                                 {0, 0, 1, 0, 0, 0},
                                 {0, 0, 0, 0, 1, 0},
                                 {0, 0, 2, 0, 1, 0},
                                 {1, 0, 0, 0, 0, 0},
                                 {0, 1, 0, 0, 0, 0}};
    
        int[] distances = new int[CITIES_QUANTITY];
    
        MyInterfaceQueue<Integer> queue = new MyQueueArray<Integer>(CITIES_QUANTITY);

        // 1. Inicialize o vetor resultado com -1, exceto o elemento da cidade atual, que deve ser zero.
        for (int a = 0; a < CITIES_QUANTITY; ++a) {
            distances[a] = -1;
        }
        distances[INITIAL_CITY] = 0;

        // 2. Insira na Fila a cidade inicial.
        queue.add(INITIAL_CITY);

        // 3. Enquanto Fila não for vazia:
        while (queue.isEmpty() == false) {
            // 3.1. Remover cidade da Fila, que será a cidade atual
            int currentCity = queue.remove();

            // 3.2. Percorra todas as cidades (cidade visitada):
            for (int visitedCity = 0; visitedCity < CITIES_QUANTITY; ++visitedCity) {
                // 3.2.1. Descubra distancia (aresta) entre a cidade atual e a cidade visitada
                int distance = CITIES_DISTANCES[currentCity][visitedCity];

                // 3.2.2. Se, a aresta for maior que zero e o elemento resulado da cidade visitada ainda é -1: a distancia com a cidade visitada é igual a distancia da cidade atual mais a aresta.
                if (distance > 0 && distances[visitedCity] == -1) {
                    distances[visitedCity] = distances[currentCity] + distance;

                    // 3.2.3. Inserir cidade visitada na Fila (que no próximo loop será a cidade atual).
                    queue.add(visitedCity);
                }
            }
        }

        System.out.println();
        for (int a = 0; a < distances.length; ++a) {
            System.out.print(distances[a] + " ");
        }
    }
}
