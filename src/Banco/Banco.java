package Banco;
import java.util.Map;

public class Banco {
	private Map<String,Conta> contasMap;

	public Conta getConta(String numero){
		return contasMap.get(numero);
	}
}
