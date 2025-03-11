import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Bem-Vindo ao Banco DIO");

        System.out.println("Para começarmos, digite o seu nome:");
        String nomePessoa = leitura.nextLine();

        System.out.println(nomePessoa + ", agora digite o número da sua conta:");
        Integer numeroConta = leitura.nextInt();

        System.out.println("Digite o número da agência:");
        Integer agenciaNumero = leitura.nextInt();

        System.out.println("Agora, digite o saldo a ser depositado em sua conta:");
        double saldo = leitura.nextDouble();

        System.out.println("Olá " + nomePessoa + ", obrigado por criar uma conta em nosso banco DIO, sua agência é "
        + agenciaNumero + ", conta " + numeroConta + " e seu saldo atual é de R$ " + saldo);
    }
}