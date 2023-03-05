package nr1_adapter;

public class Main {

	public static void main(String[] args) {
		
		Bilet bilet1 = new Bilet(400f, "Paris");
		IBilet rezervareBilet = new RezervareBilet(bilet1);
		rezervareBilet.actiune();
		BiletAchizitionat biletAchizitionat = new BiletAchizitionat(bilet1);
		System.out.println(biletAchizitionat.toString());
		biletAchizitionat.vindeBilet();
		
		Bilet bilet2 = new Bilet(300f, "Londra");
		BiletAchizitionat biletAchizitionat2 = new BiletAchizitionat(bilet2);
		IBilet biletVandut = new AchizitieBilet(biletAchizitionat2);
		biletVandut.actiune();
		
	}

}