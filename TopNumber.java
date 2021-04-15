import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            int one = i % 10;
            int two = i / 10;
            int sum =  one + two;
            if( sum % 8 ==0 && i % 2 != 0 ){
                System.out.println(i);
            }
        }
    }
}
