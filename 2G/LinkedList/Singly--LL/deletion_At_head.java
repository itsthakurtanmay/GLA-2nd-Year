public class deletion_At_head {

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

    public static void traverse(node head){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }

    //OPTION 1: Deletion a node at head;
    // public static node deletionAthead(node head){
    //     //Step 1: Update head Reference
    //     head = head.next;

    //     //step 2 : Return the new head reference
    //     return head;
    // }

    //OPTION 2: Deletion a node at head;
    public static node deletionAthead(node head) {
    if (head == null) {
      return null; // Empty list, nothing to delete
    }

    // Store reference to current head in temp node 
    node temp = head;

    // Update head pointer to the next node
    head = head.next;

    // Detach and deallocate the old head
    temp.next = null;  // Optional, but good practice
    temp = null;        // Not strictly necessary with garbage collection, 
                         // but helps avoid potential issues
    return head;                     
  }

    public static void main(String[] args) {
        node head = new node(11);
        head =  insertAtHeading(head,12);
        head = insertAtHeading(head,13);
        head = insertAtHeading(head,14);
        head = insertAtHeading(head,15);

        traverse(head); 
        System.out.println();
        head = deletionAthead(head);
        traverse(head); 

    }
}
