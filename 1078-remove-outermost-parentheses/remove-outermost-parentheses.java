class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(char ch:s.toCharArray()){
        if(ch == '('){
          if(!stack.isEmpty()){
            ans.append(ch);
          }
          stack.push(ch);
        }
        else{
            if(stack.size()>1){
                ans.append(ch);
            }
           
            stack.pop();
           
        }
       
             
        }
return ans.toString();
        }
    }
