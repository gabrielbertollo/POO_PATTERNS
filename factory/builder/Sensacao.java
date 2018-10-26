package factory.builder;

import java.util.ArrayList;
import java.util.List;

public class Sensacao implements IPizza{
	
	@Override
	public List<String> getIngredientes() {
		List<String> ingredientes = new ArrayList();
		ingredientes.add("Chocolate Preto");
		ingredientes.add("Morango picado");
		return ingredientes;
	}

	@Override
	public String getSabor() {
		return "Sensação";
	} 
	
	@Override
	public String toString() {
		return "Sensação - Ingredientes= " + getIngredientes() + ", Sabor= " + getSabor();
	} 
	
}
