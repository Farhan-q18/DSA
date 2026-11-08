class Solution {
    public boolean isValid(String s) {
    Stack<Character> st = new Stack<>();        // create a stack
        for(int i=0 ;i<s.length(); i++){

            char ch = s.charAt(i);              // created a char ch beacause to store brackets
            if(ch == '('|| ch == '{' || ch == '['){  // now we keep on pushing the character
                st.push(ch);
            }
            else{                         // now we check is the stack empty is yes then return false
                if(st.isEmpty()){
                return false;
                }
            // if not then pop and then we check the stack top part and the ch simultaneously 
            // if its not the same then return false;
            char top = st.pop();

                if (ch == ')' && top != '(' ||
                    ch == '}' && top != '{' ||
                    ch == ']' && top != '[') {
                    return false;
                }
            }
        }
        // if thr stack is empty it means that all brackets has been matched and return true;
        return st.isEmpty();
    } 

}