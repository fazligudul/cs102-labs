public class Square extends Shape {
    int side;
    public Square(int side,int x,int y){
        this.side=side;
        setLocation(x, y);
    }
    public double getArea(){
        return side*side;
    }
    public double getPerimeter(){
        return 4*side;
    }
    public String toString() {
        return "Square has "+side+ " side x:"+getX()+" y:"+getY()+" "+super.toString();
    }
}
