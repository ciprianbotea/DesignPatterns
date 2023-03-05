package nr3_flyweight;


public class Main {

	public static void main(String[] args) {
		
		RezervareLoc rezevare1A = new RezervareLoc("1A");
		RezervareLoc rezervare3F = new RezervareLoc("3F");
		RezervareLoc rezervare27C = new RezervareLoc("27C");
				
		FabricaDeLocuri fabrica = new FabricaDeLocuri();
		
		IAvion avion = fabrica.getLoc("Oradea", 120);
		avion.salvare(rezevare1A);
		avion.salvare(rezervare3F);
		fabrica.getLoc("Iasi", 90).salvare(rezervare27C);
		
	}

}
