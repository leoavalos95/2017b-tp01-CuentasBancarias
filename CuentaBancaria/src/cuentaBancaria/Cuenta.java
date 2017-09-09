package cuentaBancaria;

public class Cuenta {
	
	private double saldo;
	private String estado;
	
	public Cuenta(){
		saldo = 0;
		estado = "Activo";
	}

	public Cuenta(String estado, double saldo) {
		this.saldo = saldo;
		this.estado = estado;
	}

	public double getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	public String getEstado() {
		// TODO Auto-generated method stub
		return estado;
	}

	public boolean extraer(double monto) {

		if (saldo >= monto && estado == "Activo" && monto>=0) {
			saldo -= monto;
			return true;
		}
		return false;

	}

	public void transferirMontoHacia(double monto, Cuenta cuentaDestino) {
		cuentaDestino.saldo += monto;
	}

}
