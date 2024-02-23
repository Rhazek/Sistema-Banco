import java.util.Scanner;

public class SistemaBanco {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scan.nextLine();
        System.out.println("Digite o tipo de conta: (Corrente/Poupança)");
        String tipoConta = scan.nextLine();
        System.out.println("Digite o saldo atual do cliente: ");
        double saldoCliente = scan.nextInt();

        System.out.printf("""
                ***********************
                Nome: %s
                Tipo conta: %s
                Saldo Inicial: R$ %.2f
                ***********************
                %n""", nomeCliente, tipoConta, saldoCliente);


        int escolha=0;
        double valorAlterado;

        while (escolha!=4){
            System.out.println("""
                    Operações \n
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    """);
            escolha = scan.nextInt();

            switch (escolha){
                case 1:
                    System.out.printf("Saldo atual: R$ %.2f%n", saldoCliente);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber:");
                    valorAlterado = scan.nextDouble();
                    saldoCliente += valorAlterado;
                    System.out.println("Saldo atualizado R$" + saldoCliente);
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir:");
                    valorAlterado = scan.nextDouble();
                    if(valorAlterado <= saldoCliente){
                        saldoCliente -= valorAlterado;
                        System.out.println("Saldo atualizado R$" + saldoCliente);
                    } else {
                        System.out.println("Não há saldo suficiente para fazer essa transferência.");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }


    }
}
