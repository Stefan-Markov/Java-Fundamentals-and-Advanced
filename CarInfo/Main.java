package CarInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        List<Car> cars = new ArrayList<>();

        while (number-- > 0) {
            String input = scan.nextLine();

            String[] tokens = input.split(" ");
            String model = tokens[0];
            String brand = tokens[1];
            int horsePower = Integer.parseInt(tokens[2]);

            Car carInput = new Car(brand, model, horsePower);
            cars.add(carInput);
        }
        for (Car carRead : cars) {
            System.out.println(carRead.carInfo());
        }
    }
}
