package BR.USJT.OO;

public class Cilindro extends Tresde{
	private double volume;
	
	public Cilindro(double raio, double altura) {
		this.volume = Math.PI*Math.pow(raio, 2)*altura;
	}

	@Override
	public double volume() {
		return volume;
	}
	
	@Override
	public String toString() {
		return " Cilindro";
	}

}