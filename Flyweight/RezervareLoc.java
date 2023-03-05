package nr3_flyweight;

public class RezervareLoc {
	
	private String nrLoc;
	
	public RezervareLoc(String nrLoc) {
		this.nrLoc = nrLoc;
	}	
	
	@Override
	public String toString() {
		return "numar loc: " + nrLoc;
	}

}
