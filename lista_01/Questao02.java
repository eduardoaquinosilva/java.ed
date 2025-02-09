package lista_01;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        System.out.print("Informe o valor do raio (m): ");
        float ratio = scanner.nextFloat();

        while (ratio < 0) {
            System.out.println("O raio deve ser positivo.");

            System.out.print("\nInforme o valor do raio (m): ");
            ratio = scanner.nextFloat();
        }

        scanner.close();

        double area = Math.PI * ratio * ratio;

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Área: " + df.format(area) + "m^2");
    }
}
