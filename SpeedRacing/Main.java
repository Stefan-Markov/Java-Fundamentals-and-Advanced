package SpeedRacing;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        List<Car> cars = new LinkedList<>();

        while (n-- > 0) {
            String[] input = sc.nextLine().split("\\s+");

            Car car = new Car(input[0], Double.parseDouble(input[1]), Double.parseDouble(input[2]));
            cars.add(car);
        }

        String line;
        while (!(line = sc.nextLine()).equals("End")) {
            String[] tokens = line.split("\\s+");
            String model = tokens[1];
            int distance = Integer.parseInt(tokens[2]);

            for (Car car : cars) {
                if (car.getModel().equals(model)) {
                    if (car.canMove(distance)) {
                        car.setDistanceTravelled(car.getDistanceTravelled() + distance);
                        double fuelTorem = car.getFuelCostForKm() * distance;
                        car.setFuel(car.getFuel() - fuelTorem);
                    } else {
                        System.out.println("Insufficient fuel for the drive");
                    }
                }
            }
        }
        cars.forEach(car -> {
            System.out.println(String.format("%s %.2f %d",
                    car.getModel(), car.getFuel(), car.getDistanceTravelled()));
        });
    }
}
