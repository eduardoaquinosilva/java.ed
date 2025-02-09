package lista_01;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        scanner.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        System.out.print("Informe o peso (kg): ");
        float weight = scanner.nextFloat();

        System.out.print("Informe a altura (m): ");
        float heigth = scanner.nextFloat();

        scanner.close();

        try {
            float squared_heigth = heigth * heigth;

            if (squared_heigth == 0.0f) {
                throw new ArithmeticException("A altura não pode ser nula.");
            }

            float imc = weight / squared_heigth;

            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println("IMC: " + df.format(imc));
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
