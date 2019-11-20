
public class Linha extends FiguraGeometrica {
	private Ponto a;
	private Ponto b;
	
	public Linha() {
		a = new Ponto();
		b = new Ponto();
	}
	
	public Linha(Ponto a, Ponto b) {
		this.a = new Ponto(a.getX(), a.getY());
		this.b = new Ponto(b.getX(), b.getY());
	}
	
	public Ponto getA() {
		return new Ponto(a.getX(), a.getY());
	}
	
	public void setA(Ponto a) {
		this.a = new Ponto(a.getX(), a.getY());
	}
	
	public Ponto getB() {
		return new Ponto(b.getX(), b.getY());
	}
	
	public void setB(Ponto b) {
		this.b = new Ponto(b.getX(), b.getY());
	}
	
	public Ponto centro() {
		return new Ponto((a.getX()+b.getX())/2,(a.getY()+b.getY())/2);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Linha other = (Linha) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return String.format("[%s; %s]@%x", a, b, System.identityHashCode(this));
	}
	
	@Override
	public float perimetro() {
		return a.distancia(b);
	}
	
	@Override
	public float area() {
		return 0;
	}
	
	@Override
	public float largura() {
		return Math.abs(a.getX() - b.getX());
	}

	@Override
	public float altura() {
		return Math.abs(a.getY() - b.getY());
	}
}