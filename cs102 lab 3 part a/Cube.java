public class Cube extends Shape3D{
    int side;
    public Cube(int side,int x,int y){
        this.side=side;
        setLocation(x, y);
    }
    public double getArea(){
        return 6*Math.pow(side, 2);
    }
    public double getPerimeter(){
        return 12*side;
    }
    double getVolume() {
        return Math.pow(side, 3);
    }
    public String toString() {
        return "Cube has "+side+ " side "+getVolume()+" Volume x:"+getX()+" y:"+getY()+" "+super.toString();
    }
    
}
