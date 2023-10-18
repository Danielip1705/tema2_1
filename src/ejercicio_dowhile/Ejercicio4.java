package ejercicio_dowhile;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//declaramos con int numero, por (que es igual a 1) y resultado
		int numero, por=1, resultado;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserte un numero");
		
		numero = sc.nextInt();
		
		do {
			resultado = numero*por;
			System.out.println(+numero+"x" +por+ "="+resultado);
			por++;
			
			
		} while (por<=10);
		
		sc.close();
		
		
		
	}

}
