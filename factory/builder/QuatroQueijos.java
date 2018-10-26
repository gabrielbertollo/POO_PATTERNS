package factory.builder;

import java.util.ArrayList;
import java.util.List;

public class QuatroQueijos implements IPizza{

	@Override
	public List<String> getIngredientes() {
		List<String> ingredientes = new ArrayList();
		ingredientes.add("Queijo Mussarela");
		ingredientes.add("Queijo Prato");
		ingredientes.add("Queijo Cheddar");
		ingredientes.add("Queijo Catupiry");
		ingredientes.add("Orégano");
		return ingredientes;
	}

	@Override
	public String getSabor() {
		return "Quatro Queijos";
	}

	@Override
	public String toString() {
		return "Quatro Queijos - Ingredientes= " + getIngredientes() + ", Sabor= " + getSabor();
	} 
	

}
