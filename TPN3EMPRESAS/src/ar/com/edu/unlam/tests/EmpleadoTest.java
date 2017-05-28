package ar.com.edu.unlam.tests;

import org.junit.Test;

import ar.com.edu.unlam.beans.Empleado;

public class EmpleadoTest {

	public EmpleadoTest() {
	}

	@Test
	public void testearDetallesEmpleado(){
		Empleado miEmpleado = new Empleado();
		miEmpleado.setNombre("Edu");
		miEmpleado.setSalario(12000.0);
		miEmpleado.setFechaDeCumpleaños("25-12-1990");
		
		System.out.println(miEmpleado.brindarDetalles());
		
		
//		CuentaSueldo cuentaSueldo = new CuentaSueldo(5000.0);
//		cuentaSueldo.extraer(2000.0);
//		
//		Double valorEsperado = 3000.0;
//		Double valorActual = cuentaSueldo.getDineroDisponible();
//		
//		Assert.assertEquals(valorEsperado, valorActual);
	}
}
