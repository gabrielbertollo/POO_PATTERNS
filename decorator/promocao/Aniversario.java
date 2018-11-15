package decorator.promocao;

import decorator.Produto;
import decorator.PromocaoDecorator;

public class Aniversario extends PromocaoDecorator {
	
	private Produto produto;

	public Aniversario(Produto produto) {
		this.produto = produto;
	}

	@Override
	public String getDescricao() {
		return produto.getDescricao()+" Promo de Niver";
	}

	@Override
	public double getPreco() {
		return produto.getPreco();
	}
	
	
	
	

}
