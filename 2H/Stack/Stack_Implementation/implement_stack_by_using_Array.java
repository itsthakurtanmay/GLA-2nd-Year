public class implement_stack_by_using_Array {
    static class stacks{
        int []arr;
        int top;
        int size;

        //constructor
        stacks(int size){
            this.arr = new int[size];
            this.top = -1;
            this.size = size;
        }

        //push
        public void push(int ele){
            if(top != size -1){
                top++;
                arr[top] = ele;
            }
            else{
                throw new IllegalStateException("Stack Overflow : Cannot push ele because stack is full");
            }
        }

        //pop
        public int pop(){
            if(top == -1){
                throw new IllegalStateException("Stack Underflow : Cannot pop ele from empty stack");   
            }
            else{
                int popped_ele = arr[top];
                top--;
                return popped_ele;
            }
        }

        //isEmpty
        public boolean isEmpty(){
            return top == -1;
        }

        //peek
        public int peek(){
            if(top == -1){
                throw new IllegalStateException("Cannot return peek ele from empty stack");
            }
            else{
                return arr[top];
            }
        }


    }
    public static void main(String[] args) {

        stacks st = new stacks(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println(st.pop());
        
    }
    
}
