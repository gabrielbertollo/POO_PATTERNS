package calculadora;

public class Tester {

	public static void main(String[] args) {

		Soma soma = new Soma();
		System.out.println(soma.operacaoMatematica(2, 3));
		
		Multiplicacao multiplicacao = new Multiplicacao();
		System.out.println(multiplicacao.operacaoMatematica(2, 3));
	}

}
