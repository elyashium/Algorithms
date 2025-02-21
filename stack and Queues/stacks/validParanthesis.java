class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '(' || c=='{' || c== '['){
                st.push(c);
            }
            else{

                //edge case 
                if(st.isEmpty()){
                    return false;
                }
                //c is a closing braket.
                char top = st.peek();
                if((c==')' && top =='(') || (c=='}' && top =='{') || (c==']' && top =='[')){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        //if it empty, means every brackect has a closure, so it will be returned true
        //if not empty, means some brackects remain, so it will be false.
        return st.isEmpty();
    }
}