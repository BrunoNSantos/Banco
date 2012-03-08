package Banco;

public class BancoFacede {
	private Banco banco;
	
	public Double getSaldo(String numero) throws BancoException{
		return this.banco.getConta(numero).getSaldo();
	}
}
