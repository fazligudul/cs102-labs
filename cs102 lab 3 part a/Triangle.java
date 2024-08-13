public class Triangle extends Shape{
    int a;
    int b;
    int c;
    public Triangle(int a,int b,int c,int x,int y){
        this.a=a;
        this.b=b;
        this.c=c;
        setLocation(x, y);
    }

    double getArea(){
        int s= (a+b+c) / 2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    double getPerimeter(){
        return a+b+c;
    }
    public String toString() {
        return "Triangle has sides "+a+" , "+b+" and "+c+" x:"+getX()+" y:"+getY()+" "+super.toString();
    }
}
