import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<String> names = new LinkedHashSet<>();
        int n = Integer.parseInt(scan.nextLine());
        while ((n-- > 0)) {
            String username = scan.nextLine();
            names.add(username);
        }
        for (String a : names) {
            System.out.println(a);
        }
    }
}
