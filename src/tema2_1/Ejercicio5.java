package tema2_1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String carnet;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el carnet que tengas");
	
		carnet = sc.next();
		
		switch (carnet) {
		case "E":
			System.out.println("Puedes conducir remolques");
			break;
		case"D":
			System.out.println("Puedes conducir autobuses");
			break;
		case "C1","C2","C3","C4","C5":
			System.out.println("Puedes conducir camiones");
		break;
		case "A":
			System.out.println("Puedes conducir motocicletas");
			break;
		case "B1","B2":
			System.out.println("Puedes conducir automóviles");
		break;
		default:
			System.out.println("Su carnet no es el correcto");
	
		}

		sc.close();
		
		
		
		
		
		
	}

}
