package lista_01;

import java.text.DecimalFormat;
import java.util.Locale;

public class Questao13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        DecimalFormat df = new DecimalFormat("0.00");

        double INVESTIMENTO_INICIAL = 1000;
        double INVESTIMENTO_MENSAL = 200;
        int QUANTIDADE_DE_MESES = 6;
        double TAXA_DE_JUROS_MENSAL = 0.005;

        double saldoAcumulado = INVESTIMENTO_INICIAL;
        for (int a = 1; a <= QUANTIDADE_DE_MESES; ++a) {
            System.out.println("RENDIMENTO NO MÊS " + a + ":");

            double rendimento = saldoAcumulado * TAXA_DE_JUROS_MENSAL;
            System.out.println("Rendimento: R$" + df.format(rendimento));

            saldoAcumulado += rendimento + INVESTIMENTO_MENSAL;
            System.out.println("Saldo acumulado: R$" + df.format(saldoAcumulado) + '\n');
        }
    }
}
