package nr3_flyweight;

import java.util.HashMap;

public class FabricaDeLocuri {
	
private HashMap<String, Avion> listaLocuri;
	
	public FabricaDeLocuri() {
		listaLocuri=new HashMap<String, Avion>();
	}
	
	public IAvion getLoc(String destinatie, int nrLocuri) {
		if(listaLocuri.containsKey(destinatie)) {
			return listaLocuri.get(destinatie);
		} else {
			IAvion avion = new Avion(destinatie, nrLocuri);
			listaLocuri.put(destinatie, (Avion)avion);
			return avion;
		}
	}

}
