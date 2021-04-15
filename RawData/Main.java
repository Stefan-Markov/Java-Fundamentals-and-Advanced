package RawData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        List<Car> cars = new ArrayList<>();


        while (n-- > 0) {
            String[] tokens = bf.readLine().split("\\s+");

            String model = tokens[0];
            int speed = Integer.parseInt(tokens[2]);
            int power = Integer.parseInt(tokens[1]);
            int weight = Integer.parseInt(tokens[3]);
            String cargoType = tokens[4];

            ArrayList<Tire> tireList = new ArrayList<>();


            for (int i = 5; i < 12; i += 2) {
                int a = i + 1;
                Tire tire = new Tire(Double.parseDouble(tokens[i]), Integer.parseInt(tokens[a]));
                tireList.add(tire);
            }
            Engine engine = new Engine(speed, power);

            Cargo cargo = new Cargo(weight, cargoType);

            Car car = new Car(model, engine, cargo, tireList);

            cars.add(car);

        }
        String type = bf.readLine();
        if (type.equals("fragile")) {

            List<String> model = new ArrayList<>();
            for (int i = 0; i < cars.size(); i++) {
                if (cars.get(i).getCargo().getCargoType().equals("fragile")) {
                    if (cars.get(i).getTire().get(i).getTirePressure() < 1) {
                        model.add(cars.get(i).getModel());
                    }
                }
            }
            model.forEach(System.out::println);

        } else {
            for (Car car : cars) {
                if (car.getCargo().getCargoType().equals("flamable")) {
                    if (car.getEngine().getEnginePower() > 250) {
                        System.out.println(car.getModel());

                    }
                }
            }

//            cars.forEach(e -> {
//                if (e.getCargo().getCargoType().equals("flamable")
//                        && e.getEngine().getEnginePower() > 250) {
//                    System.out.println(String.format("%s", e.getModel()));
//                }
//            });
        }
    }
}
