package ejercicio_dowhile;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//indicamos con la variable int el numero
		int numero;
		
		//creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimimos en pantalla que escriba un numero
		System.out.println("Escribe el numero");
		
		//escribimos el numero
		numero = sc.nextInt();
		
		//indicamos con do que nos imprima el numero y que se sume
		do {
			System.out.println("" +numero);
			numero++;
			
			//mientras que numero es menor que 20, sique el bucle
		} while (numero<=20);
		
	
	}

}
