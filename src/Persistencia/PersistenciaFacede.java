package Persistencia;
import java.io.File;

import Banco.BancoException;
import Banco.Conta;

public class PersistenciaFacede {
	private File arquivo;
	
	public Double selecionarSaldo(Conta conta) throws BancoException{
		return conta.getSaldo();
	}
}
