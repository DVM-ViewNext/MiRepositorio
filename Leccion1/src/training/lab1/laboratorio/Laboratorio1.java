package training.lab1.laboratorio;

import java.util.Scanner;

public class Laboratorio1 {

	public static void main(String[] args) {

		//Convertir 100$ a Euros, utilizando variables y operadores.  

		//Explicación: La cantidad de dólares ingresada es 100. 
		//La tasa de cambio entre dólares y euros es de 0.85 euros por dólar. 
		//Por lo tanto, para convertir 100 dólares a euros, multiplicamos 100 por 0.85 

		// Lectura
		Scanner scan = new Scanner(System.in);
		
		// Variables
		float money = scan.nextFloat();
		float cambio = 0.85F;
		float total = money * cambio;
		
		// Consola
		System.out.println(money + " dolares a euro son: " + total + " €");
		
	}

}
