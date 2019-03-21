package examen.ejercicio1;

import java.awt.Color;



public abstract class  Figuras {
	
	private Color color= Color.BLACK;
	private int x;
	private int y;
	private Color relleno =Color.BLUE;
	private Color borde;
	
	

	public Figuras(Color color, int x, int y, Color relleno, Color borde) {
		super();
		this.color = color;
		this.x = x;
		this.y = y;
		this.relleno = relleno;
		this.borde = borde;
	}






	public Color getColor() {
		return color;
	}



	public void setColor(Color color) {
		this.color = color;
	}



	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}



	public Color getRelleno() {
		return relleno;
	}
  


	public void setRelleno(Color relleno) {
		this.relleno = relleno;
	}



	public Color getBorde() {
		return borde;
	}



	public void setBorde(Color borde) {
		this.borde = borde;
	}



	@Override
	public String toString() {
		return "Figuras [color=" + color + ", x=" + x + ", y=" + y + ", relleno=" + relleno + ", borde=" + borde + "]";
	}
	
	
	
	
	
	

}
