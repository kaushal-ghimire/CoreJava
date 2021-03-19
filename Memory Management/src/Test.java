import java.lang.reflect.*;

public class Test {

	public static void main(String[] args) throws Exception {
		
		Student std = new Student();
		
		std.setName("kaushal");
	
		
		System.out.println(std.getName());
		
		int count = 0;
		Class c = Class.forName("Student");
		
		Method[] m = c.getDeclaredMethods();
		
		for(Method m1 : m) {
		count ++;
		System.out.println(m1.getName());
		}
		
		System.out.println(count);
		
	
		Class c1 = std.getClass();

		Student std1 = new Student();
		Class c2 = std1.getClass();
			
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1 == c2);
		
		

	}

}
