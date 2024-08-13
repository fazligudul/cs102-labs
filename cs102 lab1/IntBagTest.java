import java.util.Arrays;

public class IntBagTest {
    public int[] bag; //holds values of the collection
    public int STARTINGPOINT = 4;
    public int SENTINELVALUE = -1;
    private int size;
    private int repeating;

    public IntBagTest(){
        bag=new int[STARTINGPOINT];
        bag[0]=SENTINELVALUE;
        size=0;
    }
    public void add(int num){
        for(int i=0;i<=size;i++){
            if(bag[i]==SENTINELVALUE){

                bag[i]=num;
                size++;
                if(i == size - 1){
                bag= Arrays.copyOf(bag, 2 * size);
                }
                bag[i+1]=SENTINELVALUE;
                break;
            }
        }

    }
    public void addToIndex(int num,int index){

        if(index<size){
            if(size==bag.length){
                bag= Arrays.copyOf(bag, 2 * size);
            }
            for(int i=0;i<size;i++){
                if(index==i){
                    size++;
                    for (int j = size; j > index; j--) {
                        bag[j]=bag[j-1];
                    }
                    bag[index]=num;
                }
            }
        }  
    }
    public void remove(int index){
        
        bag[index] = bag[size() - 1];
        bag[size() -1] = -1;

    }
    public boolean contains(int value){
        for (int i = 0; i < bag.length; i++) {
            if(bag[i]==value){
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {

        for (int i = 0; i < bag.length; i++) {
            if(bag[i] == -1){
                bag= Arrays.copyOf(bag, i);
                break;
            }
        }
        String str="";
        for (int i = 0; i < bag.length; i++) {
            str=str+bag[i]+" ";
        }
        return str;
    }
    public int size(){
        int size=0;
        for (int i = 0; i < bag.length; i++) {
            if(bag[i]==SENTINELVALUE){
                break;
            }
            size++;
        }
        return size;
    }
    public int getValue(int index){
        for (int i = 0; i < bag.length; i++) {
            if(index==i){
                return bag[i];
            }
        }
        return -1;
    }
    public void removeAll(int num){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (num == bag[j]) {
                    remove(j);
                } 
            }
        }
    }
}