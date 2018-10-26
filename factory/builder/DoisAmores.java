package factory.builder;

import java.util.ArrayList;
import java.util.List;

public class DoisAmores implements IPizza {

	@Override
	public List<String> getIngredientes() {
		List<String> ingredientes = new ArrayList();
		ingredientes.add("Queijo Mussarela");
		ingredientes.add("Chocolate Preto");
		ingredientes.add("Chocolate Branco");
		return ingredientes;
	}

	@Override
	public String getSabor() {
		return "Dois Amores";
	} 
	
	@Override
	public String toString() {
		return "Dois Amores - Ingredientes= " + getIngredientes() + ", Sabor= " + getSabor();
	} 
	
}
