
public class Pilha {
    
    private Object[] pilha;
    private int posPilha;
 
    public Pilha() {
        this.posPilha = -1;
        this.pilha = new Object[1000];
    }
 
    public boolean pilhaVazia() {
        if (this.posPilha == -1) {
            return true;
        }
        return false;
    }
 
    public int tamanho() {
        if (this.pilhaVazia()) {
            return 0;
        }
        return this.posPilha + 1;
    }
 
    public Object exibeUltimoValor() {
        if (this.pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posPilha];
    }
 
    public Object desempilhar() {
        if (pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posPilha--];
    }
 
    public void empilhar(Object valor) {
        if (this.posPilha < this.pilha.length - 1) {
            this.pilha[++posPilha] = valor;
        }
    }
}
