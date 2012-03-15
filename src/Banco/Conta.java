package Banco;
import Persistencia.PersistenciaFacede;

public class Conta {
	private PersistenciaFacede persistencia;
	private Double saldo;
	
	
	public Double getSaldo() throws BancoException{
		return saldo;
	}
	
	
}
