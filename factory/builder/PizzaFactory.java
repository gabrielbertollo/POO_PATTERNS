package factory.builder;

public class PizzaFactory {

	public IPizza getSabor(String sabor) {
		IPizza pizza = null;
		
		if(sabor.equalsIgnoreCase("Quatro Queijos")) {
			pizza = new QuatroQueijos();
		} else if (sabor.equalsIgnoreCase("Sensação")) {
			pizza = new Sensacao();
		} else if (sabor.equalsIgnoreCase("Dois Amores")) {
			pizza = new DoisAmores();
		}
			
			
		return pizza;
	}
}
