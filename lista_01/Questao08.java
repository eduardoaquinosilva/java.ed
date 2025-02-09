package lista_01;

import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int number = scanner.nextInt();

        scanner.close();

        System.out.println(
            switch (number) {
                case 1 -> "um";
                case 2 -> "dois";
                case 3 -> "três";
                case 4 -> "quatro";
                case 5 -> "cinco";
                default -> "valor invalido";
            }
        );
    }
}
