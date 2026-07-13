import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Conhecer e importar a classe Scanner
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        // Seguindo a ordem exata solicitada no desafio da DIO:

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = input.next(); // String para aceitar o formato "067-8"

        System.out.print("Por favor, digite o número da Conta: ");
        int conta = input.nextInt();

        // Limpeza de buffer obrigatória antes de ler uma linha de texto inteira (caso
        // use spaces)
        input.nextLine();

        System.out.print("Por favor, digite o Nome do Cliente: ");
        String nome = input.nextLine();

        System.out.print("Por favor, digite o Saldo inicial: ");
        double saldo = input.nextDouble();

        System.out.println(); // Apenas salta uma linha no terminal para organizar

        // Exibir a mensagem da conta criada
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

        input.close(); // Fecha o scanner
    }
}