
public class AplicacaodaPilha {

	public static void main(String[] args) {
		Pilha p = new Pilha();
		p.empilhar(5);
        p.empilhar(10);
        p.empilhar(19);
        while (p.pilhaVazia() == false) {
            System.out.println(p.desempilhar());
        }
	}

}
