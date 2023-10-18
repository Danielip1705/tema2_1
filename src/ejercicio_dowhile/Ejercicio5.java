package ejercicio_dowhile;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Indicamos con int el numero y ordenador
		int numero,ordenador;
		
		//Indicamos con String opciones, mayor(igual a mayor) y menor(igual a menor)
		String opciones;
		String mayor= "mayor";
		String menor="menor";
		
		//creamos scanner
		Scanner sc = new Scanner(System.in);
		//creamos random
		Random rand = new Random();
		
		//ordenador eligira un numero aleatorio entre 1 y 100
		ordenador = rand.nextInt(1,101);
		
		//imprimimos en consola que numero queremos que adivine
		System.out.println("Que numero quieres que adivine el ordenador");
		
		//escribimos el numero
		numero = sc.nextInt();
		
		//indicamos con do que nos imprima en consola las siguietes operaciones
		do {
			//imprimimos en consola el numero que ha elegido el ordenador
			System.out.println("El numero que ha elegido el ordenador es " +ordenador);
			
			//imprimimos en consola si el numero elegido es correcto
			System.out.println("¿Es ese el correcto?");
			//escribimos opciones
			opciones = sc.next();
			
			//con if declaramos que si opciones a escrito mayor, que el ordenador eliga entre el numero pensado y el 101
			if (opciones.equalsIgnoreCase(mayor)) {
				ordenador = rand.nextInt(numero,101);
				
			//con else if declaramos que si opciones a escrito menor, que el ordenador eliga entre el 1 y el numero pensado
			} else if (opciones.equalsIgnoreCase(menor)) {
				ordenador = rand.nextInt(1,numero);
			}
		//con while declaramos que el bucle termina si se ha escrito igual
		} while (!opciones.equalsIgnoreCase("Igual"));
		
		//imprimimos en consola que se ha terminado el juego
		System.out.println("Juego Terninado");
		
		//cerramos scanner
		sc.close();
		
		
	}

}
