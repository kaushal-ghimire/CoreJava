public class MakeAnimal{

int age;
String color;

public static void main(String args[]){
	MakeAnimal dog = new MakeAnimal();
	dog.initObject("black",15);
	dog.displayObject();
}

public void initObject(String a, int b){
	color=a;
	age=b;
	System.out.println(color +" "+ age);
}

public void displayObject(){
	
	System.out.println(color +" "+ age);
}
}