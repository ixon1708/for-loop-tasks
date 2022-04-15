import java.util.Scanner;

public class ForTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrimary = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrimary = false;
                break;
            }
        }
        if (isPrimary) {
            System.out.println(number + " простое");
        } else {
            System.out.println(number + " не простое");
        }
    }
}
