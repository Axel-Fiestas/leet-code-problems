package Easy.ValidParentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {

    public boolean isValid(String s){

        Stack<Character> stack = new Stack<>();

        Map<Character,Character> map = new HashMap<>();

        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        for(char c : s.toCharArray()){

            if(map.containsValue(c)){
                stack.push(c);
            }else{

                if(stack.isEmpty() || stack.pop() != map.get(c)){
                    return false;
                }

            }

        }

        return stack.isEmpty();
    }


}
