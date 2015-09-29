import java.util.ArrayList;
import java.util.List;




public class Storage {
	//Storage has list of ingredients
	static List<Ingredients> stock=new ArrayList<Ingredients>();
	
	//Add ingredient in stock
	public void addStock(String name, int quantity){
		stock.add(new Ingredients(name, quantity));
	}
	//update
}
