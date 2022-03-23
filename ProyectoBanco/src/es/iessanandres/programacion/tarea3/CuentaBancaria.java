package es.iessanandres.programacion.tarea3;

public class CuentaBancaria {
	private Movimiento movimientos;
	private String iban;
	private int ccc;
	private Cliente clientes;
	public CuentaBancaria(Movimiento movimientos, String iban, int ccc, Cliente clientes) {
		super();
		this.movimientos = movimientos;
		this.iban = iban;
		this.ccc = ccc;
		this.clientes = clientes;
	}
	public Movimiento getMovimientos() {
		return movimientos;
	}
	public void setMovimientos(Movimiento movimientos) {
		this.movimientos = movimientos;
	}
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public int getCcc() {
		return ccc;
	}
	public void setCcc(int ccc) {
		this.ccc = ccc;
	}
	public Cliente getClientes() {
		return clientes;
	}
	public void setClientes(Cliente clientes) {
		this.clientes = clientes;
	}
	
	
	
}
