import java.util.Arrays;

public class ArsList <T> {
    private static final int CAPACITY=10;
    private static int size;
    private Object[] arr;

    public ArsList() {
        arr=new Object[CAPACITY];
        size=0;
    }

    public ArsList(int capacity) {
        arr=new Object[capacity];
        size=0;
    }

    public int size(){
        return size;
    }

    public int getCapacity(){
        return arr.length;
    }

    public void add(T data){
        if (size == arr.length){
            int newSize= arr.length * 2;
            arr= Arrays.copyOf(arr,newSize);
        }
        arr[size++]=data;
    }

    public  T get(int index){
         return arr[index]==null ? null : (T)arr[index];
    }




}
