package training.lab1.laboratorio;

import java.util.Scanner;

public class Laboratorio1 {

	public static void main(String[] args) {

		//Convertir 100$ a Euros, utilizando variables y operadores.  

		//Explicaci�n: La cantidad de d�lares ingresada es 100. 
		//La tasa de cambio entre d�lares y euros es de 0.85 euros por d�lar. 
		//Por lo tanto, para convertir 100 d�lares a euros, multiplicamos 100 por 0.85 

		// Lectura
		Scanner scan = new Scanner(System.in);
		
		// Variables
		float money = scan.nextFloat();
		float cambio = 0.85F;
		float total = money * cambio;
		
		// Consola
		System.out.println(money + " dolares a euro son: " + total + " �");
		
	}

}
