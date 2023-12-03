package GbList;

import java.util.Arrays;

public class GbArrayList<T> implements GbList<T> {

    private T[] values;
    private int size;
    private int capacity;

    public GbArrayList() {
        capacity = 16;
        // try - попробуй
        try {
            this.values = (T[]) new Object[capacity];
        // catch - поймай
        } catch (ClassCastException e){
            // выведи ошибки
            e.printStackTrace();
        }
        size = 0;
    }
    
    private void addCapasity(){
        T[] temp = (T[]) new Object[capacity/2 * capacity];
        System.arraycopy(values, 0, temp, 0, values.length);
        values = temp;
    }

    @Override
    public GbList<T> add(T item) {
        if (size == capacity){
            addCapasity();
        }
        values[size++] = item;
        return this;
    }

    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public GbList<T> remove(int index) {

        T[] temp = values;
        values = (T[]) new Object[temp.length - 1];
        System.arraycopy(temp, 0, values, 0, index);
        int amountItemAfterIndex = temp.length - index - 1;
        System.arraycopy(temp, index + 1, values, index, amountItemAfterIndex);
        size--;
        return this;
    }



    @Override
    public boolean update(T item, int index) {
        try {
            values[index] = item;
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

//    @Override
//    public String toString() {
//        return "GbArrayList{" +
//                "values=" + Arrays.toString(values) +
//                ", size=" + size +
//                ", capacity=" + capacity +
//                '}';
//    }

        @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        int i = 0;
        while (values[i] != null) {
            builder.append(values[i]).append(", ");
            i++;
        }
        if (builder.length() == 1)
            return "[]";
        builder.deleteCharAt(builder.length() - 1).deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();
    }

}
