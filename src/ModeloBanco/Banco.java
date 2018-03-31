
package ModeloBanco;

/**
 *
 * @author Harrison
 */
public class Banco {
    
    // Declarando e Inicializando um array de Conta com capacidade 100.
    private Conta[] contas = new Conta[100];
    private int totalContas = 0;
    
    

    

    public void adiciona(Conta aluno) {

        this.contas[this.totalContas] = aluno;
        this.totalContas++;

    }



 
public Conta pega(int posicao) {
    if (!this.posicaoOcupada(posicao)) {
      throw new IllegalArgumentException("Posição inválida");
    }
    return this.contas[posicao];
  }



  public void remove(int posicao) {
      
      if (!this.posicaoOcupada(posicao)) {
      throw new IllegalArgumentException("Posição inválida");
    }
    for (int i = posicao; i < this.totalContas- 1; i++) {
      this.contas[i] = this.contas[i + 1];
    }
    this.totalContas--;
  }

  private boolean posicaoOcupada(int posicao) {
    return posicao < this.contas.length && posicao >= 0;
  }
    
  
    public boolean contem(Conta aluno) {
        for (int i = 0; i < this.totalContas; i++) {
            if (aluno.equals(this.contas[i])) {
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return this.totalContas;
}
    
}
