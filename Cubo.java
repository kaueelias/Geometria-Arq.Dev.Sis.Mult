package BR.USJT.OO;

public class Cubo extends Tresde{
	private double volume;
	
	public Cubo(double base) {
		this.volume = base*base*base;
	}
	
	@Override
	public double volume() {
		return volume;
	}
	
	@Override
	public String toString() {
		return " Cubo";
	}

}
