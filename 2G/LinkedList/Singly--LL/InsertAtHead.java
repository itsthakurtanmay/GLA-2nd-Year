/**
 * InsertAtHead
 */
public class InsertAtHead {

    static class node{
        int data;
        node next;

        node(int val){
            this.data = val;
            this.next = null;
        }
    }

    public static node insertAtHeading(node head,int val){
        node newnode = new node(val);
        newnode.next = head;
        head = newnode;
        return newnode;
    }

    public static void traverse(node head){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        node head = new node(11);
        head =  insertAtHeading(head,12);
        head = insertAtHeading(head,13);
        head = insertAtHeading(head,14);
        head = insertAtHeading(head,15);

        traverse(head);

        
    }
}