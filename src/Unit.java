import java.util.List;


public class Unit {
	Kitchen largeKitchen;
	List<Cook> cook;
	List<ServiceStaff> staff;
	
	//Constructor
	Unit() throws Exception{
		System.out.println("New Unit Created!!");
		Thread.sleep(1000);
		this.largeKitchen=new Kitchen();
	}
	//getter and setter
	public Kitchen getLargeKitchen() {
		return largeKitchen;
	}
	public void setLargeKitchen(Kitchen largeKitchen) {
		this.largeKitchen = largeKitchen;
	}
	public List<Cook> getCook() {
		return cook;
	}
	public void setCook(List<Cook> cook) {
		this.cook = cook;
	}
	public List<ServiceStaff> getStaff() {
		return staff;
	}
	public void setStaff(List<ServiceStaff> staff) {
		this.staff = staff;
	}
}