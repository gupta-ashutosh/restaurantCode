
public class Kitchen {
	//Kitchen has Storage section
	Storage kitStorage;
	//Kitchen had Cooking Counter
	CookingCounter cCounter;
	
	//Constructor
	Kitchen(){
		this.kitStorage=new Storage();
		this.cCounter=new CookingCounter();
		System.out.println("New Kitchen Created!!");
	}
}
