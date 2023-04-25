package classes;

import java.util.ArrayList;
import java.util.List;

import interfaces.Material;

public class Furniture {
	
	private static float margin = 1.3f;
	private static float VAT = 1.19f;

	public static float getMargin() {
		return margin;
	}

	public static float getVAT() {
		return VAT;
	}

	private List<Material> materials = new ArrayList<Material>();

	public void addMaterial(Material material) {
		materials.add(material);
	}

	public float getCost() {
		float cost = 0.0f;

		for (Material material : materials) {
			cost += material.price();
		}
		return cost;
	}

	public float getQuantity() {
		float quantity = 0.0f;

		for (Material material : materials) {
			quantity = material.quantity();
		}
		return quantity;
	}

	public void displayMaterials() {
		int i = 1;
		for (Material material : materials) {

			System.out.println("Material " + i + ": " + material.quantity() + " " + material.unitMeasure().type()
					+ " of " + material.name() + ", which costs " + material.price() + " euros.");
			i++;
		}
	}

}
