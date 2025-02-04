package lista_01;

import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número de linhas: ");
        int rows = scanner.nextInt();

        System.out.print("Número de colunas: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println();
        for (int a = 0; a < matrix.length; ++a) {
            for (int b = 0; b < matrix[a].length; ++b) {
                System.out.print("Valor da posição [" + a + "][" + b + "]: ");
                matrix[a][b] = scanner.nextInt();
            }
        }
        scanner.close();

        System.out.println("\nA sua matrix foi: ");
        for (int a = 0; a < matrix.length; ++a) {
            for (int b = 0; b < matrix[a].length; ++b) {
                System.out.print(matrix[a][b] + " ");
            }
            System.out.println();
        }
    }
}
