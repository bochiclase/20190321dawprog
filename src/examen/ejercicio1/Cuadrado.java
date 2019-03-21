package examen.ejercicio1;

import java.awt.Color;

public class Cuadrado extends Figuras {
			private double Lado;

			public Cuadrado(Color color, int x, int y, Color relleno, Color borde, double lado) {
				super(color, x, y, relleno, borde);
				this.Lado=lado;
			}
			
			public double tamanoArea() {
				double numero = Math.pow(Lado, 2);
				return numero;
			}
			
			public double tamanoPerimetro() {
				double numero = Lado*4;
				return numero;
			}

			public double getLado() {
				return Lado;
			}

			public void setLado(double lado) {
				Lado = lado;
			}

			@Override
			public String toString() {
				return "Cuadrado [Lado=" + Lado + "color=" + getColor() + ", x=" + getX() + ", y=" + getY() + ", relleno=" + getRelleno() + ", borde=" + getBorde() + "]";
			}
			
			
}
