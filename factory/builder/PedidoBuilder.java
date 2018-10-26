package factory.builder;

import java.io.File;

public class PedidoBuilder {
	
	private Pedido pedido;
	
	public PedidoBuilder (Pedido pedido) {
		this.pedido = pedido;
	}
	
	public PedidoBuilder observacao(String obs) {
		pedido.setObservacoes(obs);
		return this;
	}
	
	public PedidoBuilder endereco(String end) {
		pedido.setEndereco(end);
		return this;
	}
	
	public PedidoBuilder cliente(String cliente) {
		pedido.getClientes().add(cliente);
		return this;
	}
	
	public PedidoBuilder pizza(IPizza pizza) {
		pedido.getPizza().add(pizza);
		return this;
	}

}
