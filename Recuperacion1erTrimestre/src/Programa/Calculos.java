package Programa;

/**
 * @author Andrés Peña
 *
 */
public class Calculos {
	public static String toNotacionCientifica(String numero, int DecimalesDelNumero) {
		String binarioString = "";
		
		String[] binario = numero.split("");
		for (int i = 0; i < binario.length && i<=23; i++) {
			if (i == 0) {
			} else {
				binarioString += binario[i];
			}
		}
		int exp = numero.length()-1-DecimalesDelNumero;
		
		return binarioString;
	}
	
	public static int saberDecimalesDelNumero(String string) {
		return string.length();
	}
	
	public static int saberExponente(String numero) {
		int exp = numero.length()-1;
		return exp;
	}
	
	 public static double redondearDecimales(double numero, int digitos) {
		 double resultado;
	        resultado = numero * Math.pow(10, digitos);
	        resultado = Math.round(resultado);
	        resultado = resultado/Math.pow(10, digitos);
	        return resultado;
	    }
}