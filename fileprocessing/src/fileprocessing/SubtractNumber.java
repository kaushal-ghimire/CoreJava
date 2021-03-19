package fileprocessing;

public class SubtractNumber {
       public int SubtractNumberFrom15( int number) throws  RuntimeException{
    	   if(number<15) {
    		   throw new  RuntimeException("The number passed is less than 15");
    	   }
    	   return number-15;
       }
       public class RuntimeException extends Exception{
    	   public RuntimeException(String message) {
    		   super(message);
    	   }
       }
}
