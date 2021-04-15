package CustomListIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        CustomList<String> list = new CustomList<>();


        String input = bf.readLine();
        while (!input.equals("END")) {
            String[] tokens = input.split(" ");
            switch (tokens[0]) {
                case "Add":
                    list.add(tokens[1]);
                    break;
                case "Max":
                    System.out.println(list.getMax());
                    break;
                case "Min":
                    System.out.println(list.getMin());
                    break;
                case "Greater":
                    String check = tokens[1];
                    System.out.println(list.countGreater(check));
                    break;
                case "Swap":
                    int first = Integer.parseInt(tokens[1]);
                    int second = Integer.parseInt(tokens[2]);
                    list.swap(first, second);
                    break;
                case "Contains":
                    String check1 = tokens[1];
                    System.out.println(list.contains(check1));
                    break;
                case "Print":

                    for (String s : list) {
                        System.out.println(s);
                    }

                    break;
                case "Sort":
                    list.sort(list);

            }
            input = bf.readLine();
        }
    }
}

