package ejercicio_while;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//indicamos con int numero
		int numero;
		//creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimimos en consola que escriba un numero
		System.out.println("Escriba un numero");
		
		//escribimos el numero 
		numero = sc.nextInt();
		
		//in
		while (numero!=0) {
			if (numero%2==0) {
				System.out.println("El numero es par");
			} else {
				System.out.println("El numero es impar");
			}
			
			numero = sc.nextInt();	
		}
		System.out.println("Fin del bucle");
		sc.close();
	}

}
