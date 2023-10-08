package tema2_1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double num1;
		final double num2;
		int resultado;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba el 1º numero");
		
		num1 = sc.nextDouble();
		
		System.out.println("Escriba el 2º numero");
		
		num2 = sc.nextDouble();
		
		
		switch (num1)  {
		case 1:
			System.out.println("La suma de estos numeros son: " + num1+num2);
		case 2:
			System.out.println("La resta de estos numeros son: " + num1-num2);
		
		}
		
		
		
		
		
	}

}
