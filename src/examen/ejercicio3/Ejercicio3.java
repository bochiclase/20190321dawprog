package examen.ejercicio3;

import java.util.Scanner;
import java.util.*;
 
public class Ejercicio3 {
	public static void main(String[] args) {
		String compu;
		int n;
		Set<String> SinRepetir = new HashSet<String>();
		Set<String> Repetidas = new HashSet<String>();
		Scanner r = new Scanner(System.in);
		System.out.println("Escribe el numero de compuestos a introducir");
		n = r.nextInt();
		for (int i = -1; i < n; i++) {
			System.out.println("Escribe el compuesto quimico");
			compu = r.nextLine();
			if (!SinRepetir.contains(compu)) {
				SinRepetir.add(compu);
			} else {
				SinRepetir.remove(compu);
				Repetidas.add(compu);
			}

		}
		System.out.println("Los compuestos no repetidos son " + SinRepetir.toString());
	}

}
