package calculadora;

public class Soma implements Calculadora {

	@Override
	public double operacaoMatematica(double valor1, double valor2) {
		return valor1 + valor2;
	}

	
}
