import java.util.Scanner;


public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, bem-vindo ao nosso Banco!");

        System.out.println("Por favor, digite o número da Conta:");
        int numero = sc.nextInt();


        System.out.println("Por favor, digite o número da Agência:");
        String agencia = sc.next();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = sc.next();

        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + 
                           ", obrigado por criar uma conta em nosso banco. Sua agência é " 
                           + agencia + ", conta " + numero + 
                           " e seu saldo é R$ " + saldo + "Já está disponìvel para saque.");

    }
}
