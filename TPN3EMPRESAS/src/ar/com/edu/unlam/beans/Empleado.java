package ar.com.edu.unlam.beans;

public class Empleado {

	private String nombre;
	private double salario;
	private String fechaDeCumplea�os;
	
	public Empleado(String nombre, double salario, String fechaDeCumplea�os) {
		this.nombre = nombre;
		this.salario = salario;
		this.fechaDeCumplea�os = fechaDeCumplea�os;
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

	public String getFechaDeCumplea�os() {
		return fechaDeCumplea�os;
	}

	public void setFechaDeCumplea�os(String fechaDeCumplea�os) {
		this.fechaDeCumplea�os = fechaDeCumplea�os;
	}


	public String brindarDetalles() {
		return "Empleado [nombre=" + nombre + ", salario=" + salario
				+ ", fechaDeCumplea�os=" + fechaDeCumplea�os + "]";
	}
	
	

}
