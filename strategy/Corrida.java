package strategy;

public abstract class Corrida {

		protected String nome;
		protected int codigo;
		protected String categoria;
		protected double custos;
		
		public Corrida(String nome, int codigo, String categoria) {
			this.nome = nome;
			this.codigo = codigo;
			this.categoria = categoria;
		}

		public Corrida(String nome, int codigo, String categoria, double custos) {
			this(nome, codigo, categoria);
			this.custos = custos;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public String getCategoria() {
			return categoria;
		}

		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}

		public double getCustos() {
			return custos;
		}

		public void setCustos(double custos) {
			this.custos = custos;
		}
		

		@Override
		public String toString() {
			return "Corrida [nome=" + nome + ", codigo=" + codigo + ", categoria=" + categoria + ", custos=" + custos
					+ "]";
		}

		public abstract void calcularCustos();
	}
		
		

