public class Vehicle {
        private String brand;
        private String model;
        private int year;

        public Vehicle(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        public void start() {
            System.out.println("Машина заведена.");
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public int getYear() {
            return year;
        }

//    public class Car extends Vehicle {
//        private int numberOfDoors;
//
//        public Car(String make, String model, int year, int numberOfDoors) {
//            super(make, model, year);
//            this.numberOfDoors = numberOfDoors;
//        }
//
//        public int getNumberOfDoors() {
//            return numberOfDoors;
//        }
//    }

//    public class Main {
//        public static void main(String[] args) {
//            Car car = new Car("Tesla", "Model S", 2021, 4);
//            car.start();
//
//            System.out.println("Make: " + car.getMake());
//            System.out.println("Model: " + car.getModel());
//            System.out.println("Year: " + car.getYear());
//            System.out.println("Number of doors: " + car.getNumberOfDoors());
//        }
//    }
    //При запуске этого кода будет создан объект
    // класса Car с маркой "Tesla", моделью "Model S",
    // годом выпуска 2021 и количеством дверей 4.
    // Далее будет вызван метод start() для запуска автомобиля,
    // а затем будут выведены на экран марка, модель,
    // год выпуска и количество дверей автомобиля.
}
