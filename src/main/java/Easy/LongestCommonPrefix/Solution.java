package Easy.LongestCommonPrefix;

public class Solution {

    public String longestCommonPrefix(String[] strs){

        if(strs == null) return "";

        String firstLetter="";

        for(String word: strs){

            //Agarramos la primera letra de la palabra
            if(firstLetter==""){
                firstLetter=""+word.charAt(0);
            }else{

                //Si ya pasó la primera palabra, osea estamos en la segunda
                String firstLetterFromNextWord= ""+word.charAt(0);
                //Comparamos
                if(firstLetter== firstLetterFromNextWord){

                }
            }



        }
        return "";
    }
}
