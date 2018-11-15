package decorator.visitor;

import decorator.Produto;
import decorator.produto.Jogo;
import decorator.produto.Livro;

public class ProdutoVisitor implements Visitor {
	
	private double totalParaAtendente;
	
	@Override
	public void visit(Produto produto) {
		if(produto.getDescricao().contains("Black Friday")) {
			totalParaAtendente += produto.getPreco() * 0.5;
		}
		if(produto.getDescricao().contains("Cyber Monday")) {
			totalParaAtendente += produto.getPreco() * 0.6;
		}
		if(produto.getDescricao().contains("Niver")) {
			totalParaAtendente += produto.getPreco() * 0.8;
		}
		
	}
	
	public double getTotal( ) {
		return totalParaAtendente;
	}

}
