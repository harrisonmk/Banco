
package ModeloBanco;


public class Pessoa {
    
    public String nome;
    private  String date;
    private char sexo;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public static void menu(){
        
     System.out.println("\n******MENU*******");
     System.out.println("1 criar contas");
     System.out.println("2 Dados Bancarios");
     System.out.println("3 visualizar saldo");
     System.out.println("4 Deposito");
     System.out.println("5 Sacar");
     System.out.println("6 Transferencia");
     System.out.println("0 Sair.");
     System.out.print("Opcao: ");
        
        
    }

    @Override
    public String toString() {
        return "Nome: " + nome; 
                //"\nData de Nascimento: " + date + 
                //"\nSexo: " + sexo + 
                //"\nCpf: " + cpf;
}
    
}
