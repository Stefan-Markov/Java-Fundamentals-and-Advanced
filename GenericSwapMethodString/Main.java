package GenericSwapMethodString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        List<Box<String>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new Box<>(bf.readLine()));

        }

        int[] indexes = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int indexOne = indexes[0];
        int indexTwo = indexes[1];

        swapIndexes(list, indexOne, indexTwo);

        for (Box<String> a : list) {
            System.out.println(a);
        }
    }

    private static void swapIndexes(List<Box<String>> list, int indexOne, int indexTwo) {
        Box<String> first = list.get(indexOne);
        Box<String> sec = list.get(indexTwo);
        list.set(indexOne, sec);
        list.set(indexTwo, first);
    }
}
