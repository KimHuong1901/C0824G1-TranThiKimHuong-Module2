package ss10.bai_tap.liked_list;

import org.w3c.dom.Node;

public class MyLinkedList<E> {
    private Node head;
    private Node tail;
    private int numNode;
    public MyLinkedList() {}
    private class Node {
        private E data;
        private Node next;
        public Node(E data) {
            this.data = data;
        }
        public E getData() {
            return data;
        }
    }
    public void add(int index, E e) {
        if (index < 0 || index > numNode) throw new IndexOutOfBoundsException();
        if (index >= 0 ) {
            Node value = head;
            Node holder;
            for (int i = 0; i < index -1 && value.next != null; i++) {
                value = value.next;
            }
            holder = value.next;
            value.next = new Node(e);
            value.next.next = holder;
            numNode++;
        }
        }
        public  void addFirst(E data){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            numNode++;
            if (tail == null){
                tail = head;
            }
        }
        public void addLast(E data){
        Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
            numNode++;
        }
        public E remove (int index){
            Node value = head;
            E removedData;
        if (index < 0 || index >= numNode) {
            return null;
        }else {
            if(index == 0){
                removedData = head.data;
                head = head.next;
            } else {
                for (int i = 0; i < index - 1; i++) {
                    value = value.next;
                }
                removedData = value.next.data;
                value.next = value.next.next;
            }
            numNode--;
            return removedData;
        }
        }
        public boolean remove(Object e){
            if (head == null){
                return false;
            }
            if (head.data.equals(e)){
                head = head.next;
                numNode--;
                return true;
            }
            Node value = head;
            while (value.next != null){
                if(value.next.data.equals(e)){
                    value.next = value.next.next;
                    numNode--;
                    return true;
                }
                value = value.next;
            }
            return false;
        }
        public int size(){
        int count = 0;
        Node value = head;
            while (value!= null){
                count++;
                value = value.next;
            }
            return count;
        }
        public MyLinkedList<E> clone (){
        MyLinkedList<E> copiedList = new MyLinkedList<>();
            if(head == null){
                return copiedList;
            }
            copiedList.head = new Node (head.data);
            Node currentOriginal = head.next;
            Node currentCopy = copiedList.head;
            while (currentOriginal != null){
                currentCopy.next = new Node(currentOriginal.data);
                currentCopy = currentCopy.next;
                currentOriginal = currentOriginal.next;
            }
            copiedList.numNode = copiedList.numNode;
            return copiedList;
        }
        public Boolean contains(E o){
        Node value = head;
            while (value != null){
                if (value.data.equals(o)){
                    return true;
                }
                value = value.next;
            }
            return false;
        }
        public int indexOf (E o){
        int index = -1;
         Node value = head;
            for (int i = 0; i < numNode; i++) {
                if(value.data.equals(o)){
                   index = i;
                }
            }
           return index;
        }
        public boolean add (E e){
        Node newNode = new Node(e);
            if (head == null){
                head = newNode;
            }else {
                Node value = head;
                while (value.next != null){
                    value = value.next;
                }
                value.next = newNode;
            }
            numNode++;
            return true;
        }
        public void ensureCapacity (int minCapacity){
            if (minCapacity > numNode){
                for (int i = numNode; i < minCapacity; i++){
                }
            }
    }
        public E get(int i ){
            if (i < 0 || i >= numNode){
                return null;
            }
            Node value = head;
            for (int j = 0; j < numNode; j++) {
                value = value.next;
            }
            return value.data;
        }
        public E getFirst(){
            if(head == null){
                return null;
            }
            return head.data;
        }
        public E getLast(){
            if(head == null){
                return null;
            }
            Node value = head;
            while (value.next != null){
                value = value.next;
            }
            return value.data;
        }
        public void clear(){
        head = null;
        numNode = 0;
        }
}

