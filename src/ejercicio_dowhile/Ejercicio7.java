package ejercicio_dowhile;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1;
		double num2;
		String opcion;
		String Sumar="A";
		String Restar="B";
		String Mult="C";
		String Div="D";
		String Rendirse="E";
		Scanner sc = new Scanner(System.in);

		
		do {
			System.out.println("Escriba el 1º numero");

			num1 = sc.nextDouble();

			System.out.println("Escriba el 2º numero");

			num2 = sc.nextDouble();

			System.out.println(
					"Escriba que operación quiere realizar: Sumar [A] Restar [B] Multiplicar [C] Dividir [D] Rendirse [E]");

			opcion = sc.next();
			if (opcion.equalsIgnoreCase(Sumar)) {
				System.out.println("La suma de estos dos numeros es " + (num1+num2));
			} else if (opcion.equalsIgnoreCase(Restar)) {
				System.out.println("La resta de estos dos numeros es " + (num1-num2));
			}else if (opcion.equalsIgnoreCase(Mult)) {
				System.out.println("La resta de estos dos numeros es " + (num1*num2));
				
			} else if (opcion.equalsIgnoreCase(Div)){
				System.out.println("La resta de estos dos numeros es " + (num1/num2));
			}
			
		} while (!opcion.equalsIgnoreCase(Rendirse));
		System.out.println("FIN");
		sc.close();
	}

}
