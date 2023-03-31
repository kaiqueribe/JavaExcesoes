package java_pilha;

public class FluxoComError {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage();

			System.out.println("Exception " + msg);
			ex.printStackTrace();
		}finally {
			System.out.println("Fecha");
		}
		System.out.println("Fim do main");

	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Ini do metodo 2");
		System.out.println("Testando se 2 das maquinas conseguem mandar atualizações de commit pelo git bash");
		System.out.println("Cadastrei a SSH Key");
		metodo2();
		System.out.println("Fim do metodo 2");
	}
}
