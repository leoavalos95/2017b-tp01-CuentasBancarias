package cuentaBancaria;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCuenta {

	@Test
	public void verSaldoInicial() {
		Cuenta cuenta = new Cuenta();
		assertEquals(cuenta.getSaldo(), 0, 0.1);
	}

}
