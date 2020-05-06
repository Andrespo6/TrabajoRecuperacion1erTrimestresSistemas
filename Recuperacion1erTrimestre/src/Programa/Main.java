package Programa;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author Andr�s Pe�a
 *
 */
public class Main {
	public static String ResIEEE = "";
	public static double Numero = 0;
	public static void CodigoRun() {
		System.out.println("Documento creador por:\r\n" + 
				"Andr�s Pe�a Ortega\r\n" + 
				"1� DAM.\r\n" + 
				"\r\n" + 
				"// Este programa tiene un margen de error sujeto al tama�o maximo que soportan los formatos\r\n" + 
				"de n�mero, Integer, Double, Long... ninguno soporta m�s de 19 caracteres siendo Long el m�s\r\n" + 
				"largo.//");
		BigDecimal bd = new BigDecimal(Numero);
		bd = bd.setScale(6, RoundingMode.HALF_UP);
		double numero = bd.doubleValue();
		boolean valor;
		if (numero < 0) {
			valor = false;
			numero = numero*-1;
		} else {
			valor = true;
		}
		double decimal = numero % 1;
		bd = new BigDecimal(decimal);
		bd = bd.setScale(6, RoundingMode.HALF_UP);
		decimal = bd.doubleValue();
		int entero = (int)Math.round(numero - decimal);
		String Resultado = (BinarioEntero.toBinarioEntero(entero)+"."+BinarioDecimal.toBinarioDecimal(decimal));
		int exponente = Calculos.saberExponente(BinarioEntero.toBinarioEntero(entero));
		String mantisa = Calculos.toNotacionCientifica(BinarioEntero.toBinarioEntero(entero)+BinarioDecimal.toBinarioDecimal(decimal),exponente);
		ResIEEE = ConvertidorIEEE754_32bits.Convertidor(mantisa, valor, exponente);
	}
}