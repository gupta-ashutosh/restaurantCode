import java.util.Random;


public class ServiceStaff implements Services {
	

	@Override
	public void replenishStock() {
		// TODO Auto-generated method stub
		System.out.println("Stock Replenished");
	}

	@Override
	public void cleanCounter() {
		// TODO Auto-generated method stub
		System.out.println("Counter cleaned");
	}
	
	public void startService() throws Exception{
		Random rand = new Random();
		int choice;
		while(true){
			choice = rand.nextInt(2);
			if(choice==0){
				replenishStock();
			}
			else{
				cleanCounter();
			}
			Thread.sleep(5000);
		}
	}

}
