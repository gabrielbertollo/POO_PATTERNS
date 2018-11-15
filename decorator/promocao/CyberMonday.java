package decorator.promocao;

import decorator.Produto;
import decorator.PromocaoDecorator;

public class CyberMonday extends PromocaoDecorator {
	
	private Produto produto;

	public CyberMonday(Produto produto) {
		this.produto = produto;
	}

	@Override
	public String getDescricao() {
		return produto.getDescricao()+" Cyber Monday";
	}

	@Override
	public double getPreco() {
		return produto.getPreco();
	}
	
	

}
