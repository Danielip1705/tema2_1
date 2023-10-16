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
		
		//con while declaramos que su el numero es cero, finalize
		while (numero!=0) {
			
			//con if declaramos que si el esto de numero es 0, es par
			if (numero%2==0) {
				System.out.println("El numero es par");
				
				//con else(sino) declaramos que es impar
			} else {
				System.out.println("El numero es impar");
			}
			//escribimos de nuevo el numero
			numero = sc.nextInt();	
		}
		
		//imprimimos en pantalla el fin del bucle
		System.out.println("Fin del bucle");
		sc.close();
	}

}
