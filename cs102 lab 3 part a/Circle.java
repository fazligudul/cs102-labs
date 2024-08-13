public class Circle extends Shape{
    private int radius;
    public Circle(int radius,int x,int y){
        this.radius=radius;
        setLocation(x, y);
    }

    double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }

    double getPerimeter() {
        return 2*Math.PI*radius;
    }
    public String toString() {
        return "Circle has "+radius+ " radius x:"+getX()+" y:"+getY()+" "+super.toString();
    }

}
