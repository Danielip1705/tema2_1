package ejercicio_dowhile;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tijera="tijera";
		String piedra="piedra";
		String papel="papel";
		String player1;
		String player2;
		String rendicion="S";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Jugador1, eliga piedra,papel o tijera");
		player1 = sc.next();
		
		System.out.println("Jugador2, eliga piedra,papel o tijera");
		player2 = sc.next();
		
		do {
			if (player1==player2) {
				System.out.println("EMPATE");
			}else if (player1.equalsIgnoreCase(papel)&&player2.equalsIgnoreCase(piedra)){
			} else if(player1.equalsIgnoreCase(piedra)&&player2.equalsIgnoreCase(tijera)) {
			} else if (player1.equalsIgnoreCase(tijera)&&player2.equalsIgnoreCase(papel)) {
				System.out.println("Gana jugador1");
			} else {
				System.out.println("Gana jugador2");
			}
				
		} while (player1==rendicion&&player2==rendicion);
		
		
		
		
		
		
	}

}
