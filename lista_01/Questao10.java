package lista_01;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número inicial: ");
        int start = scanner.nextInt();

        System.out.print("Informe o número final: ");
        int end = scanner.nextInt();

        scanner.close();

        System.out.println();
        for (int a = start; a <= end; a++) {
            if (a % 2 != 0) {
                System.out.print(a + " ");
            }
        }
    }
}
