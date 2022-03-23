package es.iessanandres.programacion.tarea3;

public class CajeroAutomatico {
	private String codigo;
	private Sucursal sucursal;
	private Movimiento movimientos;
	private int dineroDisponible;
	public CajeroAutomatico(String codigo, Sucursal sucursal, Movimiento movimientos, int dineroDisponible) {
		super();
		this.codigo = codigo;
		this.sucursal = sucursal;
		this.movimientos = movimientos;
		this.dineroDisponible = dineroDisponible;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Sucursal getSucursal() {
		return sucursal;
	}
	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	public Movimiento getMovimientos() {
		return movimientos;
	}
	public void setMovimientos(Movimiento movimientos) {
		this.movimientos = movimientos;
	}
	public int getDineroDisponible() {
		return dineroDisponible;
	}
	public void setDineroDisponible(int dineroDisponible) {
		this.dineroDisponible = dineroDisponible;
	}
	
	
	
}
