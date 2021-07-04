package PersonalPractices;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElimination {

    public static void main(String[] args) {

        System.out.println("Enter A Number Between 10 And 100");
        Scanner scanner = new Scanner(System.in);
        int i;
        int enteredNumber;
        int index = 0;
        int[] numberArray = new int [5];

            while(index < numberArray.length){
                enteredNumber = scanner.nextInt();
                if(enteredNumber < 10 || enteredNumber > 100){
                    System.out.println("Number Should Be Below Between 10 And 100");
                    continue;
                }
                for(i = 0; i < index; i++) {
                    if (enteredNumber == numberArray[i]){
                        break;
                    }
                }
                if (index == i){
                    numberArray[index] = enteredNumber;
                    index++;
                }
                else{
                    System.out.println("Number Already In Array");
                }
                System.out.println(Arrays.toString(numberArray));
                }

            }
}
