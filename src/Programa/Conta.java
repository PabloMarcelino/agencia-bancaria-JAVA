package Programa;

import utilities.Utilities;

public class Conta {
    private static int contadorDeConta = 1;

    private int numeroDaConta;
    private Pessoa pessoa;
    private Double saldo = 0.0;
    private Object Double;


    public Conta(Pessoa pessoa) {
        this.numeroDaConta = contadorDeConta;
        this.pessoa = pessoa;
        contadorDeConta +=1;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String toString(){
        return "\nNumero da Conta: " + this.getNumeroDaConta() +
                "\nNome: " + this.pessoa.getNome() +
                "\nCPF: " + this.pessoa.getCPF() +
                "\nEmail: " + this.pessoa.getEmail() +
                "\nSaldo: " + Utilities.doubleToString(this.getSaldo()) +
                "\n";
    }

    public void depoisitar(Double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            System.out.println("Seu deposito no valor de:" + valor + "foi realizado com sucesso!");
        }else{
            System.out.println("Nao foi possivel realizar o deposito!");
        }
    }

    public void realizarSaque(Double valor) {
        java.lang.Double valor = valor;
        if (valor > 0 && this.getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de " + valor + "realizado com sucesso!");
        } else {
            System.out.println("Nao foi possivel realizar o saque!");
        }


        public void transferir (Conta contaParaDeposito, Double valor){
            if (valor > 0 && this.getSaldo() >= valor){
                setSaldo(getSaldo() - valor);
                contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;
                System.out.println("Transferencia realizada com sucesso!");
            }else{
                System.out.println("Nao foi possivel realizar a transferencia!");
            }
        }





    }

    public void transferir(Conta contaDestinataria, java.lang.Double valor) {

    }
    }

