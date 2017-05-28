package ar.com.edu.unlam.beans;

public class Empleado {

	private String nombre;
	private double salario;
	private String fechaDeCumpleaņos;
	
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

	public String getFechaDeCumpleaņos() {
		return fechaDeCumpleaņos;
	}

	public void setFechaDeCumpleaņos(String fechaDeCumpleaņos) {
		this.fechaDeCumpleaņos = fechaDeCumpleaņos;
	}


	public String brindarDetalles() {
		return "Empleado [nombre=" + nombre + ", salario=" + salario
				+ ", fechaDeCumpleaņos=" + fechaDeCumpleaņos + "]";
	}
	
	

}
