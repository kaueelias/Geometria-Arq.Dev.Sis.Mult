package BR.USJT.OO;

public class Esfera extends Tresde{
	private double volume;
	
	public Esfera(double raio) {
		this.volume = (4*Math.PI*Math.pow(raio, 3))/3;
	}

	@Override
	public double volume() {
		return volume;
	}
	
	@Override
	public String toString() {
		return " Esfera";
	}

}