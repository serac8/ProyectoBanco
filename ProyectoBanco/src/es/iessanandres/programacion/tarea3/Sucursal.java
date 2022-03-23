package es.iessanandres.programacion.tarea3;

public class Sucursal {
	
	private String pais;
	private String ciudad;
	private String calle;
	private int numero;
	private Empleado[] empleados;
	private String codigo;
	private Cliente[] clientes;
	
	public Sucursal(String pais, String ciudad, String calle, int numero, Empleado[] empleados, String codigo,
			Cliente[] clientes) {
		
		this.pais = pais;
		this.ciudad = ciudad;
		this.calle = calle;
		this.numero = numero;
		this.empleados = empleados;
		this.codigo = codigo;
		this.clientes = clientes;
	}

	
	public String getPais() {
		return pais;
	}

	
	public void setPais(String pais) {
		this.pais = pais;
	}

	
	public String getCiudad() {
		return ciudad;
	}

	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	
	public String getCalle() {
		return calle;
	}

	
	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	
	public Empleado[] getEmpleados() {
		return empleados;
	}

	
	public void setEmpleados(Empleado[] empleados) {
		this.empleados = empleados;
	}

	
	public String getCodigo() {
		return codigo;
	}

	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	
	public Cliente[] getClientes() {
		return clientes;
	}

	
	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}
	
	
	
}
