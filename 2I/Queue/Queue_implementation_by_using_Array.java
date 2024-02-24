/**
 * Queue_implementation_by_using_Array
 */
public class Queue_implementation_by_using_Array {
    static class Queue{
        int []arr;
        int rear;
        int front;
        int size;

        Queue(int size){
            this.arr = new int[size];
            this.rear = -1;
            this.front = -1;
            this.size = size;
        }
        public boolean isFull(){
            return rear ==  size-1;
        }

        public boolean isEmpty(){
            return front == -1;
        }

        public void enqueue(int element){
            if(isFull()){
                throw new IllegalStateException("Queue Overflow : cannot push new element becuase Queue is full");
            }
            if(isEmpty()){
                front = 0;
            }
            rear++;
            arr[rear] = element;
        }

        public int dequeue(){
            if(isEmpty()){
                throw new IllegalStateException("Queue Underflow : cannot pop new element becuase Queue is Empty");
            }
            if(front == rear){
                rear = -1;
                front = -1;
            }
            int pop_ele = arr[front];
            front++;
            return pop_ele;
        }



    }

    public static void main(String[] args) {
        Queue myqueue = new Queue(5);

        myqueue.enqueue(5);
        myqueue.enqueue(4);
        myqueue.enqueue(3);
        myqueue.enqueue(2);

        System.out.println(myqueue.dequeue());
        System.out.println(myqueue.dequeue());
    }
}