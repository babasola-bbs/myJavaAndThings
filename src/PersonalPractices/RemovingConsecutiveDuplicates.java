package PersonalPractices;

public class RemovingConsecutiveDuplicates {

    public static int usingTwoArrays(int[] theArray){

        int length = theArray.length;
        int[] anotherArray = new int[length];
        int countingUnique = 0;

        for(int i = 0; i < length - 1; i++){
            if (theArray[i] != theArray[i + 1])
            anotherArray[countingUnique++] = theArray[i];
        }

        anotherArray[countingUnique++] = theArray[length - 1];

        for (int i = 0; i < countingUnique; i++){
            theArray[i] = anotherArray[i];
        }

        return countingUnique;
    }


    public static int usingOneArray(int[] similarArray){

        int length = similarArray.length;
        int j = 0;

        for (int m = 0; m < length - 1; m++){
            if (similarArray[m] != similarArray[m + 1]){
                similarArray[j++] = similarArray[m];
            }
        }
        similarArray[j++] = similarArray[length - 1];
        return j;
    }



    public static void main(String[] args) {

        int[] sentArray = {3, 2, 2, 7, 6, 6, 9, 9, 4};
        int j = usingTwoArrays(sentArray);
        for (int i = 0; i < j; i++){
            System.out.print(sentArray[i] + " ");
        }

        System.out.println();

        int k = usingOneArray(sentArray);
        for (int l = 0; l < k; l++){
            System.out.print(sentArray[l] + " ");
        }

    }
}
