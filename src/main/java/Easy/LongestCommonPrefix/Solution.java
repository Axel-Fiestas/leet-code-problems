package Easy.LongestCommonPrefix;

public class Solution {

    public String longestCommonPrefix(String[] strs){


        //flower,flow,flight

        String prefix = "";
        //Un auxiliar para ayudarme
        String aux = "";
        int iteratorLetras=0;

        //bucle para cada palabra
        for(int i=0;i<strs.length;i++) {

            String word = strs[i];
            //flower

            //Agarro la priemera letra
            String firstLetter;


            //Agarro la primera letra
            firstLetter=""+word.charAt(iteratorLetras);

            //Si el auxiliar no tiene nada (osea estoy en el primer bucle le proporciono el valor del firstLetter)
            if(aux.isEmpty()) aux=firstLetter;
            //Si tiene algo entonces lo comparo el auxiliar con la firstLetter de la nueva palabra
            else{

                //Si el auxiliar con el firstLetter
                if(aux==firstLetter){
                    aux=firstLetter;

                    //Si estamos en la última palabra
                    if(i==strs.length-1){
                        prefix+=aux;

                        iteratorLetras++;
                        //Aquí deberíamos hacer que el bucle for vuelva al inicio pero ahora con el nuevo iterator para seguir comparando

                    }

                }
                //Si son distintos rompo el bucle
                else{
                    break;
                }

            }


        }

        return prefix;
    }
}
