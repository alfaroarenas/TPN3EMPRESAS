package ar.com.edu.unlam.tests;

import org.junit.Assert;
import org.junit.Test;

import ar.com.edu.unlam.beans.Empleado;
import ar.com.edu.unlam.beans.Gerente;
import ar.com.edu.unlam.beans.Ingeniero;
import ar.com.edu.unlam.beans.Secretaria;
import ar.com.edu.unlam.beans.ServicioImpuesto;

public class EmpleadoTest {

	@Test
	public void testParaMostrarElDetalleDeLosEmpleado(){
		Empleado miEmpleadoGerente = new Gerente("PEPE",20000.0,"25-1-1980");
		System.out.println(miEmpleadoGerente.brindarDetalles());
		
		Empleado miEmpleadoIngeniero = new Gerente("PEPO",15000.0,"25-1-1960");
		System.out.println(miEmpleadoIngeniero.brindarDetalles());
		
		Empleado miEmpleadaSecretaria = new Gerente("PEPA",10000.0,"25-1-1930");
		System.out.println(miEmpleadaSecretaria.brindarDetalles());
	}
	
	@Test
	public void testearLosImpuestosALosGerentes(){
		Empleado miEmpleadoGerente = new Gerente("PEPE",20000.0,"25-1-1980");

		ServicioImpuesto miImpuesto = new ServicioImpuesto();

		Double valorEsperado = 25000.0;
		Double valorActual = miImpuesto.obtenerImpuestos(miEmpleadoGerente);
		
		Assert.assertEquals(valorEsperado, valorActual);
	}
	
	
	@Test
	public void testearLosImpuestosALosIngenieros(){
		Empleado miEmpleadoGerente = new Ingeniero("PEPO",15000.0,"25-1-1960");

		ServicioImpuesto miImpuesto = new ServicioImpuesto();

		Double valorEsperado = 15000.0;
		Double valorActual = miImpuesto.obtenerImpuestos(miEmpleadoGerente);
		
		Assert.assertEquals(valorEsperado, valorActual);
	}
	
	
	@Test
	public void testearLosImpuestosALasSecretarias(){
		Empleado miEmpleadoGerente = new Secretaria("PEPA",10000.0,"25-1-1930");
		
		ServicioImpuesto miImpuesto = new ServicioImpuesto();

		Double valorEsperado = 10000.0;
		Double valorActual = miImpuesto.obtenerImpuestos(miEmpleadoGerente);
		
		Assert.assertEquals(valorEsperado, valorActual);
	}
}
