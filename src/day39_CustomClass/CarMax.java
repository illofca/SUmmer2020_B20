package day39_CustomClass;

public class CarMax {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

        car1.setCarInfo("Lexus", "RX350", 2019, "White", 14000, 45000);
        car2.setCarInfo("Lexus", "RX450", 2020, "Black", 10000, 55000);
        car3.setCarInfo("Toyota", "Camry", 2019, "Silver", 4000, 25000);
        car4.setCarInfo("Honda", "CR-V", 2015, "Green", 54000, 26000);
        car5.setCarInfo("Bugatti", "Veyron", 2018, "Blue", 25000, 20000);

        car1.getCarInfo();
        car2.getCarInfo();
        car3.getCarInfo();
        car4.getCarInfo();
        car5.getCarInfo();

        car3.start();


    }
}
