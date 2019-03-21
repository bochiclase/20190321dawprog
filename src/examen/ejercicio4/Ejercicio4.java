package examen.ejercicio4;

import java.util.*;
import java.util.Scanner;

public class Ejercicio4 { 

	public static void main(String[] args) {
		Set<Character> almacen = new HashSet<Character>();
		Map <String,String> agenda = new HashMap <String,String>();
		String cadena;
		char c ;
		Scanner r = new Scanner(System.in);
		do {
		System.out.print("Inroduce la cadena");
		cadena = r.nextLine();
		for (int i = 0; i < cadena.length(); i++) {
			 c= cadena.charAt(i);
			 almacen.add(c);
		}
			if (almacen.contains('-')) {
				String[] partes = cadena.split("-");
				String  nombre = partes[0]; 
				String numero = partes[1]; 
				agenda.put(nombre,numero);
				if (agenda.containsKey(nombre)) {
					agenda.remove(nombre);
					agenda.put(nombre, numero);
				}
				else {
					agenda.put(nombre, numero);
				}
			}
			if (almacen.contains(':')) {
				String[] partes2 = cadena.split(":");
				String  simbolo = partes2[0]; 
				String contacto = partes2[1]; 
				System.out.println(agenda.get(contacto));
			}
		

	}while(cadena!="exit");
	}
}
