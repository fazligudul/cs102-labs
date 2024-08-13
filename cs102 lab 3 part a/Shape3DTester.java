import java.util.Scanner;

public class Shape3DTester {
    public static void main(String[] args) {
        int choice;
        Scanner scan = new Scanner(System.in);
        ShapeContainer3D container = new ShapeContainer3D();

        while (true) {
            System.out.println("1-) Create empty set of 3D shapes");
            System.out.println("2-) Add shape");
            System.out.println("3-) Compute&Printout total area, total perimeter and all info about shapes");
            System.out.println("4-) Find the first Shape that contains a given x, y point");
            System.out.println("5-) Remove all selected shapes from the set of shapes");
            System.out.println("6-) Exit");
            System.out.print("Enter a choice: ");
            choice=scan.nextInt();

            switch(choice){
                case 1:
                    container = new ShapeContainer3D();
                    break;
                case 2:
                    System.out.print("Enter a shape (Sphere, RectangularPrism, Cube): ");
                    String shape = scan.next();
                    System.out.println();
                    if(shape.equalsIgnoreCase("Sphere")){
                        System.out.print("Enter radius of circle and location x and y: ");
                        int radius=scan.nextInt();
                        int x=scan.nextInt();
                        int y=scan.nextInt();
                        container.add(new Sphere(radius,x,y));
                    }
                    else if(shape.equalsIgnoreCase("RectangularPrism")){
                        System.out.print("Enter width, length,breath of Rectangle and location x and y: ");
                        int width=scan.nextInt();
                        int height=scan.nextInt();
                        int breadth=scan.nextInt();
                        int x=scan.nextInt();
                        int y=scan.nextInt();
                        container.add(new RectangularPrism(width, height,breadth,x,y));
                    }
                    else if(shape.equalsIgnoreCase("Cube")){
                        System.out.print("Enter side of square and location x and y: ");
                        int side=scan.nextInt();
                        int x=scan.nextInt();
                        int y=scan.nextInt();
                        container.add(new Cube(side,x,y));
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
