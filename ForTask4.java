import java.util.Scanner;

public class ForTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько чисел будет?");
        int n = scanner.nextInt();
        int sum = 0;
        System.out.println("Введите " + n + " чисел через пробел");
        for (int i = 0; i < 10; i++) {
            int randomNumber = scanner.nextInt();
            sum += randomNumber;
            //необязательно печатать эти числа, но так, на всякий случай :)
            if (i == 9) {
                System.out.print(randomNumber + " = ");
            } else {
                System.out.print(randomNumber + " + ");
            }
        }
        System.out.println(sum);
    }
}
