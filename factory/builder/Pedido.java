package factory.builder;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private String endereco;
	private List<String> clientes = new ArrayList();
	
	private String observacoes;
	private String preco;
	private List<IPizza> pizza = new ArrayList();
	
	
	public Pedido(IPizza pizza, String cliente, String preco) {
		this.addPizza(pizza);
		this.addCliente(cliente);
		this.preco = preco;
	}
	
	public void addCliente(String cliente) {
		this.clientes.add(cliente);
	}
	
	public void addEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void addPizza(IPizza pizza) {
		this.pizza.add(pizza);
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<String> getClientes() {
		return clientes;
	}

	public void setClientes(List<String> clientes) {
		this.clientes = clientes;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public List<IPizza> getPizza() {
		return pizza;
	}

	public void setPizza(List<IPizza> pizza) {
		this.pizza = pizza;
	}

	@Override
	public String toString() {
		return "Pedido [endereco=" + endereco + ", clientes=" + clientes + ", observacoes=" + observacoes + ", preco="
				+ preco + ", pizza=" + pizza + "]";
	}
	

}
