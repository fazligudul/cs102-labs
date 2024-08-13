import java.util.Iterator;
import java.util.Scanner;

//import IntBag.IntBagIterator;

public class TestIterators {
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        IntBag bag = new IntBag();
    //  … insert some elements
        bag.add(10);
        bag.add(20);
        bag.add(30);
        bag.add(40);
        bag.add(50);
    Iterator i, j;
    i = bag.iterator();
    while ( i.hasNext() ){
        System.out.println( i.next() );
        j = bag.iterator();
        while ( j.hasNext() )
        {
            System.out.println( "--" + j.next() );
        }
    }
    System.out.println("All values  "+bag.toString());
    System.out.println("Enter a value to step");
    int step=scan.nextInt();
    
    Iterator<Integer> iterator2=bag.iterator(step);
    //bag.bagStepIterator
    while (iterator2.hasNext()) {
        int element=iterator2.next();
        System.out.print(element+" ");
    }
    
    }
    
}
