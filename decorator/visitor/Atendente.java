package decorator.visitor;

import java.util.ArrayList;

public class Atendente {
	
	private ArrayList<Visitable> items;
	public double calculatePostage() {
		ProdutoVisitor visitor = new ProdutoVisitor();
		for(Visitable item : items) {
			item.accept(visitor);
		}
		double produto = visitor.getTotal();
		return produto;
	}

}
