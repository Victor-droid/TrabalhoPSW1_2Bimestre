
public class NoFila {
	
	NoFila anterior;
	Object obj;

	NoFila() {
		this.anterior = null;
		this.obj = null;
	}

	NoFila(Object obj) {
		this.anterior = null;
		this.obj = obj;
	}

	NoFila(NoFila anterior, Object obj) {
		this.anterior = anterior;
		this.obj = obj;
	}
}
