import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int[] firstArray = Arrays.stream(scan.nextLine()
                .split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] secArray = Arrays.stream(scan.nextLine()
                .split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < firstArray.length; i++) {
            sum += firstArray[i];

            if (firstArray[i] != secArray[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                return;
            }
        }
        System.out.printf("Arrays are identical. Sum: %d", sum);
    }
}
