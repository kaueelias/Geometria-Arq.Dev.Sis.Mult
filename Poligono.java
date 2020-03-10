package BR.USJT.OO;

public abstract class Poligono extends Figura{
	public static double area;
	private double base;
	private double altura;
	private double baseMenor;
	private double baseMaior;
	private double perimetro;
	
	public Poligono(double base, double altura) {
		this.base=base;
		this.altura=altura;
	}
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}

	public double getBaseMaior() {
		return baseMaior;
	}

	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	
	@Override
	public double area() {
		return 0;
	}
	
	public double perimetro() {
		return 0;
	}
	
	public double diagonal() {
		return 0;
	}
}
