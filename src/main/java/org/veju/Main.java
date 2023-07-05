package org.veju;

import org.veju.linkedList.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(9);
        list.addFirst(1);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(7);
//        System.out.println(list.indexOf(4));

        LinkedList list2 = new LinkedList();
        list2.addLast(3);
        list2.addLast(1);
        list2.addLast(9);
        list2.addLast(4);
        list2.addLast(7);
        System.out.println(list2.size()+"Size");
        System.out.println(list2.indexOf(3));
        System.out.println(list2.indexOf(7));
        list2.reverse();
        System.out.println(list2.size()+"After reverse");
        System.out.println(list2.indexOf(3));
        System.out.println(list2.indexOf(7));
        System.out.println(list2);

//        list2.removeLast();
//        list2.removeLast();
//        System.out.println(list2.size());
//        list2.removeLast();
//        System.out.println(list2.size());
//        list2.removeLast();
//        list2.removeLast();
//        System.out.println(list2.size());
//        list2.removeLast();
//        System.out.println(list2.size());


    }
}
