import java.util.ArrayList;


public class Dish {
	//Dish Name
	String dishName;
	
	//A dish can have many recipes each private to its cook.[TBD]
	private ArrayList<Recipe> recipes = new ArrayList<Recipe>();	
	
	//Constructor
	public Dish(String name){
		dishName = name;
	}
	//Add recipe in the list
	public void add(Recipe newRecipe){
		recipes.add(newRecipe);
	}
}
