import java.util.Stack;

/**
 * inbuilt_stack
 */
public class inbuilt_stack {
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();

        //push
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);

        System.out.println(st.pop());//5
        System.out.println(st.push(11));//11
        System.out.println(st.peek());//11
        System.out.println(st.pop());//11
        System.out.println(st.pop());//4
        System.out.println(st.peek());//3

        
    }

    
}