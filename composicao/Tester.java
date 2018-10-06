package composicao;

public class Tester {

	public static void main(String[] args) {
		
		Elfo elfo1 = new Elfo("Mithrandil", 99, "Arco");
		
		Mago mage = new Mago();
		mage.setNivelBruxaria(8001);
		mage.setElfo(elfo1);
		
		System.out.println(mage.getElfo().getNome());
		
		
		Elfo elfo2 = new Elfo("Lorthemar", 10, "Espada");
		
		Guerreiro warr = new Guerreiro();
		warr.setGuerreiroId(1);
		warr.setElfo(elfo2);
		
		System.out.println(warr.getElfo().getNome());

	}

}
