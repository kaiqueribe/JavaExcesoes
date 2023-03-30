package java_pilha;

public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {
		
		Conta c = new Conta();
		try {
		c.deposita(50);
		c.deposita(50);
		} catch(MinhaExcecao ex) {
			System.out.println("Tratamento");
		}
		
		System.out.println(c.saldo);
		
	}

}
