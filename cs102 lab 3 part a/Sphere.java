public class Sphere extends Shape3D{
    private int radius;
    public Sphere(int radius,int x,int y){
        this.radius=radius;
        setLocation(x, y);
    }

    double getArea(){
        return 4*Math.PI*Math.pow(radius, 2);
    }

    double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    double getVolume() {
        return 4/3*Math.PI*Math.pow(radius, 3);
    }
    public String toString() {
        return "Sphere has "+radius+ " radius "+getVolume()+" Volume x:"+getX()+" y:"+getY()+" "+super.toString();
    }
}
