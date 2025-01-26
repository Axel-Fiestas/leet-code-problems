package Easy.LongestCommonPrefix;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public String longestCommonPrefix(String[] strs){


        //flower,flow,flight
        //Hacemos que el prefix obtenga el valor de la primera palabra
        String prefix=strs[0];


        //bucle para cada palabra
        for(String word: strs) {

            //prado
            //pro

            //Si la palabra tiene mas letras la reducimos al mismo tamaño del prefix
            if(word.length()>=prefix.length()) {
                word=word.substring(0,prefix.length());
            }//Si la palabra tiene menos digitos entonces hacemos que el prefix tenga la misma cantidad
            else{
                prefix=prefix.substring(0,word.length());
            }

            //Ir comparando (cómo hago esto...?)

            for(int i = 0; i < prefix.length(); i++) {

                if(prefix.charAt(i)!=word.charAt(i)) {
                    prefix=prefix.substring(0,i);
                }

                if(prefix.isEmpty()){
                    break;
                }
            }


            //Si ya no hay nada mas que comparar rompemos el bucle
            if(prefix.isEmpty()) {
                break;
            }


        }

        return prefix;
    }
}
