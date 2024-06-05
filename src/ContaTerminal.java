import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, informe o número da conta: ");
        int numeroConta = sc.nextInt();
        System.out.println("Por favor, informe o número da agência: ");
        String agenciaConta = sc.next();
        System.out.println("Por favor, informe o seu nome: ");
        String nome = sc.next();
        System.out.println("Por favor, informe o valor do depósito: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta +", conta " + numeroConta +" e seu saldo R$ " + String.format("%.2f", saldo) + " já está disponível para saque.");

        sc.close();
    }
}
