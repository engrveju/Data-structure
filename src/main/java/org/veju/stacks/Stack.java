package org.veju.stacks;

public class Stack {
    public String reverse(String item){
        java.util.Stack<Object> stack = new java.util.Stack<>();
//        String[] arr = item.split("");
        for(int i=item.length()-1;i>=0;i--){
            stack.push(item.charAt(i));
        }
        String ans="";
        return  ans+=stack.pop();
    }
}
