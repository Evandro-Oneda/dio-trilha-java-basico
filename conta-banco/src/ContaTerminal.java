import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Locale.setDefault(null);

        Double saldo;

        System.out.println("Por favor, digite seu nome!");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite seu número!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite sua agencia!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu saldo");
        saldo = scanner.nextDouble();
        
        scanner.close();


        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo "+ saldo + " já está disponivel para o saque." );



    }
    
    
}
