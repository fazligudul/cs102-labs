import java.util.ArrayList;

public class ShapeContainer {
    ArrayList<Shape> shapes;
    public ShapeContainer(){
        shapes= new ArrayList<Shape>();
    }
    public String getFirstShapeHas(int x, int y){
        for (Shape s:shapes) {
            if(s.contains(x, y)){
                s.setSelected(true);
                return s.toString();
            }
        }
        return "There is no shape at that location";
    } 
    public void removeSelectedShapes(){
        for(Shape s:shapes){
            if(s.getSelected()) shapes.remove(shapes.indexOf(s));
        }
    }

    public void add(Shape s){
        shapes.add(s);
    }

    public double getArea(){
        int sum=0;
        for(Shape s:shapes){
            sum+=s.getArea();
        }
        return sum;
    }

    double getPerimeter(){
        int sum=0;
        for(Shape s:shapes){
            sum+=s.getPerimeter();
        }
        return sum;
    }

    public String toString() {
        String str;
        str="Total Surface Area is "+ getArea()+"\nTotal Lenght of Perimeters is "+getPerimeter()+"\n";
        for(Shape s: shapes){
            str+=s.toString()+"\n";
        }
        return str;
    }
}
