package org.veju.linkedList;

import lombok.Getter;
import lombok.Setter;

import java.util.NoSuchElementException;

@Getter
@Setter
public class LinkedList {
    private Node first;
    private Node last;

    public void addFirst(int num){
        Node node = new Node(num);
        if(last ==null){
            last = first = node;
        }else{
            Node temp = first;
            first = node;
            first.next = temp;
        }
    }
    public void addLast(int num){
        Node node = new Node(num);
        if(first==null){
            first = last = node;
        }else{
            last.next = node;
            last = node;
        }
    }
    public int indexOf(int num){
        int index = 0;
        Node current =  first;
        while(current!=null){
            if(current.value == num){
                return index;
            }
            current = current.next;
            index++;
        }
            return -1;
    }
    public boolean contains(int num){
//        Node current = first;
//        while(current!=null){
//            if(current.value==num){
//                return true;
//            }
//            current = current.next;
//        }
//        return false;
        return indexOf(num)>=0;
    }
    public void removeFirst() {
        //when nothing is in the list
        if(isEmpty())
            throw new NoSuchElementException();
        //when only one element exist
        if(first==last){
            first = last =null;
        }
        Node second = first.next;
        first.next=null;
        first=second;
    }

    public void removeLast(){
        Node
    }
    public  boolean isEmpty(){
        return first == null;
    }
    public static class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }
}
