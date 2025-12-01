package com.endes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraBasicaTest {
	CalculadoraBasica calculadora

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Prueba la suma de ")
	void testSuma() {
		int resultadoEsperado = 3;
		int resultado = calculadoraBasica(1,2)
				
		assertEquals(resultadoEsperado, resultado, "La suma no es correcta");
	}
	
	@DisplayName("Prueba la resta de ")
	void testResta() {
		int resultadoEsperado = 3;
		int resultado = calculadoraBasica(1,2)
				
		assertEquals(resultadoEsperado, resultado, "La resta no es correcta");

}
