/**
 * Stack_implementation_by_using_Array
 */
public class Stack_implementation_by_using_Array {
    static class stacks{
        int []arr;
        int top;
        int size;

        //constructor
        stacks(int len){
            this.arr = new int[len];
            this.top = -1;
            this.size = len;
        }

        public void push(int ele){
            if(top != size-1){
                top++;
                arr[top] = ele;
            }
            else{
                throw new IllegalStateException("Stack Overflow : Cannot push new ele in stack because stack is full");
            }
        }

        public int pop(){
            if(top == -1){
                throw new IllegalStateException("Stack Underflow : Cannot pop ele from Empty stack");
            }
            else{
                int pop_ele = arr[top];
                top--;
                return pop_ele;
            }
        }
        public int peek(){
            if(top >= 0){
                return arr[top];
            }
            else{
                throw new IllegalStateException("Cannot return top ele from empty stack");
            }
        }
        public boolean isEmpty(){
            return top == -1;
        }
    }

    public static void main(String[] args) {
        stacks st = new stacks(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println(st.pop());///4
        System.out.println(st.peek());//3
        System.out.println(st.isEmpty());//false
        
    }
}