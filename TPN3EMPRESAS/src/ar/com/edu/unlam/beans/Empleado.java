package ar.com.edu.unlam.beans;

public class Empleado {

	private String nombre;
	private double salario;
	private String fechaDeCumpleaños;
	
	public Empleado() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getFechaDeCumpleaños() {
		return fechaDeCumpleaños;
	}

	public void setFechaDeCumpleaños(String fechaDeCumpleaños) {
		this.fechaDeCumpleaños = fechaDeCumpleaños;
	}


	public String brindarDetalles() {
		return "Empleado [nombre=" + nombre + ", salario=" + salario
				+ ", fechaDeCumpleaños=" + fechaDeCumpleaños + "]";
	}
	
	

}
