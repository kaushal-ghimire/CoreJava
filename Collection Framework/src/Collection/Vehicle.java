package Collection;

public class Vehicle {
      String name;
      String model;
      int price;
      boolean fWheelerDrive;
      
	public Vehicle(String name, String model, int price, boolean fWheelerDrive) {
		super();
		this.name = name;
		this.model = model;
		this.price = price;
		this.fWheelerDrive = fWheelerDrive;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isfWheelerDrive() {
		return fWheelerDrive;
	}
	public void setfWheelerDrive(boolean fWheelerDrive) {
		this.fWheelerDrive = fWheelerDrive;
	}
	public String toString() {
	return "Vehicle [vehicleName=" + name + ", model=" + model + ", price=" + price + " , fourWheelerDrive="+fWheelerDrive+" ]";
	}  

      
}
