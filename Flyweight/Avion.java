package nr3_flyweight;

public class Avion implements IAvion{
	
	private String destinatie;
	private int nrLocuri;
	private int locuriOcupate = 0;
	
	public Avion(String destinatie, int nrLocuri) {
		this.destinatie = destinatie;
		this.nrLocuri = nrLocuri;
	}

	@Override
	public void salvare(RezervareLoc rezervareLoc) {
		locuriOcupate++;
		if (locuriOcupate <= nrLocuri) {
			System.out.println("Un loc catre " + destinatie + " a fost rezervat: " + rezervareLoc.toString() + " | locuri ocupate: " + locuriOcupate + " | total locuri: " + nrLocuri);
		}
		else {
			System.out.println("Au fost ocupate toate locurile!");
		}
	}
		
}
