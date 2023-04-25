package classes;

public class FactoryProducer {
	
	public AbstractFactory getFactory(boolean discounted){   
	      if(discounted){
	         return new DiscountedFurnitureFactory();         
	      }
	      else {
	         return new FurnitureFactory();
	      }
	   }
}
