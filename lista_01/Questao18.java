package lista_01;

import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tamanho do vetor: ");
        // int vectorSize = scanner.nextInt();

        int[] vector = new int[scanner.nextInt()];

        System.out.println();
        for (int a = 0; a < vector.length; ++a) {
            System.out.print("Valor da posição " + a + ": ");
            vector[a] = scanner.nextInt();
        }
        scanner.close();

        System.out.print("\nO seu vetor foi: ");
        for (int a = 0; a < vector.length; ++a) {
            System.out.print(vector[a] + " ");
        }

        System.out.println();
    }
}
