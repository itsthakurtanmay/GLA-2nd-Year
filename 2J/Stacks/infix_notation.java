import java.util.Stack;

public class infix_notation {
    public static int infixNotation(String s){
        Stack<Character>operator = new Stack<>();
        Stack<Integer>operands = new Stack<>();

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            int ascii = (int)ch;

            if(ascii >= 48 && ascii <= 57){
                operands.push(ascii - 48);
            }

            else if(operator.size() == 0){
                operator.push(ch);
            }
            else{
                if(ch == '+' || ch == '-'){
                    //task'
                    int v2 = operands.pop();
                    int v1 = operands.pop();

                    if(operator.peek() == '+')operands.push(v1+v2);
                    if(operator.peek() == '-')operands.push(v1-v2);
                    if(operator.peek() == '*')operands.push(v1*v2);
                    if(operator.peek() == '/')operands.push(v1/v2);

                    operator.pop();
                    operator.push(ch);
                }
                if(ch == '*' || ch == '/'){
                    //sometimes need to do task or some time not need
                    if(operator.peek() == '*' || operator.peek() == '/'){
                        int v2 = operands.pop();
                        int v1 = operands.pop();
    
                        if(operator.peek() == '+')operands.push(v1+v2);
                        if(operator.peek() == '-')operands.push(v1-v2);
                        if(operator.peek() == '*')operands.push(v1*v2);
                        if(operator.peek() == '/')operands.push(v1/v2);
    
                        operator.pop();
                        operator.push(ch);  
                    }

                }
            }
        }
        while(operands.size() > 1){
            // task
            int v2 = operands.pop();
            int v1 = operands.pop();

            if(operator.peek() == '+')operands.push(v1+v2);
            if(operator.peek() == '-')operands.push(v1-v2);
            if(operator.peek() == '*')operands.push(v1*v2);
            if(operator.peek() == '/')operands.push(v1/v2);

            operator.pop();

        }
        return operands.peek();
    }
    public static void main(String[] args) {
        String str = "9-5+3*4/6";
        int ans = infixNotation(str);
        System.out.println(ans); 
        
    }
}
