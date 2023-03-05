package nr1_adapter;

public class BiletAchizitionat {
	
	private Bilet bilet;

	public BiletAchizitionat(Bilet bilet) {
		this.bilet = bilet;
	}
	
	public void vindeBilet() {
		System.out.println("A fost vandut urmatorul bilet: " + bilet.toString());
	}

	@Override
	public String toString() {
		return "Bilet vandut: " + bilet;
	}

}