package nr2_proxy;

public class Bilet implements IBilet{
	
	private float pret;
	private String destinatie;
	
	public Bilet(float pret, String destinatie) {
		this.pret = pret;
		this.destinatie = destinatie;
	}
	
	public float getPret() {
		return pret;
	}

	public String getDestinatie() {
		return destinatie;
	}

	@Override
	public void anulareBilet() {
		System.out.println("Biletul catre " + destinatie + " a fost anulat!");
	}

}