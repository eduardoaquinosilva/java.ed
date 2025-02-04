package lista_01;

import java.util.Locale;
import java.util.Scanner;

public class Questao17 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        scanner.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        int option = 1;

        while (option != 0) {
            menu();
            option = scanner.nextInt();
    
            switch (option) {
                case 1 -> pow();
                case 2 -> squareRoot();
                case 3 -> factorialCalc();
                case 0 -> leave();
                default -> System.out.println("Opção inválida!");
            }

            System.err.println();
        }
    }

    private static void menu()
    {
        System.out.println("********* MENU DE OPÇÕES  **********");
        System.out.println("1 - Potenciação");
        System.out.println("2 - Raiz Quadrada");
        System.out.println("3 - Fatorial");
        System.out.println("0 - Sair");
        System.out.print("Opção: ");
    }

    private static void leave()
    {
        System.out.println("\nCalculadora encerrada!");
    }

    private static void pow()
    {
        System.out.print("\nBase: ");
        double base = scanner.nextDouble();

        System.out.print("Expoente: ");
        double exponent = scanner.nextDouble();

        System.out.println("Resultado: " + Math.pow(base, exponent));
    }

    private static void squareRoot()
    {
        System.out.print("\nRadicando: ");
        double rooting = scanner.nextDouble();

        System.out.println("Resultado: " + Math.sqrt(rooting));
    }

    private static void factorialCalc()
    {
        System.out.print("\nNúmero: ");
        double number = scanner.nextDouble();

        System.out.println("Resultado: " + Questao16.factorial(number));
    }
}
