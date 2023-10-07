import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args) {
        // Criação da variável scanner, que é uma instância da classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual é o seu nome?");
        String nome = scanner.next();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = String.valueOf(scanner.nextInt());

        System.out.println("Por favor, digite o número de sua conta!");
        String conta = String.valueOf(scanner.nextInt());

        System.out.println("Por favor, digite o saldo de sua conta!");
        String saldo = String.valueOf(scanner.nextDouble());

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
