package Easy.LongestCommonPrefix;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public String longestCommonPrefix(String[] strs){


        //flower,flow,flight

        StringBuilder prefix = new StringBuilder();
        //Una lista auxiliar para ayudarme
        List<String> listaAuxiliar = new ArrayList<String>();
        //boolean

        //bucle para cada palabra
        for(int i=0;i<strs.length;i++) {

            String word= strs[i];


            for(int letraPos=0;letraPos<word.length();letraPos++) {

                if(i==0){
                     listaAuxiliar.add(""+word.charAt(letraPos));
                }else{

                    if(listaAuxiliar.get(letraPos) .contentEquals(""+word.charAt(letraPos))){

                        prefix.append(word.charAt(letraPos));



                    }else{
                        break;
                    }
                }

            }


        }

        return prefix.toString();
    }
}
