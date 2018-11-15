package decorator.promocao;

import decorator.Produto;
import decorator.PromocaoDecorator;

public class BlackFriday extends PromocaoDecorator {

	private Produto produto;
	
	public BlackFriday(Produto produto) {
		this.produto = produto;
	}

	@Override
	public String getDescricao() {
		return produto.getDescricao()+" Black Friday";
	}

	@Override
	public double getPreco() {
		return produto.getPreco();
	}
	

}
