/*
 * Class is a blueprint or specification or design/prototype.
 * Class is not a real world entity.
 */


/*
 * Creating class,object & method.
 */
public class Animal {

	public static void main(String[] args) {
	
		Animal anm = new Animal();
		anm.nonStaticMethod();
		staticMethod();
		

	}
	
	//creating a static method
	public static void staticMethod() {
		System.out.println("Static method called in main method...");
	}
	
	//Creating non-static method and call in main method.
	
	 public void nonStaticMethod() {
		 System.out.println("Non-static Method called in main method...");
	 }

}
