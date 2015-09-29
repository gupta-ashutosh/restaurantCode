
public class Recipe {
	
	//Recipe Dish
	String dishName;
	
	//Every Recipe has two possible ingredients
	Ingredients i1;
	Ingredients i2;
	
	//Constructor
	Recipe(String dish,Ingredients i1, Ingredients i2){
		this.dishName=dish;
		this.i1=i1;
		this.i2=i2;
	}

	//Getters and Setters
	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public Ingredients getI1() {
		return i1;
	}

	public void setI1(Ingredients i1) {
		this.i1 = i1;
	}

	public Ingredients getI2() {
		return i2;
	}

	public void setI2(Ingredients i2) {
		this.i2 = i2;
	}

}
