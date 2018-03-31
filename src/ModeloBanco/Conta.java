
package ModeloBanco;

import java.text.DecimalFormat;

public class Conta {
    
    private double saldo;
    private String senha;
    private int numero;
    private int agencia;
    static int quantContas = 0;
    Pessoa pessoa;
    
    DecimalFormat deci = new DecimalFormat("0.00");
    
    public Conta() {
        //super.nome = nome;
        this.agencia = 15;
        quantContas++;
        this.numero=quantContas;
        this.saldo = 0.0;

    }
    

    

   


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public static int getQuantContas() {
        return quantContas;
    }

    public static void setQuantContas(int quantContas) {
        Conta.quantContas = quantContas;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
    
    

    public void dadosBancarios() {

        System.out.println("\nNumero: " + numero);
        //System.out.println("Nome: " + super.nome);
        System.out.println("Nome: "+pessoa);
        System.out.println("Agencia: " + agencia);
        System.out.println("Saldo: " + deci.format(saldo));

    }

    @Override
    public String toString() {
        return "\nNumero: " + numero + 
                "\n" + pessoa + 
                "\nAgencia: " + agencia + 
                "\nSaldo: " + deci.format(saldo); 
                 
                
    }

    
    
    
    

    public void depositar(double valor) {

        this.saldo += valor;

    }

    public void sacar(double valor) {

        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insulficinente");
        }

    }

    public void visualizarSaldo() {

        System.out.println("\nSaldo: " + deci.format(this.saldo));
    }

    public void transferir(Conta trans, double valor) {

        if (valor <= this.saldo) {
            this.saldo -= valor;
            trans.saldo+=valor;
        } else {
            System.out.println("Saldo insulficinente");
        }

}
    
}
