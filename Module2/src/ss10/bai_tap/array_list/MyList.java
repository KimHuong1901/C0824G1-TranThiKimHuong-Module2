package ss10.bai_tap.array_list;

import java.util.Arrays;

public class MyList <E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    MyList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero.");
        }
        elements = new Object[capacity];
    }
    public void add(int index, E element){
        if (index < 0 || index > size){
            System.out.println("Invalid value");
        }
        if (DEFAULT_CAPACITY == size){
            size +=1;
        }
        for (int i = size; i > index; i--){
            elements[i] = elements[i-1];
        }
        elements[index] = element;
        size++;
    }
    public E remove(int index){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }
        E removed = (E) elements[index];
        if (index >= 0 && index < DEFAULT_CAPACITY){
           for (int i = index; i < size; i++){
               elements[i] = elements[i + 1];
           }
        }
        elements[size - 1] = null;
        size--;
        return removed;
    }
    public int size(){
        return size;
    }
  public E clone (){
        MyList<E> newList = new MyList<>(this.size);
        for (int i = 0; i < size; i++){
            newList.add((E) elements[i]);
        }
        return (E) newList;
  }
    public boolean contains(E o){
            for(int i = 0; i < size; i++){
                if(elements[i].equals(o)){
                    return true;
                }
            }
        return false;
    }
    public int indexOf(E o){
        for (int i = 0; i < size; i++){
            if(elements[i].equals(o)){
                return i;
            }
        }
        return -1;
    }
    public boolean add(E o){
        elements[size] = o;
        size++;
        return true;
    }

    public void ensureCapacity(int minCapacity){
        int currentCapacity =  elements.length;
        if (minCapacity > currentCapacity){
            int newCapacity = minCapacity * 2;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elements[i];
    }
    public void clear(){
        for (int i = 0; i < size; i++){
            elements[i] = null;
        }
        size = 0;
    }
}
