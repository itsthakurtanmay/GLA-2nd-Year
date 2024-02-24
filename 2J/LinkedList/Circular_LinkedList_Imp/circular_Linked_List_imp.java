/**
 * circular_Linked_List_imp
 */
public class circular_Linked_List_imp {
    static class node{
        int data;
        node next;

        node(int val){
            this.data = val;
            this.next = null;
        }
    }

    public static node circularLinkedList(int val){
        node newnode = new node(val);
        newnode.next = newnode;
        return newnode;
    }

    public static node insertAtHead(node head,int val){
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

    public static void main(String[] args) {
        node head = circularLinkedList(12);
        head = insertAtHead(head,11);
        head = insertAtHead(head,10);
        head = insertAtHead(head,9);
        head = insertAtHead(head,8);

        traverse(head);
        
    }
}