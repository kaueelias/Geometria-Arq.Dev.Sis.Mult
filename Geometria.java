package BR.USJT.OO;

import java.util.ArrayList;

public class Geometria {
	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<>();
		figuras.add(new Circulo(3.0));
		figuras.add(new Quadrado(4.0));
		figuras.add(new Retangulo(6.0, 7.0));
		figuras.add(new Losango(8.0, 9.0));
		figuras.add(new Triangulo(10.0, 11.0));
		figuras.add(new Trapezio(6.0, 4.0, 2));
		
		for(Figura fig:figuras){
			System.out.println(fig);
			System.out.println(" Area = "+fig.area()+ "\n Perímetro = "+fig.perimetro());
			if(fig instanceof Diagonal){
				System.out.println(" Diagonal = "+((Diagonal)fig).diagonal());
			}
			System.out.println("|-----------------------------|");
		}
		
		ArrayList<Tresde> tresD = new ArrayList<>();
		tresD.add(new Cubo(1.0));
		tresD.add(new Piramide(2.0, 3.0));
		tresD.add(new Esfera(4.0));
		tresD.add(new Cilindro(5.0, 6.0));
		
		for(Tresde DDD:tresD) {
			System.out.println(DDD);
			System.out.println(" Volume = "+DDD.volume());
			System.out.println("|-----------------------------|");
		}
	}
}