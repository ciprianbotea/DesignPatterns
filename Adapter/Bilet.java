package nr1_adapter;

public class Bilet {
	
	private float pret;
	private String destinatie;
	
	public Bilet(float pret, String destinatie) {
		this.pret = pret;
		this.destinatie = destinatie;
	}
	
	@Override
	public String toString() {
		return "Destinatie: " + destinatie + " | Pret: " + pret;
	}

}
