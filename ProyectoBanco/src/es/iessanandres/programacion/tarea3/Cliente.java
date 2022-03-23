package es.iessanandres.programacion.tarea3;

public class Cliente {
	private String dni;
	private String nombre;
	private String primerApellido;
	private String segApellido;
	public Cliente(String dni, String nombre, String primerApellido, String segApellido) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segApellido = segApellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegApellido() {
		return segApellido;
	}
	public void setSegApellido(String segApellido) {
		this.segApellido = segApellido;
	}
	
	
	
	
	
}
