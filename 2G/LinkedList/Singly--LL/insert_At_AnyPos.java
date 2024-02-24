public class insert_At_AnyPos {

    //create a class node
    static class node{
        int data;
        node next;

        node(int val){
            this.data = val;
            this.next = null;
        }
    }
    public static node insertAtHeading(node head,int val){
        //Task 1: create a new node;
        node newnode = new node(val);

        //Task2: new node ke next mein head daal do;
        newnode.next = head;

        //Task 3: update head;
        head = newnode;

        //Task 4 : return head;
        return head;
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

    public static node insertAtAnyPos(node head,int val,int pos){
        //Task 1: create a new node;
        if(pos <= 0){
            System.out.println("Invalid Pos");
            return head;
        }

        if(pos == 1){
            return insertAtHeading(head, val);
        }
        node newnode = new node(val);
        node prev = null;
        node curr = head;
        int count = 1;
        while (count < pos && curr != null) {
            prev = curr;
            curr = curr.next;
            count++;
        }
        prev.next = newnode;
        newnode.next = curr;
        return head;
    }

    public static void traverse(node head){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        node head = new node(5);
        node tail = head;

        head =  insertAtHeading(head,112);
        head = insertAtHeading(head,113);
        head = insertAtHeading(head,114);
        head = insertAtHeading(head,115);

        tail = insertAtTail(tail, 11);
        tail  = insertAtTail(tail, 12);
        tail  = insertAtTail(tail, 13);
        tail  = insertAtTail(tail, 14);

        head = insertAtAnyPos(head,1992,1);

        traverse(head);
        
    }
}
