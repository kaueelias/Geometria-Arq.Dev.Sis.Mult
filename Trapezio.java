package BR.USJT.OO;

public class Trapezio extends Poligono {
	private double area;
	private double perimetro;

	public Trapezio(double baseMenor, double baseMaior, double altura) {
		super(baseMenor, baseMaior);
		this.area = ((baseMaior + baseMenor)*altura)/2;
		this.perimetro = baseMaior + baseMenor + 2*(Math.sqrt(Math.pow((baseMaior - baseMenor)/2, 2)+Math.pow(altura, 2)));
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
		return " Trapézio";
	}

}
