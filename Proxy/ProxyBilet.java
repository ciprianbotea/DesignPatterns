package nr2_proxy;

public class ProxyBilet implements IBilet {
	
	private Bilet bilet;

	public ProxyBilet(Bilet bilet) {
		this.bilet = bilet;
	}

	@Override
	public void anulareBilet() {
		if(bilet.getPret() < 100) {
			bilet.anulareBilet();
		} else {
			System.out.println("Biletul catre " + bilet.getDestinatie() +" nu poate fi anulat!");
		}
	}

}