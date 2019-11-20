
public class Retangulo extends FiguraGeometrica {
	private Ponto a;
	private Ponto b;
	
	public Retangulo(Ponto a, Ponto b) {
		super();
		this.a = new Ponto(a.getX(), a.getY());
		this.b = new Ponto(b.getX(), b.getY());
	}
	
	public Retangulo() {
		this.a = new Ponto();
		this.b = new Ponto();
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
		return new Ponto((a.getX()+b.getX())/2, (a.getY()+b.getY())/2);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Retangulo other = (Retangulo) obj;
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
		return "{" + a + "; " + b + "}";
	}
	
	@Override
	public float area() {
		return altura() * largura();
	}
	
	@Override
	public float largura() {
		return Math.abs(a.getX() - b.getX());
	}
	
	@Override
	public float altura() {
		return Math.abs(a.getY() - b.getY());
	}

	@Override
	public float perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
}
