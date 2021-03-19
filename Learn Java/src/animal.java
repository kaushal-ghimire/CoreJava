
public abstract class animal{
         int age;
         String gender;
         int weightinpounds;
         
         public animal(int age, String gender, int weightinpounds) {
			super();
			this.age = age;
			this.gender = gender;
			this.weightinpounds = weightinpounds;
		}

		public void eat() {
        	 System.out.println("Animal needs more food to gain weight..."); 
         }
	
	public void sleep() {
		 System.out.println("More eating more sleep");
	
	}
	
	public void wakeUp() {
		 System.out.println("Waking up...........");
    	
	}

	public abstract void move();
	
	
}
