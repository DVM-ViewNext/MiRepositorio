package training.lab1.laboratorio;

import java.util.Scanner;

public class Laboratorio3 {

	public static void main(String[] args) {

		/*Laboratorio 3
		----------------

		Calculo de IMC

		Escribe un programa en Java que calcule el índice de masa corporal (IMC) de una persona.

		Formula IMC = peso / altura^2.


		IMC menor a 18.5: Bajo peso
		IMC entre 18.5 y 24.9: Peso normal
		IMC entre 25 y 29.9: Sobrepeso
		IMC mayor o igual a 30: Obesidad

		Supongamos que un usuario pesa  80 kilogramos y su altura 
		es de 1.75 metros*/
		
		// Lectura
		System.out.print("Introduce peso: ");
		float peso = new Scanner(System.in).nextFloat();
		
		System.out.print("Introduce altura: ");
		float altura = new Scanner(System.in).nextFloat();
		
		float imc = peso / (altura*2);
	
		if(imc < 18.5) {
			System.out.println("Bajo peso");
		} else if(imc > 18.5 && imc < 24.9) {
			System.out.println("Peso normal");
		} else if(imc > 25 && imc < 29.9) {
			System.out.println("Sobrepeso");
		} else if(imc >= 30) {
			System.out.println("Obesidad");
		}
		

	}

}
