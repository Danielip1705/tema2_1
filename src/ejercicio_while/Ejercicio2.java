package ejercicio_while;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//indicamos con int suma(que es igual a 0) y numero
		int suma=0;
		int numero;
		
		//creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimimos en consola que nos escriba un numero positivo y un numero negativo para salir
		System.out.println("Escribe un numero positivo. Escribe un numero negativo para salir");
		
		//escribimos el numero
		numero = sc.nextInt();
		
		//indicamos con while, que si numero es mayor igual a 0, que siga el bucle
		while (numero>=0) {
			
			//indicamos que los numeros que ponga el usuario se sume con suma
			suma += numero;
			
			//imprimimos los numeros sumados que ha colocado el usuario
			System.out.println("Numeros sumados por el usuario: " +suma);
			
			//imprimimo un espacio para que se vea mejor en la consola
			System.out.println(" ");
			
			//imprimimos en consola que nos escriba un numero positivo y un numero negativo para salir
			System.out.println("Escribe un numero positivo. Escribe un numero negativo para salir");
			
			//escribimos numero
			numero = sc.nextInt();
		}
		//imprimimos en consola el resultado que hemos ido recopilando del bucle
		System.out.println("El resultado es: " +suma);
		
		//cerramos scanner
		sc.close();
	}

}
