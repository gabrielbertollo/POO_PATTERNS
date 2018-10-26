package factory.builder;



public class Pizzaria {
	private PizzaFactory pizzaFactory;
	
	public Pizzaria(PizzaFactory pz) {
		this.pizzaFactory = pz;
	}
	public IPizza montar(String sabor) {
		return pizzaFactory.getSabor(sabor);
	}
}
