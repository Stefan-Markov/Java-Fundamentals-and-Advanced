import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String[] firstArray = new String[n];
        String[] secArray = new String[n];

        for (int i = 0; i < n; i++) {
            String[] currentLine = scan.nextLine().split(" ");
            if (i % 2 == 0) {

                firstArray[i] = currentLine[0];
                secArray[i] = currentLine[1];
            } else {
                firstArray[i] = currentLine[1];
                secArray[i] = currentLine[0];
            }
        }
        System.out.println(String.join(" ", firstArray));
        System.out.println(String.join(" ", secArray));
    }
}
