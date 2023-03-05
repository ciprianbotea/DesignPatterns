package nr2_proxy;

public class Main {

	public static void main(String[] args) {
		
		Bilet bilet1 = new Bilet(100, "Roma");
		Bilet bilet2 = new Bilet(99.99f, "Berlin");	
		System.out.println("Apel fara proxy (toate bilete sunt anulate, indiferent de pret)");
		bilet1.anulareBilet();
		bilet2.anulareBilet();

		ProxyBilet proxyBilet1 = new ProxyBilet(bilet1) ;
		ProxyBilet proxyBilet2 = new ProxyBilet(bilet2) ;
		System.out.println();
		System.out.println("Apel cu proxy (doar biletele care indeplinesc conditia sunt anulate)");
		proxyBilet1.anulareBilet();
		proxyBilet2.anulareBilet();

	}

}