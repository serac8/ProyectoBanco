package es.iessanandres.programacion.tarea3;

import java.util.Date;

public class Movimiento {
	private CuentaBancaria cuenatBancaria;
	private Date fecha;
	public Movimiento(CuentaBancaria cuenatBancaria, Date fecha) {
		super();
		this.cuenatBancaria = cuenatBancaria;
		this.fecha = fecha;
	}
	public CuentaBancaria getCuenatBancaria() {
		return cuenatBancaria;
	}
	public void setCuenatBancaria(CuentaBancaria cuenatBancaria) {
		this.cuenatBancaria = cuenatBancaria;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}
