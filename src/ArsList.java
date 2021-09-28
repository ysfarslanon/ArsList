import java.util.Arrays;

public class ArsList <T> {
    private static final int CAPACITY=10;
    private static int size;
    private T[] arr;

    public ArsList() {
        arr=(T[]) new Object[CAPACITY];
        size=0;
    }

    public ArsList(int capacity) {
        arr= (T[]) new Object[capacity];
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

    public T remove(int index)  {
        if (index < 0 || index > size) {
            return null;
        }else{
            T deleted=arr[index];
            System.arraycopy(arr, index + 1, arr, index, size - index);
            /*
            for (int i = index; i <size ; i++) {
                arr[i]=arr[i+1];
            }
            */
            size--;
            return deleted;
        }

    }
    public T set(int index , T data){
        if (index < 0 || index > size) {
            return null;
        }else{
            arr[index] = data;
            return data;
        }

    }

    @Override
    public String toString() {
        String result="[";
        for (int i = 0; i < size ; i++) {

            if (arr[i] != null) {
                result += arr[i];
                if (i != (size-1)) {
                    result+=",";
                }
            }
        }
       result += "]";
        return result;
    }

    public int indexOf(T data){
        for (int i = 0; i < size; i++) {
            if (arr[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data){
        for (int i = size-1; i >=0 ; i--) {
            if (arr[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty(){
        if (size > 0) {
            return false;
        }
        return true;
    }

    public T[] toArray(){
        T[] newArr = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public void clear(){
        for (int i = 0; i < size; i++) {
            arr[i]=null;
        }
        size=0;
    }

    public ArsList<T> sublist(int start, int finish){
        //start including, finish not included
        ArsList<T> newSubList = new ArsList<>(finish - start);
        if(start < 0 || finish > getCapacity() || finish < 0 || finish < start){
            return null;
        }
        for (int i = start; i < finish; i++) {
            newSubList.add(arr[i]);
        }
        return newSubList;
     }

}
