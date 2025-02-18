package lista_02;

public class Questao09 {
    public static void main(String[] args) {
        int cidadeInicial = 3;
        int CITIES_QUANTITY = 6;
        int[][] matriz = {{0, 3, 0, 0, 0, 0},
                          {0, 0, 1, 0, 0, 0},
                          {0, 0, 0, 0, 1, 0},
                          {0, 0, 2, 0, 1, 0},
                          {1, 0, 0, 0, 0, 0},
                          {0, 1, 0, 0, 0, 0}};
        
        int[] vetorResultado = new int[CITIES_QUANTITY];

        Questao02Interface<Integer> fila = new Questao02Queue<Integer>(CITIES_QUANTITY);

        // 1. Inicialize todos os elementos vetorResultado com -1, exceto o elemento da cidadeInicial, que deve ser zero;
        for (int a = 0; a < CITIES_QUANTITY; ++a) {
            vetorResultado[a] = -1;
        }
        vetorResultado[cidadeInicial] = 0;

        // 2. fila.adicionar( cidadeInicial );
        fila.add(cidadeInicial);

        // 3. Loop (while): Enquanto Fila não for vazia:
        while (fila.isEmpty() == false) {
            // 3.1. cidadeAtual = fila.remover( );
            int cidadeAtual = fila.remove();

            // 3.2. Loop (for): para cada cidade ( cidadeVisitada ):
            for (int cidadeVisitada = 0; cidadeVisitada < CITIES_QUANTITY; ++cidadeVisitada) {
                // 3.2.1. distancia (aresta) = matriz[ cidadeAtual ][ cidadeVisitada ];
                int distancia = matriz[cidadeAtual][cidadeVisitada];

                // 3.2.2. Se distancia maior que 0 e vetorResultado[ cidadeVisitada ] ainda é -1: vetorResultado[cidadeVisitada] = vetorResultado[cidadeAtual] + distancia;
                if (distancia > 0 && vetorResultado[cidadeVisitada] == -1) {
                    vetorResultado[cidadeVisitada] = vetorResultado[cidadeAtual] + distancia;

                    // 3.2.3. fila.adicionar( cidadeVisitada ) (perceba que esta cidade estra na fila pra ser tratada como cidadeAtual em 3.1)
                    fila.add(cidadeVisitada);
                }
            }
        }

        System.out.print("Resultado: ");
        for (int a = 0; a < CITIES_QUANTITY; ++a) {
            System.out.print(vetorResultado[a] + " ");
        }
    }
}
