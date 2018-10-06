package strategy;

public class Patrocinada extends Corrida {

	private double patrocinio;
	
	public Patrocinada(String nome, int codigo, String categoria, double custos, double patrocinio) {
		super(nome, codigo, categoria, custos);
		this.patrocinio = patrocinio;
	}

	@Override
	public void calcularCustos() {
		this.custos = this.custos - this.patrocinio;
	}

}
