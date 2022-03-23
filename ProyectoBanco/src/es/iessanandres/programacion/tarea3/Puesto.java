package es.iessanandres.programacion.tarea3;

public class Puesto {

	private String puesto;
	private Salario salario;
	
	public Puesto(String puesto, Salario salario) {
		super();
		this.puesto = puesto;
		this.salario = salario;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public Salario getSalario() {
		return salario;
	}

	public void setSalario(Salario salario) {
		this.salario = salario;
	}
	
	
	 
	 
}
