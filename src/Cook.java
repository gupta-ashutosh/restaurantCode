
public class Cook {
	String cookName;
	private Recipe secretRecipe;
	
	//Constructor
	Cook(String name, Recipe r){
		this.cookName=name;
		this.secretRecipe=r;
	}
	
	//Starts cooking function
	public void StartsCooking(){
		System.out.println(this.cookName+"has entered Kitchen. He will be cooking "+this.secretRecipe.getDishName());
	}
}
