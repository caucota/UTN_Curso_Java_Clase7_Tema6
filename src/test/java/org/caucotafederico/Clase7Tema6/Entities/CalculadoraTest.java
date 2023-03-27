package org.caucotafederico.Clase7Tema6.Entities;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void test1_probarLaMultiplicacion() {
		Double nro1 = 80.0;
		Double nro2 = 3.0;
		Double rtdoEsperado = 240.0;
		
		assertEquals(rtdoEsperado, Calculadora.multiplicar(nro1, nro2));
		
		
	}
	
	@Test
	public void test2_probarLaSumayDivision() {
		Double nro1 = 150.0;
		Double nro2 = 180.0;
		Double rtdoParcial = 0.0;
		Double rtdoEsperado = 110.0;
		
		rtdoParcial = Calculadora.sumar(nro1, nro2);
		rtdoParcial = Calculadora.dividir(rtdoParcial, 3.0);
		
		assertEquals(rtdoEsperado, rtdoParcial);
	}
	
	@Test
	public void test3_probarLaRestaYMultiplicacion() {
		Double nro1 = 90.0;
		Double nro2 = 50.0;
		Double rtdoParcial = 0.0;
		Double rtdoEsperado = 605.0;
		
		rtdoParcial = Calculadora.restar(nro1, nro2);
		rtdoParcial = Calculadora.multiplicar(rtdoParcial, 15.0);
		
		assertEquals(rtdoEsperado, rtdoParcial);
	}
	
	@Test
	public void test4_probarLaSumaYMultiplicacion() {
		Double nro1 = 70.0;
		Double nro2 = 40.0;
		Double rtdoParcial = 0.0;
		Double rtdoEsperado = 2700.0;
		
		rtdoParcial = Calculadora.sumar(nro1, nro2);
		rtdoParcial = Calculadora.multiplicar(rtdoParcial, 25.0);
		
		assertEquals(rtdoEsperado, rtdoParcial);
	}

}
