package abstration.abstractclass.abstractmethod;

public class Rectangle extends Shape {

    private Double length;
    private Double breadth;


    public Rectangle() {

    }

    public Rectangle(Double length, Double breadth, String color) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getBreadth() {
        return breadth;
    }

    public void setBreadth(Double breadth) {
        this.breadth = breadth;
    }
}
