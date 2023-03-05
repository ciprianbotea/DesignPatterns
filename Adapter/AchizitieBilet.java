package nr1_adapter;

public class AchizitieBilet implements IBilet {
	
	private BiletAchizitionat bilet;

	public AchizitieBilet(BiletAchizitionat bilet) {
		this.bilet = bilet;
	}
	
	@Override
	public void actiune() {
		this.bilet.vindeBilet();
	}

}