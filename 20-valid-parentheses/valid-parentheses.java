import java.util.Stack;

class Solution {
   
       public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) { //dấu :(for-each duyệt từng phần tử) trong s, vd s = hello, print c = h e l l o
            if (c == '(' || c == '{' || c == '[') {  //ngoặc mở thì push vào
                stack.push(c);
            }else{
                if(stack.isEmpty()){ //nếu stack chưa có ngoặc mở thì trả về false
                    return false;
                }
                char last = stack.pop();
                if(
                    (c == ']' && last != '[') ||
                    (c == '}' && last != '{') ||
                    (c == ')' && last != '(')
                ){
                    return false;
                }
            }
        }
        return stack.isEmpty();// nếu empty thì nó trả về true    
    }
}
