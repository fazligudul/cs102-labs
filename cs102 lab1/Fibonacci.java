public class Fibonacci {
    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        int n3;
        IntBagTest obj1 = new IntBagTest();
        obj1.add(n1);
        obj1.add(n2);
        for (int i = 2; i < 40; i++) {
            n3=n1+n2;
            obj1.add(n3);
            n1=n2;
            n2=n3;
        }
        //obj1.addToIndex(50, 2);
        //obj1.remove(2);
        //obj1.removeAll(1);
        System.out.println(obj1.toString());
        
    }
}
