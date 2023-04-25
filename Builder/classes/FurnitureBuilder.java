package classes;

public class FurnitureBuilder {
	
	public Furniture buildLargeCabinetNo1 (){
		Furniture furnitureItem = new Furniture();
		furnitureItem.addMaterial(new SolidWood(0.35f));
		furnitureItem.addMaterial(new DanishOil(0.5f));
	    return furnitureItem;
	   }
	
	public Furniture buildLargeCabinetNo2 (){
		Furniture furnitureItem = new Furniture();
		furnitureItem.addMaterial(new Plywood(0.35f));
		furnitureItem.addMaterial(new BeesWax(0.5f));
		return furnitureItem;
	   }



}
