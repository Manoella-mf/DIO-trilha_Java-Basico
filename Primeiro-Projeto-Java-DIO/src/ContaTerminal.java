import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Digite o número da sua Agência: ");
        String Agencia = scanner.nextLine();
        
        System.out.print("Digite o seu Nome: ");
        String NomeCliente = scanner.nextLine();
        
        System.out.print("Digite o número da sua Conta: ");
        int Numero = scanner.nextInt();
       
        System.out.print("Digite o valor do seu saldo: ");
        double Saldo = scanner.nextDouble();
        
        System.out.print("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + Agencia + ", conta " +
                         Numero + " e seu saldo " + Saldo + " já está disponível para saque.");
         
        scanner.close();
    }
}
