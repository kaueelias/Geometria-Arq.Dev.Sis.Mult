package BR.USJT.OO;

public class Piramide extends Tresde{
	private double volume;
	
	public Piramide(double base, double altura) {
		this.volume = (base*base*altura)/3;
	}

	@Override
	public double volume() {
		return volume;
	}
	
	@Override
	public String toString() {
		return " Pirâmide";
	}

}
