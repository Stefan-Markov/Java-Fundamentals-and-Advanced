import java.util.Scanner;

public class PrintingTriangle {
    public static void printRow(int maxRowCount) {

        for (int i = 0; i < maxRowCount; i++) {
            System.out.print((i + 1 + " "));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maxRowCount = Integer.parseInt(scan.nextLine());
        for (int i = 0; i <= maxRowCount; i++) {
            printRow(i);
        }

        for (int i = maxRowCount - 1; i >= 1; i--) {
            printRow(i);
        }
    }
}
