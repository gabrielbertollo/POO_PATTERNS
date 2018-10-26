package factory.builder;

import java.io.File;

public class Testador {

	public static void main(String[] args) {
		
		PizzaFactory pz = new PizzaFactory();
		
		Pizzaria pp = new Pizzaria(pz);
	
		IPizza pizza1 = pp.montar("Quatro Queijos");
	
		//System.out.println(pizza1.getSabor() +" - Ingredientes: "+ pizza1.getIngredientes());
		
		IPizza pizza2 = pp.montar("Dois Amores");
		IPizza pizza3 = pp.montar("Sensação");
		
		Pedido pedido = new Pedido(pizza1, "Gabriel", "R$ 60,00");
		PedidoBuilder pb = new PedidoBuilder(pedido);
		
		pb
			.endereco("Rua das Flores")
			.observacao("Cliente chato")
			.pizza(pizza2);
		
		System.out.println(pedido);
		
		Pedido pedido2 = new Pedido(pizza3, "Aline", "25,00");
		PedidoBuilder pb2 = new PedidoBuilder(pedido2);
		
		pb2
		.endereco("Rua Morro do Pico")
		.observacao("Levar troco para 50.00");
		
		System.out.println(pedido2);
		
	
	}

}
