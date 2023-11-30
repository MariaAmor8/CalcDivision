package logica;

public class Calculator {
	
	 public double calcular(double numerador, double denominador)throws MiExcepcion {
		 if(denominador == 0) {
			 throw new MiExcepcion("No es posible dividir entre cero");
		 }
		 else {
			 double resultado = numerador/denominador;
			 return resultado;
		 }
	 }
}
