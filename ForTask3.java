public class ForTask3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int randomNumber = (int) (Math.random() * 100);
            if (i == 9) {
                System.out.print(randomNumber + " = ");
            } else {
                System.out.print(randomNumber + " + ");
            }
            sum += randomNumber;
        }
        System.out.println(sum);
    }
}
