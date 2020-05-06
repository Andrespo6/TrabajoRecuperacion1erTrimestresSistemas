package Programa;

import java.util.ArrayList;

/**
 * @author Andrés Peña
 *
 */
public class BinarioEntero {
	public static String toBinarioEntero(int numero) {
		ArrayList<String> binario = new ArrayList<String>();
		int resto;
		double num = numero;
		String binarioString = "";

		do {
			resto = (int)num % 2;
			num = num / 2;
			binario.add(0, Integer.toString(resto));
		} while (num > 1);
		binario.add(0, Integer.toString((int)num));
		for (int i = 0; i < binario.size(); i++) {
			binarioString += binario.get(i);
		}
		return binarioString;
	}
}
