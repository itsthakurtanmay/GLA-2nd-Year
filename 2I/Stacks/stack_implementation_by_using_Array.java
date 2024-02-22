public class stack_implementation_by_using_Array {
    static class stacks{
        int []arr;
        int top;
        int size;

        //constructor
        stacks(int length){
            this.arr = new int[length];
            this.top = -1;
            this.size = length;
        }

        public void push(int ele){
            if(top != size - 1){
                top++;
                arr[top] = ele;
            }
            else{
                throw new IllegalStateException("Stack Overflow: Cannot push ele becuase stack is full");
            }
        }

        public int pop(){
            if(top == -1){
                throw new IllegalStateException("Stack Underflow: Cannot pop ele from Empty stack");  
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
                throw new IllegalStateException("Cannot return top ele from Empty stack");
            }
        }

        public boolean isEmpty(){
            return top == -1;
        }
    }
    public static void main(String[] args) {
        stacks st = new stacks(5);
        st.push(11);
        st.push(12);
        st.push(13);
        st.push(14);

        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        
    }
}
