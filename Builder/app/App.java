package app;

import classes.Furniture;
import classes.FurnitureBuilder;

public class App {

	public static void main(String[] args) {
		
		FurnitureBuilder furnitureBuilder = new FurnitureBuilder();
		
		Furniture largeWoodCabinet = furnitureBuilder.buildLargeCabinetNo1();
		System.out.println("Product details:");
		largeWoodCabinet.displayMaterials();
		System.out.println("Product price: " 
		+ largeWoodCabinet.getCost() * Furniture.getMargin() * Furniture.getVAT() 
		+ " euros.");
		System.out.println();
		Furniture largePlywoodCabinet = furnitureBuilder.buildLargeCabinetNo2();
		System.out.println("Product details:");
		largePlywoodCabinet.displayMaterials();
		System.out.println("Product price: " 
		+ largePlywoodCabinet.getCost() * Furniture.getMargin() * Furniture.getVAT() 
		+ " euros.");

		
		

	}

}
