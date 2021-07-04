package PersonalPractices;

import java.util.*;

public class OccurrenceOfCharacter {

    public static Map<Character, Integer> OccurrenceOfCharacterWithHashMap(String theString){

        char[] charArray = theString.toCharArray();

        List<Character> list =  new ArrayList<>();
        for (char c: charArray) {
            list.add(c);
        }

        Map<Character, Integer> map = new HashMap<>();
        for (char c: list) {
            if(map.containsKey(c)){
                int value = map.get(c) + 1;
                map.replace(c, value);
            }
            else{
                map.put(c, 1);
            }
        }

        return map;
    }


    public static void OccurrenceOfCharacterWithMaxChar(String str){

        final int MAX_CHAR = 256;
        int length = str.length();
        int[] allCharacters = new int[MAX_CHAR];

        for (int i = 0; i < length; i++){
            allCharacters[str.charAt(i)]++;
        }
        char[] strCharacters = new char[length];

        for (int i = 0; i < length; i++){
            strCharacters[i] = str.charAt(i);
            int find = 1;

            for (int j = 0; j < i; j++){
                if (str.charAt(i) == strCharacters[j])
                find++;
            }
            if (find == 1){
                System.out.println("Letter "+str.charAt(i)+" Occurred "+allCharacters[str.charAt(i)]+" Times");
            }
        }
    }


    public static void OccurrenceOfCharacterWithFrequency(int[] anArray){
        int length = anArray.length;
        int m = 0;
        for (int i = 0; i < length; i++){
            m = Math.max(m, anArray[i]);
        }

        int[] frequency = new int[m + 1];

        for (int i = 0; i < length; i++){
            frequency[anArray[i]]++;
        }
        for (int i = 0; i < m + 1; i++){
            if (frequency[i] > 0) {
                System.out.print(i + " ");
            }
        }
    }



    public static void main(String[] args) {

        String str = "GeeksForGeeks";
        String word = "Big Headed Big Head";
        int[] thisArr = {3, 33, 65, 3, 48, 48, 32, 79, 79};


        OccurrenceOfCharacterWithMaxChar(word);
        OccurrenceOfCharacterWithFrequency(thisArr);
        System.out.println(OccurrenceOfCharacterWithHashMap(str));

    }
}
