package training.lab1;

import java.util.Locale;
import java.util.UUID;

public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Concatenaci�n de varias cadenas
		String myName = "Hello World, " + "Mi nombre es Daniel";	
		System.out.println(myName);
		
		// Longitud de una cadena
		System.out.println("Hello World".length());
		
		// Convertir a min�scula y may�scula
		System.out.println("Hello World".toLowerCase(Locale.ROOT));
		System.out.println("Hello World".toUpperCase(Locale.ROOT));
		
		// Extraer una parte de la cadena a partir de una posici�n determinada
		String firstSubstring = "Hellow World";
		String secondSubstring = firstSubstring.substring(1, 8);
		System.out.println(secondSubstring);
		
		// Seleccionando un car�cter espec�fico indicando su posici�n
		char myChar = "Hellow World".charAt(4);
		System.out.println(myChar);
		
		// Escape sequences
		System.out.println("Escape sequences --- " + "Hello\nWorld");
		
		// Validado si una cadena es igual a otra. El metodo equals devuelve true o false
		boolean equalsOrNot = "This is Jamie".equals("This is Jamie");
		boolean equalsOrNot2 = "This is Jamie".equals("Hello world");
		System.out.println(equalsOrNot);
		
		
		String names = "Peter, John, Andy, David";
		//El array es asignado a la variable splitNames.
		String[] splitNames = names.split(", ");

		System.out.println(splitNames[0]);
		System.out.println(splitNames[2]);
		
	}

}
