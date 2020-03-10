package BR.USJT.OO;

public class Triangulo extends Poligono {
	private double area;
	private double perimetro;

	public Triangulo(double base, double altura) {
		super(base, altura);
		this.area=(base*altura)/2;
		this.perimetro=(Math.sqrt(Math.pow(base, 2)+Math.pow(altura, 2)))+base+altura;
	}

	@Override
	public double area() {
		//(base*altura)/2
		return area;
	}
	
	@Override
	public String toString() {
		return "Triangulo";
	}
	
	@Override
	public double perimetro() {
		return perimetro;
	}
}