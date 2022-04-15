import java.util.Scanner;

public class ForTask5 {
    public static void main(String[] args) {
        //эта задача уже была решена во внешнем материале
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int multiplication = 1;
        for (int i = 1; i <= number; i++) {
            multiplication *= i;
        }
        System.out.println(number + "! = " + multiplication);
    }
}
