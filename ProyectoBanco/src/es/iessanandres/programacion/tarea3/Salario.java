package es.iessanandres.programacion.tarea3;

public class Salario {
	private float cuantia;
	private int pagas;
	public Salario(float cuantia, int pagas) {
		super();
		this.cuantia = cuantia;
		this.pagas = pagas;
	}
	public float getCuantia() {
		return cuantia;
	}
	public void setCuantia(float cuantia) {
		this.cuantia = cuantia;
	}
	public int getPagas() {
		return pagas;
	}
	public void setPagas(int pagas) {
		this.pagas = pagas;
	}
	
	
}
