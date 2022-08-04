package Programa;
import java.util.ArrayList;
import java.util.Scanner;

public class AgenciaBancaria {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Conta> contasBancarias;

    public static void main(String[] args) {
        contasBancarias = new ArrayList<Conta>();
        operacoes();
    }

    public static void operacoes(){
        System.out.println("------------------------------------------------------");
        System.out.println("--------------Bem vindos a nossa Agencia--------------");
        System.out.println("***** Seleciona uma operacao que deseja realizar *****");
        System.out.println("|       Opcao 1 - Criar conta       |");
        System.out.println("|       Opcao 2 - Depositar         |");
        System.out.println("|       Opcao 3 - Sacar             |");
        System.out.println("|       Opcao 4 - Transferir        |");
        System.out.println("|       Opcao 5 - Listar            |");
        System.out.println("|       Opcao 6 - Sair              |");

        int operacao =  input.nextInt();

        switch (operacao){
            case 1:
                criarConta();
                break;
            case 2:
                depositar();
                break;
            case 3:
                sacar();
                break;
            case 4:
                transferir();
                break;
            case 5:
                listar();
                break;
            case 6:
                System.out.println("Obrigador por usar nossa agencia. Ate logo! :)");
                System.exit(0);
            default:
                System.out.println("Opcao invalida");
                operacoes();
                break;

        }
    }

    public static void criarConta(){
        System.out.println("\nNome: ");
        String nome = input.next();

        System.out.println("\nCPF: ");
        String CPF = input.next();

        System.out.println("\nEmail: ");
        String Email = input.next();

        System.out.println("\nTelefone: ");
        String Telefone = input.next();

        Pessoa cliente = new Pessoa(nome, CPF, Email, Telefone);

        Conta conta = new Conta(cliente);
        contasBancarias.add(conta);
        System.out.println("Conta criada com sucesso!");

        operacoes();
    }

    private  static Conta encontrarConta(int numeroDaConta){
        Conta conta = null;
        if (contasBancarias.size() > 0){
            for(Conta c: contasBancarias) {
                if(c.getNumeroDaConta() == numeroDaConta);
                conta = c;
            }
        }
        return conta;
    }

    public static void depositar(){
        System.out.println("Numero da conta: ");
        int numeroConta = input.nextInt();

        Conta conta = encontrarConta(numeroConta);
        if(conta != null){
            System.out.println("Qual valor deseja depositar? ");
            Double valorDeposito = Double.valueOf(input.nextInt());
            conta.depoisitar(valorDeposito);
            System.out.println("Voce realizou com sucesso um deposito no valor de: " + valorDeposito);
        }else {
            System.out.println("Conta nao encontrada! ");
        }
        operacoes();
    }
    public static void sacar(){
        System.out.println("Numero da conta: ");
        int numeroConta = input.nextInt();
        Conta conta = encontrarConta(numeroConta);

        if (conta != null){
            System.out.println("Qual valor deseja sacar? ");
            Double valorSaque = Double.valueOf(input.nextInt());
            conta.realizarSaque(valorSaque);
            System.out.println("Voce realizou com sucesso um saque no valor de: " + valorSaque);
        }else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    public static void transferir(){
        System.out.println("Numero da conta de origem: ");
        int numeroContaRemetente = input.nextInt();

        Conta contaRemetente = encontrarConta(numeroContaRemetente);
        if contaRemetente !=null) {
            System.out.println("Numero da conta destinataria: ");
            int numeroContaDestinataria = input.nextInt();

            Conta contaDestinataria = encontrarConta(numeroContaDestinataria);
            if(contaDestinataria !== null){
                System.out.println("Valor da transferencia: ");
                Double valor =  Double.valueOf(input.nextInt());
                contaRemetente.transferir(contaDestinataria, valor);
            }
        }
        operacoes();
    }
public static void  listar(){
        if(contasBancarias.size() > 0){
            for Conta conta: contasBancarias){
                System.out.println(conta);
            }else {
                System.out.println("Nao ha contas cadastradas!");
            }
            operacoes();
        }
}
}
