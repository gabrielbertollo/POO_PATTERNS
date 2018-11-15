package decorator.produto;

import decorator.Produto;
import decorator.visitor.Visitor;

public class Jogo extends Produto {
	
	public Jogo() {
		descricao = "Jogo";
		preco = 49.9;
	}
	
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
