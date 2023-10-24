package ejerciciodowhile;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//indicamos con la variable int el numero
		int numero=0;
		
		//creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimimos en pantalla que nos escriba un numero
		System.out.println("Escribe un numero");
		
		do {
			System.out.println(""+numero);
			numero+=2;
		} while (numero<=200);
	sc.close();
	
	
	
	}

}
