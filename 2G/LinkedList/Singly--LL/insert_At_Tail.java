public class insert_At_Tail {

    //create a class node
    static class node{
        int data;
        node next;

        node(int val){
            this.data = val;
            this.next = null;
        }
    }

    public static node insertAtTail(node tail,int val){
        //task1 : create a new node
        node newnode = new node(val);

        //task 2: tail ke next mein newnode daal do;
        tail.next = newnode;

        //task 3: update tail;
        tail = newnode;

        //task4: return tail;
        return tail;
    }

    public static void traverse(node head){
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        node head = new node(5);
        node tail = head;
        tail = insertAtTail(tail,12);
        tail = insertAtTail(tail,11);
        tail = insertAtTail(tail,10);
        tail = insertAtTail(tail,9);

        traverse(head);

    }
    
}
