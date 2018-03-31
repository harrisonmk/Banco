package ModeloBanco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Banco lista = new Banco();
        Pessoa p;
        Conta c = null;
        String msg;

        int opcao;

        while (true) {
            Pessoa.menu();
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {

                case 1: //

                    System.out.print("\nDigite seu nome: ");
                    String nome = scan.nextLine();
                    p = new Pessoa();
                    p.setNome(nome);
                    System.out.print("Digite uma senha: ");
                    String senha = scan.next();
                    c = new Conta();

                    c.setPessoa(p);
                    c.setSenha(senha);

                    lista.adiciona(c);

                    break;

                case 2:

                    System.out.println("\nDigite o numero da conta:");
                    int nume = scan.nextInt();
                    Conta k = null;

                    for (int i = 0; i < lista.tamanho(); i++) {
                        Conta pu = lista.pega(i);

                        if (nume == pu.getNumero()) {
                            k = pu;
                            System.out.println(k);
                            break;
                        } else {
                            k = null;
                        }
                    }

                    msg = (k != null) ? "Transação realizada\n" : "Conta nao cadastrada";
                    System.out.println("\n" + msg);

                    break;

                case 3:
                    System.out.println("\nDigite o numero da conta:");
                    int numeto = scan.nextInt();

                    Conta j = null;

                    for (int i = 0; i < lista.tamanho(); i++) {
                        Conta pu = lista.pega(i);

                        if (numeto == pu.getNumero()) {
                            j = pu;
                            j.visualizarSaldo();
                            break;
                        } else {
                            j = null;
                        }
                    }

                    msg = (j != null) ? "Transação realizada\n" : "Conta nao cadastrada";
                    System.out.println("\n" + msg);

                    break;
                case 4:
                    System.out.println("\nDigite o numero da conta:");
                    int numero = scan.nextInt();
                    Conta t = null;

                    for (int i = 0; i < lista.tamanho(); i++) {
                        Conta pu = lista.pega(i);

                        if (numero == pu.getNumero()) {
                            t = pu;
                            System.out.print("Digite o valor do deposito: ");
                            double dinheiro = scan.nextDouble();
                            t.depositar(dinheiro);

                            break;
                        } else {
                            t = null;
                        }
                    }
                    msg = (t != null) ? "Deposito Realizado Com Sucesso\n" : "Conta nao cadastrada";
                    System.out.println("\n" + msg);

                    break;
                case 5:
                    System.out.println("\nDigite o numero da conta:");
                    int numero1 = scan.nextInt();
                    Conta ta = null;

                    for (int i = 0; i < lista.tamanho(); i++) {
                        Conta pu = lista.pega(i);

                        if (numero1 == pu.getNumero()) {
                            ta = pu;
                            System.out.print("Digite o valor do deposito: ");
                            double dinheiro1 = scan.nextDouble();

                            ta.sacar(dinheiro1);

                            break;
                        } else {
                            ta = null;
                        }
                    }

                    msg = (ta != null) ? "Saque Realizado Com Sucesso\n" : "Conta nao cadastrada";
                    System.out.println("\n" + msg);

                    break;
                case 6:
                    System.out.println("\nDigite o numero da conta de origem: ");
                    int numero2 = scan.nextInt();

                    Conta din = lista.pega(numero2 - 1);

                    System.out.println("\nDigite o numero da conta de Destino: ");
                    int numero3 = scan.nextInt();

                    Conta money = lista.pega(numero3 - 1);

                    System.out.println("Digite o valor da Transferencia:");
                    double valorMoney = scan.nextDouble();

                    din.transferir(money, valorMoney);
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("opcao Invalida:");
                    break;

            }

        }

    }

}
