import java.util.Scanner;

public class HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder htmlText = new StringBuilder();

        htmlText.append("<h1>")
                .append(System.lineSeparator())
                .append("    ").append(scanner.nextLine())
                .append(System.lineSeparator())
                .append("</h1>")
                .append(System.lineSeparator())
                .append("<article>")
                .append(System.lineSeparator())
                .append("    ").append(scanner.nextLine())
                .append(System.lineSeparator())
                .append("</article>")
                .append(System.lineSeparator());

        String inputComments = scanner.nextLine();

        while (!inputComments.equals("end of comments")) {
            htmlText.append("<div>")
                    .append(System.lineSeparator())
                    .append("    ").append(inputComments)
                    .append(System.lineSeparator())
                    .append("</div>")
                    .append(System.lineSeparator());
            inputComments = scanner.nextLine();
        }
        System.out.println(htmlText.toString());
    }
}
