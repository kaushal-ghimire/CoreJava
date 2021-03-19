package abstration.abstractclass.abstractmethod;

public class Main {

   public static void main (String[] args){

    Rectangle rect = new Rectangle();

    //using constructor.....
//        System.out.println("Rectangle:" +rect);

       // getter & setter.....
       rect.setLength(12d);
       rect.setBreadth(14d);
       System.out.println("Length: " + rect.getLength());
       System.out.println("Breadth: " + rect.getBreadth());

       System.out.println("Area of rectangle:: " + rect.getLength() * rect.getBreadth());
    }
}
