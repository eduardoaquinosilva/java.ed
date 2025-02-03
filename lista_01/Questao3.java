package lista_01;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int number = scanner.nextInt();

        scanner.close();

        if (number % 2 == 0) {
            System.out.println(number + " é par.");
        } else {
            System.out.println(number + " é ímpar");
        }
    }
}
