package strategy;

public class Orcamento extends Corrida {

	private double orcamento;
	
	public Orcamento(String nome, int codigo, String categoria, double orcamento) {
		super(nome, codigo, categoria);
		this.orcamento = orcamento;
	}

	@Override
	public void calcularCustos() {
		this.custos = this.orcamento;
		
	}

}
