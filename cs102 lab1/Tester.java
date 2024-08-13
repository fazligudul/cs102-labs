import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int choice;
        Scanner scan = new Scanner(System.in);
        IntBagTest bag = new IntBagTest();
        while (true) {
            System.out.println("Please choose a menu option:");
            System.out.println("1 Create a new empty collection(any previous values are lost!");
            System.out.println("2 Read a set of positive values into the collection (use zero to indicate all the values have been entered.)");
            System.out.println("3 Print the collection of values.");
            System.out.println("4 Add a value to the collection of values at a specified location");
            System.out.println("5 Remove the value at a specified location from the collection of values");
            System.out.println("6 Remove all instances of a value within the collection* (see note below).");
            System.out.println("7 Quit the program.");
            System.out.print("Enter choice:");
            choice=scan.nextInt();

            switch (choice) {
                case 1:
                    bag = new IntBagTest();
                    break;
                case 2:
                    int value = scan.nextInt();
                    while (value != 0) {
                    bag.add(value);
                    value = scan.nextInt();
                    }
                    break;
                case 3:
                    System.out.println("Collection of values: " + bag.toString());
                    break;
                case 4:
                    System.out.print("Enter a value: ");
                    value = scan.nextInt();
                    System.out.print("Enter index: ");
                    int index = scan.nextInt();
                    bag.addToIndex(value, index);
                    break;
                case 5:
                    System.out.print("Enter the index: ");
                    index = scan.nextInt();
                    bag.remove(index);
                    break;
                case 6:
                    System.out.print("Enter the value: ");
                    value = scan.nextInt();
                    bag.removeAll(value);
                    break;
                case 7:
                    System.out.println("Exiting..");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        System.out.println();
        }
    }
}
