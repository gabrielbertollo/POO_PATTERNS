package decorator.produto;

import decorator.Produto;
import decorator.visitor.Visitor;

public class Livro extends Produto {
	
	public Livro() {
		descricao = "Livro";
		preco = 10.0;
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
