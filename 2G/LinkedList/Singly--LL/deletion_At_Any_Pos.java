public class deletion_At_Any_Pos {
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

public static node DeletionAtTail(node head){
    if (head == null) {
      return null; // Empty list, nothing to delete
    }

    // Handle single node list
    if (head.next == null) {
      head = null;
      return null;
    }

    // Traverse to second last node
    node current = head;
    node prev = null;
    while (current.next != null) {
      prev = current;
      current = current.next;
    }

    // Detach and deallocate the tail node
    prev.next = null;
    current = null; // Optional, but good practice
    return head;
  }

    public static node deletionOfAnyNode(node head,int position) {
    if (head == null) {
      return null;  // Empty list
    }

    if (position == 0) {
      return deletionAthead(head);  // Handle head deletion separately
    }

    node current = head;
    int count = 0;
    while (current != null && count < position) {
      current = current.next;
      count++;
    }

    if (current == null) {
      return null;  // Position exceeds list length
    }

    // Find previous node of target node
    node prev = head;
    while (prev.next != current) {
      prev = prev.next;
    }

    // Detach the target node
    prev.next = current.next;

    // Deallocate the target node
    current.next = null;  // Optional, but good practice
    current = null;

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

        // traverse(head); 
        // System.out.println();
        // head = deletionAthead(head);
        // traverse(head); 

        // System.out.println();
        // head = DeletionAtTail(head);
        // traverse(head);

        // System.out.println();
        // head = DeletionAtTail(head);
        // traverse(head);

        // System.out.println();
        head = deletionOfAnyNode(head, 2);
        traverse(head);
        
    }   
}
