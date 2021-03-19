
public class Pegion extends Bird implements Flyable {

	public Pegion(int age, String gender, int weightinpounds) {
		super(age, gender, weightinpounds);
	
	}

	@Override
	public void fly() {
		System.out.println("Pegion fly higher......");
		
	}


}
