package PersonalPractices;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class AddDistinct {

    public static void main(String[] args) {

        int sum = 0;
        int[] myArray = {2, 2, 3, 3, 7, 7, 9, 9, 23, 23};
        HashSet <Integer> myHash = new HashSet<>();
        for (int i = 0; i < myArray.length; i++){
            if (!myHash.contains(myArray[i])){
                myHash.add(myArray[i]);
                sum += myArray[i];
            }
        }
        System.out.println(sum);


    }
}
