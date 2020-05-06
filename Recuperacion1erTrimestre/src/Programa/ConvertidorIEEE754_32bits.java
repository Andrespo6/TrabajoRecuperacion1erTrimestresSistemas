package Programa;

import java.util.ArrayList;

/**
 * @author Andrés Peña
 *
 */
public class ConvertidorIEEE754_32bits {
	public static String Convertidor(String mantisa, boolean valor, int exponente) {
		ArrayList<String> IEEE = new ArrayList<String>();
		String binarioString = "";
		if (valor) {
			IEEE.add(Integer.toString(0)+"|");
		} else {
			IEEE.add(Integer.toString(1)+"|");
		}
		
		exponente = exponente+127;
		IEEE.add(BinarioEntero.toBinarioEntero(exponente)+"|");
		int lon = mantisa.length();
		IEEE.add(mantisa);
		while (lon < 23) {
			IEEE.add(Integer.toString(0));
			lon++;
		}
		IEEE.add("|");
		for (int i = 0; i < IEEE.size(); i++) {
			binarioString += IEEE.get(i);
		}
		return binarioString;
	}
}
