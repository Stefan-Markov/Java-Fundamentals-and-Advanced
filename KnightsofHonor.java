import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class KnightsofHonor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> info = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());

        Consumer<List<String>> names = name -> {
            for (String str : name) {
                System.out.println("Sir " + str);
            }
        };
        names.accept(info);
    }
}
