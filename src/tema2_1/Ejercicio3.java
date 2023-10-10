package tema2_1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double num1;
		final double num2;
		int opcion;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba el 1º numero");
		
		num1 = sc.nextDouble();
		
		System.out.println("Escriba el 2º numero");
		
		num2 = sc.nextDouble();
		
		System.out.println("Escriba que operación quiere realizar: Sumar [1] Restar [2] Multiplicar [3] Dividir [4]" );
		
		opcion = sc.nextInt();
		
		switch (opcion)  {
		case 1:
			System.out.println("La suma de estos numeros son: " + num1+ num2);
			break;
		case 2:
			System.out.println("La resta de estos numeros son: " + (num1-num2));
			break;
		case 3:
			System.out.println("La multiplicacion de estos numeros son: " + num1*num2);
			break;
		case 4:
			System.out.println("La division de estos numeros son: " + (num1/num2));
			break;
			default:
		
		}
		
		sc.close();
		
		
		
	}

}
