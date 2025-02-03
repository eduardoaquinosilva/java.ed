package lista_01;

import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o início do intervalo: ");
        int start = scanner.nextInt();

        System.out.print("Informe o fim do intervalo: ");
        int end = scanner.nextInt();

        scanner.close();

        int summation = 0;
        for (int a = start; a <= end; a++) {
            summation += a;
        }

        System.out.println("Somatório: " + summation);
    }
}
