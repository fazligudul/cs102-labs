import java.util.Scanner;

public class ShapeTester {
    public static void main(String[] args) {
        int choice;
        Scanner scan = new Scanner(System.in);
        ShapeContainer container = new ShapeContainer();

        while (true) {
            System.out.println("1-) Create empty set of shapes");
            System.out.println("2-) Add shape");
            System.out.println("3-) Compute&Printout total area, total perimeter and all info about shapes");
            System.out.println("4-) Find the first Shape that contains a given x, y point");
            System.out.println("5-) Remove all selected shapes from the set of shapes");
            System.out.println("6-) Exit");
            System.out.print("Enter a choice: ");
            choice=scan.nextInt();

            switch(choice){
                case 1:
                    container = new ShapeContainer();
                    break;
                case 2:
                    System.out.print("Enter a shape (Circle, Rectangle, Square or Triangle): ");
                    String shape = scan.next();
                    System.out.println();
                    if(shape.equalsIgnoreCase("Circle")){
                        System.out.print("Enter radius of circle and location x and y: ");
                        int radius=scan.nextInt();
                        int x=scan.nextInt();
                        int y=scan.nextInt();
                        container.add(new Circle(radius,x,y));
                    }
                    else if(shape.equalsIgnoreCase("Rectangle")){
                        System.out.print("Enter width and length of Rectangle and location x and y: ");
                        int width=scan.nextInt();
                        int height=scan.nextInt();
                        int x=scan.nextInt();
                        int y=scan.nextInt();
                        container.add(new Rectangle(width, height,x,y));
                    }
                    else if(shape.equalsIgnoreCase("Square")){
                        System.out.print("Enter side of square and location x and y: ");
                        int side=scan.nextInt();
                        int x=scan.nextInt();
                        int y=scan.nextInt();
                        container.add(new Square(side,x,y));
                    }
                    else if(shape.equalsIgnoreCase("Triangle")){
                        System.out.print("Enter sides a,b and c of Triangle and location x and y: ");
                        int a=scan.nextInt();
                        int b=scan.nextInt();
                        int c=scan.nextInt();
                        int x=scan.nextInt();
                        int y=scan.nextInt();
                        container.add(new Triangle(a, b, c,x,y));
                    }
                    break;
                case 3:
                    System.out.println(container.toString());
                    break;
                case 4:
                    System.out.print("Enter point locations x and y to select a shape: ");
                    int x=scan.nextInt();
                    int y=scan.nextInt();
                    System.out.println();
                    System.out.println(container.getFirstShapeHas(x, y));
                    break;
                case 5:
                    container.removeSelectedShapes();
                    System.out.println("Selected shapes are removed");
                    break;
                case 6:
                    System.out.println("Extiting..");
                    System.exit(0);
                    break;
                default:
                System.out.println("Invalid choice. Please try again.");
                break;
                
            }
        }
    }
}
