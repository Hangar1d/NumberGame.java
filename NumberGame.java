import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int answer = random.nextInt(20) + 1; //random number between 1 and 20
        int guess = 0; 
        int attempts = 0; 
        System.out.print("정답을 추측하여 보시오: ");
        while (guess != answer) {
            guess = input.nextInt();
            attempts++;
            if (guess < answer) {
                // the user's guess is too low
                System.out.println("입력한 정수가 높습니다.");
            } else if (guess > answer) {
                // the user's guess is too high
                System.out.println("입력한 정수가 낮습니다.");
            } else {
                // the user's guess is correct
                System.out.println("축하합니다. 시도횟수= " + attempts);
            }
        }
        input.close();
    }
}
