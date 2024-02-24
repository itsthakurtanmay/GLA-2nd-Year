/**
 * Implementation_of_circular_LL
 */
public class Implementation_of_circular_LL {
    static class node{
        int data;
        node next;

        //constructor
        node(int val){
            this.data = val;
            this.next = null;
        }
    }

    public static node insertATHead(node head,int val){
        node newnode = new node(val);
        if(head == null){
            newnode.next = newnode;
            return newnode; 
        }
        newnode.next = head;
        node tail = head;
        while(tail.next != head){
            tail = tail.next;
        }
        tail.next = newnode;
        return newnode;
    }

    public static void traverse(node head){
        node temp = head;
        do{
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        while(temp != head);
    }

    public static node createCircularLinkedList(int val){
        node newnode = new node(val);
        newnode.next = newnode;
        return newnode;
    }

    public static void main(String[] args) {
        node head = createCircularLinkedList(12);
        head = insertATHead(head,11);
        head = insertATHead(head,10);
        head = insertATHead(head,9);
        head = insertATHead(head,8);

        traverse(head);
        
    }
}