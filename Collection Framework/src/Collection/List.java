package Collection;


import java.util.ArrayList;
import java.util.LinkedList;

public class List {

	public static void main(String[] args) {
		
		/*
		 ArrayList<String> array = new ArrayList<String>();
		 
		
		array.add("Hello!");
		array.add("there");
	
		
		 String item1 =  array.get(0);
		 String item2 =  array.get(1);
		
		System.out.println(item1 + item2);
		
		for(int i=0; i<array.size();i++) {
			System.out.println(array.get(i));
		}
		
		
		LinkedList<Integer> link = new LinkedList<Integer>();
		link.add(100);
		link.add(200);
		link.add(300);
		link.add(400);
		link.add(500);
		
		for(int linked : link) {
			System.out.println(linked);
		}
		
		*/
	
                ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
            	Vehicle vehicle1 = new 	Vehicle("Honda","Splendor",120000,false);
            	Vehicle vehicle2 = new Vehicle("Mercedes","Benz",40000000,true);
                
                vehicles.add(new Vehicle("TVS","Stryker",140000,false));
                vehicles.add(vehicle1);
                vehicles.add(new Vehicle("Honda","Sp Shine",210000,false));
                vehicles.add(vehicle2);
               /* 
           
                for(Vehicle automobiles : vehicles) {
                	System.out.println(automobiles.getName());
                   	System.out.println(automobiles.getModel());
                   	System.out.println(automobiles.getPrice());
                   	System.out.println(automobiles.isfWheelerDrive());
                }
                
                */
                
                for(Vehicle vehicle : vehicles) {
                	System.out.println(vehicle);
                }
                   
	}
	
	
	}
	


