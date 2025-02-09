package lista_01;

import java.util.Locale;
import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        Questao04Conta account1 = new Questao04Conta("Eduardo Silva", "999.999.999-99");
        Questao04Conta account2 = new Questao04Conta("Eduardo Aquino", "111.111.111-11");

        account1.deposit(100);
        account2.deposit(100);

        System.out.print("Valor para transferir da conta 1 para a conta 2: R$ ");
        double value = scanner.nextDouble();
        scanner.close();

        if (account1.tranfer(value, account2)) {
            System.out.println("\nTransferância realizada com sucesso!");
        } else {
            System.out.println("\nTransferência negada! Conta 1 não possui saldo suficiente!");
        }
    }
}
