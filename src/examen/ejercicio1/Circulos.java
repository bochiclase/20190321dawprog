package examen.ejercicio1;

import java.awt.Color;

public class Circulos extends Figuras {
	
	private double Radio;


	
	public Circulos(Color color, int x, int y, Color relleno, Color borde, double radio) {
		super(color, x, y, relleno, borde);
		this.Radio= radio;
		
	}

	public double TamanoArea() {
		double numero = (float)Math.pow(Radio,2);
		numero = numero * 3.14;
		return numero;
	}  

	public double TamanoPerimetro() {
		double numero = Radio *2;
		numero = numero*3.14;
		return numero;
	}

	
	
	public double getRadio() {
		return Radio;
	}

	public void setRadio(double radio) {
		Radio = radio;
	}

	@Override
	public String toString() {
		return "Circulos [Radio=" + Radio +  "color=" + getColor() + ", x=" + getX() + ", y=" + getY() + ", relleno=" + getRelleno() + ", borde=" + getBorde() + "]";
	}
	
	
	
}
