
public class Bird extends animal{
	
	public Bird(int age , String gender , int weightinpounds) {
		super(age ,gender ,weightinpounds);
	}

	@Override
	public void move() {
		System.out.println("Bird flapping wings.....");
		
	}


}

