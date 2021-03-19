
public class zoo {

	public static void main(String[] args) {
		//animal diet = new animal( 10 ,"Male", 50);
	   
	      /* diet.age = 10;
	      diet.gender = "Male";
	      diet.weightinpounds= 50;
	     */
	    
		 //diet.eat();
	    
	    
	    //animal diet1 = new animal(14 , "Female" , 100);
	     /* diet1.age = 14;
	        diet1.gender = "Female";
	        diet1.weightinpounds= 100;
	   */
	    // diet1.sleep();
	     
		//animal diet2 = new animal(8 , "Male" , 60);
		      /* diet2.age = 8;
		      diet2.gender = "Male";
		      diet2.weightinpounds= 60;
		      */
		
		   // diet2.wakeUp();
		    
		    
		   // Fish can = new Fish(8 ,"M" , 10);
		    //can.eat();
		 
		   //Bird b1 = new Bird(15 ,"F" , 5);
		   //b1.eat();
		  // b1.sleep();
		  // b1.wakeUp();
	       //b1.fly();
	    
	       //Chicken chick1 = new Chicken(15 , "M" , 4);
	       //chick1.fly();
	       
	       Pegion peg1 = new Pegion(10 ,"F" , 5);
	       peg1.fly();
	       
	       animal move1 = new Pegion(20 ,"M" , 8);
	       move1.move();
	       
	       Fish move2 = new Fish(10 , "F", 50);
	       move2.move();
	       
	       moveAnimals(move1);
	       moveAnimals(move2);
	}
	public static void moveAnimals(animal animal) {
		animal.move();
	}

	Flyable flyable1 = new Pegion(1 ,"M" , 3);

	
	
}
