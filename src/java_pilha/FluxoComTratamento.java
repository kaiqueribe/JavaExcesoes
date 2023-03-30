package java_pilha;

import java.lang.reflect.UndeclaredThrowableException;

public class FluxoComTratamento {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (Exception ex) {
			String msg = ex.getMessage();

			System.out.println("Exception " + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do main");

	}

	private static void metodo1() throws MinhaExcecao {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws MinhaExcecao {
		System.out.println("Ini do metodo2");
		
		Conta c= new Conta();
		throw new MinhaExcecao("Deu Muito Errado2");
		//NullPointerException ex2 = new NullPointerException();
		
		//throw ex2;
	//	System.out.println("Fim do metodo2");
	}
}
