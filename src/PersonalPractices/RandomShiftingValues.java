import java.util.Random;
import java.util.Scanner;

public class RandomShiftingValues {
    int answer;
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int lastCorrect = 0;
    int scores = 0;

    public void askQuestion(){
        int firstNumber = 2 + 2 *random.nextInt(10);
        int secondNumber = random.nextInt(19)+ 2;

        System.out.println("Your Answer Is ?\n"+ firstNumber +" + "+ secondNumber +" = ");
        int userAnswer = scanner.nextInt();
        answer = firstNumber + secondNumber;

        if(userAnswer == answer){
            lastCorrect = answer;
            scores++;
            System.out.println("\nCorrect !\nYour Score Is : "+scores+"\n");
            askQuestion();
        }
        else{
            System.out.println("\nWrong !\nYour Score Is : "+scores+"\n");
        }
    }


    public static void main(String[] args) {

        RandomShiftingValues randomShiftingValues = new RandomShiftingValues();
        randomShiftingValues.askQuestion();
    }
}
