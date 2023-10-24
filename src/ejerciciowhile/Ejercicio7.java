package ejerciciowhile;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		int secreto;
		
		Scanner sc = new Scanner(System.in);
		
		Random rand = new Random();
		
		secreto = rand.nextInt(101);
		
		System.out.println("Escriba el numero");
		
		numero = sc.nextInt();
		
		while (numero!=secreto&&numero>=-1) {
			
			if (numero>secreto){
				System.out.println("El numero es mayor que el numero secreto");
				
			} else if (numero<secreto) {
				System.out.println("El numero es menor que el numero secreto");
			}
			System.out.println("Escriba el numero de nuevo");
			numero = sc.nextInt();
		}
		System.out.println("Has ganado");
		System.out.println("Fin del juego");
		sc.close();
		
	}

}
