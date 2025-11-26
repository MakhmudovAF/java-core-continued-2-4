import java.util.Random;
import java.util.Scanner;

public class Practicum {
    public static void main(String[] args) {
        Random random = new Random();
        int target = random.nextInt(1000) + 1;
        System.out.println("Я загадал число. Попробуйте угадать!");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int userGuess = scanner.nextInt();

            if (userGuess < target) {
                System.out.println("Ваше число меньше");
            } else if (userGuess > target) {
                System.out.println("Ваше число больше");
            } else  {
                System.out.println("Правильный ответ");
                break;
            }
        }
    }
}