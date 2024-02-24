public class Queue_Implementation_by_using_Array{
  static class Queue{
    int[]arr;
    int size;
    int front;
    int rear;
    
    //constructor
    
    Queue(int size){
      this.arr = new int[size];
      this.front = -1;
      this.rear = -1;
      this.size = size;
    }
    
    public boolean isEmpty(){
      return front == -1;
    }
    
    public boolean isFull(){
      return rear == size-1;
    }
    
    public void enqueue(int ele){
      if(isFull()){
        System.out.println("Queue Overflow");
        return;
      }
      if(isEmpty())front = 0;
      rear++;
      arr[rear] = ele;
      System.out.println(ele +" inserted data");
    }
    
    public int dequeue(){
      if(isEmpty()){
        System.out.println("Queue Underflow");
        return -1;
      }
      int pop_ele = arr[front];
      if(front == rear){
        front = -1;
        rear = -1;
      }
      else{
        front++;
      }
      return pop_ele;
    }
    public int peek(){
      if(isEmpty())return -1;
      else return arr[front];
    }
    
    
  }
    public static void main(String[] args) {
      Queue q = new Queue(5);
      
      q.enqueue(1);
      q.enqueue(2);
      q.enqueue(3);
      q.enqueue(4);
      
      int a = q.dequeue();//1
      System.out.println(a);
      int b = q.dequeue();//2
      System.out.println(b);
      
      
      int x = q.peek();//3
      System.out.println(x);
      
  }
}