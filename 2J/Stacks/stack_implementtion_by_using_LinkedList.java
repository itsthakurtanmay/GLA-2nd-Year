public class stack_implementtion_by_using_LinkedList {

    static class Node {
        int data;
        Node next;

        Node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    public Node top = null;

    public void push(int val) {
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        Node temp = top;
        top = top.next;
        return temp.data;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        stack_implementtion_by_using_LinkedList st = new stack_implementtion_by_using_LinkedList();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println("Popped: " + st.pop()); 
        System.out.println("Peek: " + st.peek());  
    }
}
