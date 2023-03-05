package nr1_adapter;

public class RezervareBilet implements IBilet{
	
	private Bilet bilet;
	
	public RezervareBilet(Bilet bilet) {
		this.bilet = bilet;
	}

	@Override
	public void actiune() {
		System.out.println("A fost rezervat urmatorul bilet: " + bilet.toString());
	}
	
}