package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.Calculator;
import logica.MiExcepcion;

class CalculadoraTest {
	Calculator calculadora;
	
	@BeforeEach
	void setUp() throws Exception {
		this.calculadora = new Calculator();
	}

	@Test
	void test() {
		try {
			assertEquals(6.0, this.calculadora.calcular(18, 3));
		} catch (MiExcepcion e) {
			assertEquals("No es posible dividir entre cero", e.getMessage());
		}
		
		try {
			assertEquals(6.0, this.calculadora.calcular(18, 0));
		} catch (MiExcepcion e) {
			assertEquals("No es posible dividir entre cero", e.getMessage());
		}
	}

}
