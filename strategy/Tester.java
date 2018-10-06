package strategy;

public class Tester {

	public static void main(String[] args) {
		
		Corrida patrocinada = new Patrocinada("RedBull KTM World Race", 1, "SuperSport", 5000, 3000);
		
		Corrida orcamento = new Orcamento("Italy SS Tour", 2, "SuperBike", 10000);
		
		CalculadoraDeCustos cc = new CalculadoraDeCustos();
		
		cc.calcularCustos(patrocinada);
		System.out.println(patrocinada);
		
		cc.calcularCustos(orcamento);
		System.out.println(orcamento);

	}

}
