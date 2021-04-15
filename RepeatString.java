import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String toRepeat = scan.nextLine();
        int times = Integer.parseInt(scan.nextLine());

        String result = toRepeat(toRepeat, times);
        System.out.println(result);
    }

    public static String toRepeat(String toRepeat, int times) {
        String result = " ";

        for (int i = 0; i < times; i++) {
            result += toRepeat;
        }
        return result;
    }
}
