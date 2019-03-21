package examen.ejercicio1;

import java.awt.Color;

public class Rectangulo extends Figuras {
	private double medida;

	public Rectangulo(Color color, int x, int y, Color relleno, Color borde, double base, double altura) {
		super(color, x, y, relleno, borde);
		this.medida=base*altura;
	
	}
	
	public double TamanoArea() {
		return medida;
	}

	public double TamanoPerimetro(double base, double altura) {
		double numero = (base*2)+(altura*2);
		return numero;
		
	}

	public double getMedida() {
		return medida;
	}

	public void setMedida(double medida) {
		this.medida = medida;
	}

	@Override
	public String toString() {
		return "Rectangulo [medida=" + medida +  "color=" + getColor() + ", x=" + getX() + ", y=" + getY() + ", relleno=" + getRelleno() + ", borde=" + getBorde() + "]";
	}
	
	

}
