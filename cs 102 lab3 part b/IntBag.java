import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class IntBag implements Iterable<Integer> {
    public int[] bag; //holds values of the collection
    public int STARTINGPOINT = 4;
    public int SENTINELVALUE = -1;
    private int size;
    public int stepValue;
    IntBagStepIterator bagStepIterator;

    public IntBag(){
        bag=new int[STARTINGPOINT];
        bag[0]=SENTINELVALUE;
        size=0;
    }
    public IntBag(int stepValue){
        bag=new int[STARTINGPOINT];
        bag[0]=SENTINELVALUE;
        size=0;
        this.stepValue=stepValue;
        IntBagStepIterator bagStepIterator=new IntBagStepIterator(stepValue);
        this.bagStepIterator=bagStepIterator;
    }
    class IntBagIterator implements Iterator<Integer>{
        private int index;
        public IntBagIterator(){
            
            index=0;
        }

        @Override
        public boolean hasNext() {
            return index<size;
        }

        @Override
        public Integer next() {
            if(! hasNext()){
                throw new NoSuchElementException();
            }
            int element=bag[index++];
            return element;
        }  
    }
     class IntBagStepIterator implements Iterator<Integer> {
        private int index;
        private int stepValue;
        public IntBagStepIterator(int stepValue) {
            index = 0; 
            this.stepValue=stepValue;
        }

        @Override
        public boolean hasNext() {
            return index < size ||index + stepValue < size; // Check if index+m is within bounds
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int element = bag[index];
            index += stepValue; // Move the index by the step value
            return element;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new IntBagIterator();
    }
    public Iterator<Integer> iterator(int stepValue) {
        return new IntBagStepIterator(stepValue);
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