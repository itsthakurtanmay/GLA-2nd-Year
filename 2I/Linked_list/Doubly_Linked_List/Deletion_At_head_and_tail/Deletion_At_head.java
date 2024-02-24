public class Deletion_At_head {
  static class node{
    int data;
    node next;
    node prev;
    
    node(int val){
      this.next = null;
      this.data = val;
      this.prev = null;
    }
  }
  
  public static node insertionAtHead(node head,int val){
    if(head == null){
      head = new node(val);
      return head;
    }
    node newnode = new node(val);
    
    newnode.next = head;
    head.prev = newnode;
    
    head = newnode;
    
    return head;
  }
  
  public static node insertionAtTail(node tail,int val){
    node newnode = new node(val);
    
    if(tail == null){
      tail = new node(val);
    }
    else{
      tail.next = newnode;
      newnode.prev = tail;
      tail = newnode;
    }
    return tail;
  }
  
  public static node deletionAtHead(node head){
    if(head == null){
      System.out.print("You are trying to delete a head node when Linked list is Empty !!");
      return null;
    }
    
    if(head.next == null && head.prev == null){
      head = null;
      System.out.println("Deleting a single head Node");
      return null;
    }
    node temp = head;
    head = head.next;
    head.prev = null;
    temp = null;
    return head;
  }
  
  public static node deletionAtTail(node head){
     if(head == null){
      System.out.print("linked list is empty");
      return null;
    }
    if(head.next == null && head.prev == null){
      System.out.print("single ll");
      return null;
    }
    node prev = null;
    node curr = head;
    
    while(curr.next != null){
      prev = curr;
      curr = curr.next;
    }
    prev.next = null;
    return head;
  }
  
  public static void traverse(node head){
    node temp = head;
    while(temp != null){
      System.out.print(temp.data+ " ");
      temp = temp.next;
    }
  }
  
    public static void main(String[] args) {
      node head = new node(12);
      node tail = head;
      
    
      head = insertionAtHead(head,11);
      head = insertionAtHead(head,10);
      head = insertionAtHead(head,9);
      head = insertionAtHead(head,8);
      
      traverse(head);
      System.out.println();
      
      tail = insertionAtTail(tail,13);
      tail = insertionAtTail(tail,14);
      tail = insertionAtTail(tail,15);
      tail = insertionAtTail(tail,16);
      
      traverse(head);
      System.out.println();
      
      head = deletionAtHead(head);
      traverse(head);
      System.out.println();
      
      head = deletionAtHead(head);
      traverse(head);
      System.out.println();
      
      
      head = deletionAtHead(head);
      traverse(head);
      System.out.println();
      
      head = deletionAtHead(head);
      traverse(head);
      System.out.println();
      
      head = deletionAtTail(head);
      traverse(head);
      System.out.println();
  }
}