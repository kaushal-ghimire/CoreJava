package abstration.abstractclass.abstractmethod;

public class Circle extends Shape{
    private Double radius;


    public Circle(Double radius,String color){
        super(color);

        this.radius = radius;
    }

    public void setRadius(Double radius){
        this.radius = radius;
    }

    public Double getRadius(){
        return radius;
    }
}
