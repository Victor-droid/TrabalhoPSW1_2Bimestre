
public class Fila {

	NoFila inicio;
	NoFila fim;
	int tamanho;

	public Fila() {
		inicio = null;
		fim = null;
		tamanho = 0;
	}

	public boolean Vazia() {
		if (tamanho == 0) return true;
		else return false;
	}
	
	public int Tamanho() { 
		return tamanho;
	}

	public void Inserir(Object obj) {
		NoFila no = new NoFila(obj);
		if (tamanho == 0) { 
			inicio = no;
			fim = no;
			tamanho++;
		}
		else {
			fim.anterior = no;
			no.anterior = null;
			tamanho++;
		}
	}

	public NoFila Remover() {
		if (tamanho > 0) {
			NoFila no = fim;
			fim = no.anterior;
			tamanho--;
			return no;
		}
		else return null;
	}
}
