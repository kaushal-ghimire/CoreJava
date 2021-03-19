
public class Invoking{
	
	int length;
	int breadth;
	int height;
	
	public int getCubeVolumeMethod(){
	      return( length * breadth * height);
	
	}
	
	Invoking(){
		System.out.println("We are in constructor....");
		
		length = 10;
		breadth = 20;
		height = 30;
		
		
	}

	Invoking( int l, int b , int h){
	 length = l ;
	 breadth = b;
	 height = h;
		
		
	}
}
