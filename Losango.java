package BR.USJT.OO;

public class Losango extends Poligono{
	private double area;
	private double perimetro;

	public Losango(double base, double altura) {
		super(base, altura);
		this.area=(base*altura)/2;
		this.perimetro = Math.sqrt(Math.pow(base/2, 2)+Math.pow(altura/2, 2))*4;
	}

	@Override
	public double area() {
		return area;
	}
	
	@Override
	public double perimetro() {
		return perimetro;
	}
	
	@Override
	public String toString() {
		return " Los�ngo";
	}
}
