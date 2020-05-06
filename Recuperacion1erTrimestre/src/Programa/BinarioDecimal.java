package Programa;

import java.util.ArrayList;

/**
 * @author Andrés Peña
 *
 */
public class BinarioDecimal {
	public static String toBinarioDecimal(double numero) {
		ArrayList<String> binario = new ArrayList<String>();
		String binarioString = "";
		int cont = 0;
		do {
			numero = numero * 2;
			if (numero >= 1 )
				cont = 1;
			else
				cont = 0;
			binario.add(Integer.toString(cont));
		} while (numero % 1 != 0);
		for (int i = 0; i < binario.size()&& i<23 ; i++) {
			binarioString += binario.get(i);
		}
		return binarioString;
	}
}
