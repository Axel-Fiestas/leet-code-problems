package Easy.ValidParentheses;

public class Solution {

    public boolean isValid(String s){

        boolean valid = true;

        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == '(' ){
                if(s.charAt(s.length()-i)==')'){
                    i++; //sale a la siguiente
                    return true;
                }else{
                    valid = false;
                    break;
                }
            }


            if(s.charAt(i) == '{' ){
                if(s.charAt(s.length()-i)=='}'){

                    i++; //sale a la siguiente
                    return true;
                }else{
                    valid = false;
                    break;
                }
            }

            if(s.charAt(i) == '[' ){
                if(s.charAt(s.length()-i)==']'){

                    i++; //sale a la siguiente
                    return true;
                }else{
                    valid = false;
                    break;
                }
            }



        }

        return valid;
    }


}
