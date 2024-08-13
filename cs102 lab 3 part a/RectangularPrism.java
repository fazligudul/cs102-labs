public class RectangularPrism extends Shape3D{
    int height;
    int width;
    int breadth;

    public RectangularPrism(int width,int height,int breadth,int x,int y){
        this.height=height;
        this.width=width;
        this.breadth=breadth;
        setLocation(x, y);
    }

    double getArea() {
        return 2*(width*height+breadth*height+width*breadth);
        
    }
    double getPerimeter() {
        return 2*(width+breadth)*height;
    }
    @Override
    double getVolume() {
        return width*breadth*height;
    }

    public String toString() {
        return "Rectangle Prism has "+width+ " width, " +height+" height and "+breadth+" breadth and "+getVolume()+" Volume x:"+getX()+" y:"+getY()+" "+super.toString();
    }

    

    
    
}
