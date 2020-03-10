package BR.USJT.OO;

public class Quadrado extends Poligono implements Diagonal{
	private double area;
	private double perimetro;

	public Quadrado(double base) {
		super(base, base);
		this.area=base*base;
		this.perimetro=4*base;
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
	public double diagonal() {
		return getBase()*Math.sqrt(2);
	}
	
	@Override
	public String toString() {
		return " Quadrado";
	}

}
