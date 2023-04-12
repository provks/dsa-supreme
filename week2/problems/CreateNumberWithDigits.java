package week2.problems;

public class CreateNumberWithDigits {
    public static void main(String[] args) {
        int digits[] = {8, 2, 3, 7};

        int number = 0;
        for (int i=0; i<4; i++) {
            number = number * 10 + digits[i];
        }
        System.out.println(number);
    }
}
