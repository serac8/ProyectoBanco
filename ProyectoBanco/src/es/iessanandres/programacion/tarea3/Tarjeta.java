package es.iessanandres.programacion.tarea3;

import java.util.Date;

public class Tarjeta {

	private long numTarjeta;
	private Date fechaCad;
	private int cvv;
	private CuentaBancaria cuenta;
	private Cliente cliente;
	private boolean credito;
	
	public Tarjeta(long numTarjeta, Date fechaCad, int cvv, CuentaBancaria cuenta, Cliente cliente, boolean credito) {
		this.numTarjeta = numTarjeta;
		this.fechaCad = fechaCad;
		this.cvv = cvv;
		this.cuenta = cuenta;
		this.cliente = cliente;
		this.credito = credito;
	}

	public long getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(long numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public Date getFechaCad() {
		return fechaCad;
	}

	public void setFechaCad(Date fechaCad) {
		this.fechaCad = fechaCad;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public CuentaBancaria getCuenta() {
		return cuenta;
	}

	public void setCuenta(CuentaBancaria cuenta) {
		this.cuenta = cuenta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public boolean isCredito() {
		return credito;
	}

	public void setCredito(boolean credito) {
		this.credito = credito;
	}
	
	
	
	
}
