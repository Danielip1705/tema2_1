package ejerciciowhile;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//indicamos con int suma (que es 0) y numero
		int suma = 0;
		int numero;
		
		//creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimimos en consola que escriba numero positivo y negativo
		System.out.println("Escriba el numero positivo. Escriba numero negativo para salir");
		
		//escribimos el numero
		numero = sc.nextInt();
		
		//creamos un bucle con while, el bucle seguira si numero es menor que 0
		while (numero>=0) {
			//hacemos que la variable suma vaya sumando los numeros que pongamos
			suma += numero;
			
			//imprimimos que escriba otro numero positivo y que escriba un numero negativo para salir
			System.out.println("Escriba otro numero positivo. Escriba numero negativo para salir");
			
			//escribimos numero
			numero = sc.nextInt();
		}
		//imprimimos resultado
		System.out.println("El resultado de la suma es: " + suma);
		
		//cerramos scanner
		sc.close();	
	}

}
