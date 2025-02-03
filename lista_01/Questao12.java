package lista_01;

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número para a tabuada: ");
        int number = scanner.nextInt();

        scanner.close();

        System.out.println();
        for (int a = 0; a <= 10; a++) {
            System.out.println(number + " x " + a + " = " + number * a);
        }
    }
}
