import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;

        int[] train = new int[n];
        for (int i = 0; i < train.length; i++) {
            train[i] = Integer.parseInt(scan.nextLine());
        }
        for (int wagon : train) {
            sum += wagon;
            System.out.print(wagon + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
