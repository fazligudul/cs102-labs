public class Rectangle extends Shape{
    int height;
    int width;

    public Rectangle(int width,int height,int x,int y){
        this.height=height;
        this.width=width;
        setLocation(x, y);
    }

    double getArea() {
        return width*height;
        
    }

    double getPerimeter() {
        return 2*(width+height);
    }

    public String toString() {
        return "Rectangle has "+width+ " width and " +height+" height x:"+getX()+" y:"+getY()+" "+super.toString();
    }
}
