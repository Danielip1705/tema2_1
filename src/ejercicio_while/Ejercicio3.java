package ejercicio_while;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
	//indicamos con int suma (que es 0) y numero
	double suma = 0;
	int numero;
	float contador = 0;
				
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
			
			//indicamos con el contador que se sume a si mismo +1
			contador++;
					
			//imprimimos que escriba otro numero positivo y que escriba un numero negativo para salir
			System.out.println("Escriba otro numero positivo. Escriba numero negativo para salir");
			
					
			//escribimos numero
			numero = sc.nextInt();
			
			}
		
		//imprimimos resultado
		System.out.println("La media de los resultado que se ha ido recopilando es: " + suma/contador);
			
		//cerramos scanner
		sc.close();	
	}

		
		
}


