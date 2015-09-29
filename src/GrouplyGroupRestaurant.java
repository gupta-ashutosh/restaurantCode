import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Ashutosh Gupta
 *`This is the main class for Grouply Group Restaurant
 */
public class GrouplyGroupRestaurant implements Runnable{
	static Unit un;
	public static void main(String[] args) throws Exception{		
		un = initRestraunt();		
		System.out.println("Hello! Welcome to Restaurant...\n");
	
		//Create initial state of Restaurant
		
		Thread th[] = new Thread[6];
		for(int i = 0; i < th.length; i++) {
			th[i] = new Thread();
		}
	}
	
	public void run() {
		Random rand = new Random();
		
		int ch=rand.nextInt(2);
		for(int i=0; i<2; i++){
			try {
				un.getStaff().get(ch).startService();
			} catch (Exception e) {
				e.getMessage();
			}
		}
		//Cook starts cooking
		int ch2=rand.nextInt(4);
		for(int i =0; i<4; i++){
			un.getCook().get(ch2).StartsCooking();
		}
	}
	
	public static Unit initRestraunt() throws Exception{
		//Initialise Empty Kitchen in a new unit of Grouply group restaurant
				Unit u = new Unit();
				Thread.sleep(1000);
		//add items to storage
				addItem(u.getLargeKitchen());
				Thread.sleep(1000);
		//create List of 4 cooks
				List<Cook> cook = createCook();
				u.setCook(cook);
				Thread.sleep(1000);
		//create List of 2 service staff
				List<ServiceStaff> staff = createStaff();
				u.setStaff(staff);
		return u;
	}
	
	private static List<Cook> createCook(){
		List<Cook> cook = new ArrayList<Cook>();
		cook.add(new Cook("MasterChef",new Recipe("Butter-Cake",new Ingredients("Butter", 50),new Ingredients("Maida", 100))));
		cook.add(new Cook("JuniorChef",new Recipe("Chocolate-Cake",new Ingredients("Cocoa", 100),new Ingredients("Cream", 100))));
		cook.add(new Cook("InternChef",new Recipe("Butter-Cake",new Ingredients("Butter", 100),new Ingredients("Sugar", 50))));
		cook.add(new Cook("SeniorChef",new Recipe("Chocolate-Cake",new Ingredients("Cocoa", 50),new Ingredients("Milk", 100))));
		System.out.println("4 Cooks joined!!");
		return cook;
	}
	
	private static List<ServiceStaff> createStaff(){
		List<ServiceStaff> staff = new ArrayList<ServiceStaff>();
		for(int i=0; i<2; i++){
			staff.add(new ServiceStaff());
		}
		System.out.println("2 Service Staff joined!!");
		return staff;
	}
	
	public static void addItem(Kitchen k){
		k.kitStorage.addStock("Butter",100);
		k.kitStorage.addStock("Cocoa", 150);
		k.kitStorage.addStock("Maida", 150);
		k.kitStorage.addStock("Sugar", 100);
		k.kitStorage.addStock("Milk", 150);
		k.kitStorage.addStock("Baking Soda", 100);
		k.kitStorage.addStock("Cream", 300);
		System.out.println("Kitchen Ready with stock!!");
	}
}
