package decorator;

import decorator.produto.Jogo;
import decorator.produto.Livro;
import decorator.promocao.BlackFriday;
import decorator.promocao.CyberMonday;
import decorator.visitor.ProdutoVisitor;

public class Tester {

	public static void main(String[] args) {
		
		Produto p1 = new Livro();
		Produto p2 = new Jogo();
		
		p1 = new BlackFriday(p1);
		p2 = new CyberMonday(p2);
		
		System.out.println(p1.getDescricao()+" "+p1.getPreco());
		System.out.println(p2.getDescricao()+" "+p2.getPreco());
		
		ProdutoVisitor pv = new ProdutoVisitor();
		
		pv.visit(p1);
		pv.visit(p2);
		
		System.out.println(pv.getTotal());

	}

}
