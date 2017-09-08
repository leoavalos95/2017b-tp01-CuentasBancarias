package cuentaBancaria;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCuenta {

	@Test
	public void verSaldoInicial() {
		Cuenta cuenta = new Cuenta();
		assertEquals(cuenta.getSaldo(), 0, 0.1);
	}
	
	@Test
	public void verEstadoInicial(){
		Cuenta cuenta = new Cuenta();
		assertEquals(cuenta.getEstado(), "Activo");
	}
	
	@Test
	public void verSiPuedoTransferir(){
		Cuenta cuentaOrigen = new Cuenta();
		Cuenta cuentaDestino = new Cuenta();
		double monto = 50;
		cuentaOrigen.extraer(monto);
		cuentaOrigen.transferirMontoHacia(monto, cuentaDestino);
		assertEquals(cuentaDestino.getSaldo(), monto, 0.1);
	}
	
	@Test
	public void verSiPuedoTransferirSaldoSuficiente(){
		Cuenta cuentaOrigen = new Cuenta();
		Cuenta cuentaDestino = new Cuenta();
		double monto = 50;
		if(cuentaOrigen.extraer(monto))
			cuentaOrigen.transferirMontoHacia(monto, cuentaDestino);
		assertEquals(cuentaOrigen.getSaldo(), 0, 0.1);
	}
	
	@Test
	public void verSiPuedeTransferirCuentaInactiva(){
		Cuenta cuentaOrigen = new Cuenta("Inactiva",100);
		Cuenta cuentaDestino = new Cuenta();
		double monto = 50;
		if(cuentaOrigen.extraer(monto))
			cuentaOrigen.transferirMontoHacia(monto, cuentaDestino);
		assertEquals(cuentaOrigen.getSaldo(), 100, 0.1);
	}
	
	

}
